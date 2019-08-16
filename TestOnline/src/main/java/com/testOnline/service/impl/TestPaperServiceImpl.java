package com.testOnline.service.impl;

import com.testOnline.dao.*;
import com.testOnline.model.*;
import com.testOnline.service.ITestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testOnline.common.Constant;
import com.testOnline.dao.QuestionMapper;
import com.testOnline.service.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Service("ITestPaperService")
public class TestPaperServiceImpl implements ITestPaperService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TestPaperScoreMapper testPaperScoreMapper;

    @Autowired
    private TestPaperScoreHasQuestionMapper testPaperScoreHasQuestionMapper;

    @Autowired
    private TestPaperToQuestionMapper testPaperToQuestionMapper;

    @Autowired
    private TestPaperStateMapper testPaperStateMapper;

    @Autowired
    private SelectCourseMapper selectCourseMapper;

    private QuestionExample questionExample = new QuestionExample();

    private TestPaperToQuestionExample testPaperToQuestionExample = new TestPaperToQuestionExample();

    private TestPaperState testPaperState = new TestPaperState();

    /**
     *  获取课程下全部题目
     * @param courseId 课程 id
     * @return
     */
    public List<QuestionWithBLOBs> getAllQuestionByCourse(Integer courseId){
        List<QuestionWithBLOBs> questions = new ArrayList();

        questionExample.clear();
        questionExample.or().andCourseIdEqualTo(courseId);

        questions = questionMapper.selectByExampleWithBLOBs(questionExample);

        return questions;
    }

    /**
     *  出卷函数
     * @param courseId 课程id
     * @param queId 题目id编号
     * @return
     */
    public Integer addTestPaperFromCourse(Integer courseId,List<Integer> queId){
        Integer rows = 0;

        TestPaperScore testPaperScore = new TestPaperScore();

        testPaperScore.setCourseId(courseId);

        Integer cnt = testPaperScoreMapper.selectCnt() + 1 ;
        testPaperScore.setRecordId(cnt);

        Integer row = testPaperScoreMapper.insertSelective(testPaperScore);

        if(row > 0){
            Integer recordId = testPaperScore.getRecordId();
            rows = cnt;
            List<TestPaperScoreHasQuestionKey> list = new ArrayList();
            for (Integer ques:queId) {
                TestPaperScoreHasQuestionKey testPaperScoreHasQuestionKey = new TestPaperScoreHasQuestionKey();
                testPaperScoreHasQuestionKey.setQuestionQueId(ques);
                testPaperScoreHasQuestionKey.setTestPaperScoreRecordId(recordId);
                list.add(testPaperScoreHasQuestionKey);
            }
            System.out.println(recordId);
            rows = testPaperScoreHasQuestionMapper.insertTestPaperHasQList(list);
        }
        return rows;
    }




    /**
     * 添加试卷状态
     * @param paperId
     * @param userId
     * @return
     */
    public Integer addPaperState(Integer paperId,Integer userId){
        int row = 0;

        TestPaperState testPaperState = new TestPaperState();

        testPaperState.setTestPaperId(paperId);

        testPaperState.setUserId(userId);

        testPaperState.setState("0");

        row += testPaperStateMapper.insert(testPaperState);

        return  row;
    }


    /**
     * 评分函数
     * @param paperId
     * @param userId
     * @param quesId
     * @param scores
     * @return
     */

    public Integer submitPaperScore(Integer paperId,Integer userId,List<Integer> quesId,List<String> scores){

        Integer rows = 0;

        Integer id = 0;

        for(int i = 0; i < quesId.size() ; i++){

            try{
                /**
                 *  根据 [quesId , paperId , userId] => [recordId ,test_paper_record_id]
                 *
                 *  [quesId , paperId , userId ]  => recordId = > update userValue = scores
                 *
                 */
                testPaperToQuestionExample.clear();

                testPaperToQuestionExample.or().andTestPaperScoreRecordIdEqualTo(paperId).andUserUserIdEqualTo(userId).andQuestionQueIdEqualTo(quesId.get(i));

                TestPaperToQuestion testPaperToQuestion  = testPaperToQuestionMapper.selectByExample(testPaperToQuestionExample).get(0);

                testPaperToQuestion.setUserGrade(scores.get(i));

                rows += testPaperToQuestionMapper.updateByPrimaryKeySelective(testPaperToQuestion);

                id = testPaperToQuestion.getTestPaperStateRecordId();

            }catch (Exception e){

            }

            if(rows > 0 && id > 0){

                testPaperState.setState("3");

                testPaperState.setUserId(userId);

                testPaperState.setTestPaperId(paperId);

                testPaperState.setRecordId(id);

                rows = testPaperStateMapper.updateByPrimaryKey(testPaperState);
            }
        }
        return rows;
    }

    /**
     * 选择题 判断 同时将 简答题盘设为0
     * @param paperId
     * @param userId
     * @return
     */
    public Integer pointPaperScore(Integer paperId,Integer userId){

        Integer rows = 0;
        try{
            /**
             *  获得全部的学生习题答案  [userId , paperId] => [ queId , userAns]
             *  [queId] => [realAns , queValue]
             *  if(userAns.equles(realAns))
             *      update userGrade = queValue
             *  else
             *      update userGrade = 0
             *
             */
            testPaperToQuestionExample.clear();

            testPaperToQuestionExample.or().andTestPaperScoreRecordIdEqualTo(paperId).andUserUserIdEqualTo(userId);

            List<TestPaperToQuestion> list  = testPaperToQuestionMapper.selectByExampleWithBLOBs(testPaperToQuestionExample);

            for (TestPaperToQuestion t:list) {
                Question q = questionMapper.selectByPrimaryKey(t.getQuestionQueId());

                if (((QuestionWithBLOBs) q).getQueAns().equals(t.getUserAns())){
                    t.setUserGrade(q.getQueValue());
                }else{
                    t.setUserGrade("0");
                }

                rows+= testPaperToQuestionMapper.updateByPrimaryKeySelective(t);
            }

        }catch (Exception e){

        }
        return  rows;
    }

    public List<TestPaperToQuestion> getMineQuestion(Integer paperId , Integer userId){
        testPaperToQuestionExample.clear();

        testPaperToQuestionExample.or().andTestPaperScoreRecordIdEqualTo(paperId).andUserUserIdEqualTo(userId);

        List<TestPaperToQuestion> list  = testPaperToQuestionMapper.selectByExampleWithBLOBs(testPaperToQuestionExample);

        return list;
    }

    public List<TestPaperScore> getAllTestPaperForCourse(Integer courseId){
        TestPaperScoreExample testPaperScoreExample = new TestPaperScoreExample();
        testPaperScoreExample.clear();
        testPaperScoreExample.or().andCourseIdEqualTo(courseId);
        List<TestPaperScore> list = testPaperScoreMapper.selectByExample(testPaperScoreExample);

        return list;
    }
}
