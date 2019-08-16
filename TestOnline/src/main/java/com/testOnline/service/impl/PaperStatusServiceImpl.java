package com.testOnline.service.impl;

import com.testOnline.dao.*;
import com.testOnline.model.*;
import com.testOnline.service.IPaperStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("IPaperStatusService")
public class PaperStatusServiceImpl implements IPaperStatusService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TestPaperScoreHasQuestionMapper testPaperScoreHasQuestionMapper;

    @Autowired
    private QuestionOptionMapper optionMapper;

    @Autowired
    private TestPaperScoreMapper testPaperScoreMapper;

    @Autowired
    private TestPaperStateMapper testPaperStateMapper;


    TestPaperScoreHasQuestionExample testPaperScoreHasQuestionExample = new TestPaperScoreHasQuestionExample();

    QuestionOptionExample optionExample = new QuestionOptionExample();

    TestPaperScoreExample testPaperScoreExample = new TestPaperScoreExample();

    TestPaperStateExample testPaperStateExample = new TestPaperStateExample();


    /*
     *
     * @param paperid
     * 卷子ID
     * @return
     * 题目ArrayList
     */
    @Override
    public ArrayList<Question> getAllQuestionByPaperId(Integer paperId) {
        ArrayList<Question> questions = new ArrayList<Question>();

        testPaperScoreHasQuestionExample.clear();
        testPaperScoreHasQuestionExample.or().andTestPaperScoreRecordIdEqualTo(paperId);
        Integer answerSize = testPaperScoreHasQuestionMapper.selectByExample(testPaperScoreHasQuestionExample).size();
        Integer answer[] = new Integer[answerSize];
        String answers[] = new String[answerSize];
        for(int i=0;i <answerSize ;i++){
            answer[i] = testPaperScoreHasQuestionMapper.selectByExample(testPaperScoreHasQuestionExample).get(i).getQuestionQueId();
            answers[i] = questionMapper.selectByPrimaryKey(answer[i]).getQueInfo();
            questions.add(i,questionMapper.selectByPrimaryKey(answer[i]));
        }
        return questions;
    }

    /**
     *
     * @param questionId
     * 题目ID
     * @return
     * 选项列表
     */
    @Override
    public List<QuestionOption> getOptions(Integer questionId){
        List<QuestionOption> myoptions= new ArrayList();

        optionExample.clear();
        optionExample.or().andQueIdEqualTo(questionId);
        myoptions = optionMapper.selectByExample(optionExample);

        return myoptions;
    }

    /**
     *
     * @param courseId
     * 课程号
     * @return
     * 卷子编号LIST
     */
    @Override
    public List<TestPaperState> getpapers(Integer courseId,Integer userId){
        List<TestPaperState> mypapers = new ArrayList<>();

        List<TestPaperScore> Allpaper = new ArrayList<>();

        testPaperScoreExample.clear();
        testPaperScoreExample.or().andCourseIdEqualTo(courseId);

        Allpaper = testPaperScoreMapper.selectByExample(testPaperScoreExample);



        for(int i = 0 ; i<Allpaper.size();i++){
            testPaperStateExample.clear();
            testPaperStateExample.or().andTestPaperIdEqualTo(Allpaper.get(i).getRecordId()) .andUserIdEqualTo(userId);
            if(testPaperStateMapper.selectByExample(testPaperStateExample).size() > 0){
                mypapers.add(testPaperStateMapper.selectByExample(testPaperStateExample).get(0));
            }
            else {
                TestPaperState state = new TestPaperState();
                state.setTestPaperId(Allpaper.get(i).getRecordId());
                state.setState("0");
                mypapers.add(state);
            }

        }

        return mypapers;

    }
}
