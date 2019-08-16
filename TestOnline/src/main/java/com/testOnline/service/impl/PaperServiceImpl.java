package com.testOnline.service.impl;

import com.testOnline.common.Constant;
import com.testOnline.dao.QuestionMapper;
import com.testOnline.dao.TestPaperStateMapper;
import com.testOnline.dao.TestPaperToQuestionMapper;
import com.testOnline.model.TestPaperState;
import com.testOnline.model.TestPaperToQuestion;
import com.testOnline.model.TestPaperToQuestionExample;
import com.testOnline.service.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IPaperService")
public class PaperServiceImpl implements IPaperService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TestPaperToQuestionMapper testPaperToQuestionMapper;

    @Autowired
    private TestPaperStateMapper testPaperStateMapper;

    TestPaperToQuestionExample testPaperToQuestionExample=new TestPaperToQuestionExample();

    @Override
    public String getQuestionAnswerByQuestionId(Integer questionId) {
        String answer=questionMapper.selectByPrimaryKey(questionId).getQueAns();
        return answer;
    }

    @Override
    public String getMineQuestionAnserByQuestionId(Integer questionId,Integer paperId,Integer userId) {
        testPaperToQuestionExample.clear();
        testPaperToQuestionExample.or().andQuestionQueIdEqualTo(questionId).andUserUserIdEqualTo(userId).andTestPaperScoreRecordIdEqualTo(paperId);
        String answer=testPaperToQuestionMapper.selectByExample(testPaperToQuestionExample).get(0).getUserAns();
        return answer;
    }

    @Override
    public Integer addMineQuestionAnserByQuestionId(List<String> answerList, List<Integer> questionIdList, Integer paperId, Integer userId) {
        Integer result=0;
        TestPaperState testPaperState=new TestPaperState();
        testPaperState.setState(Constant.finished);
        testPaperState.setUserId(userId);
        testPaperState.setTestPaperId(paperId);
        testPaperStateMapper.insertSelective(testPaperState);
        Integer recordId=testPaperState.getRecordId();//需要在mapper的insertSelective中加入一些字段才能获取id
        for(int i=0;i<answerList.size();i++){

            TestPaperToQuestion testPaperToQuestion=new TestPaperToQuestion();
            testPaperToQuestion.setQuestionQueId(questionIdList.get(i));
            testPaperToQuestion.setUserAns(answerList.get(i));
            testPaperToQuestion.setTestPaperScoreRecordId(paperId);
            testPaperToQuestion.setUserUserId(userId);
            testPaperToQuestion.setTestPaperStateRecordId(recordId);
            result=testPaperToQuestionMapper.insertSelective(testPaperToQuestion);
        }
        return result;
    }
}
