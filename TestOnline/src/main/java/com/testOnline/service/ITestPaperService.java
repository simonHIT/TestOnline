package com.testOnline.service;

import com.testOnline.model.QuestionWithBLOBs;
import com.testOnline.model.TestPaperScore;
import com.testOnline.model.TestPaperToQuestion;
import org.springframework.stereotype.Service;
import com.testOnline.model.Question;
import java.util.List;

public interface ITestPaperService {

    public List<QuestionWithBLOBs> getAllQuestionByCourse(Integer courseId);

    public Integer addTestPaperFromCourse(Integer courseId,List<Integer> queId);

    public Integer pointPaperScore(Integer paperId,Integer userId);

    public Integer submitPaperScore(Integer paperId,Integer userId,List<Integer> quesId,List<String> scores);

    public List<TestPaperToQuestion> getMineQuestion(Integer paperId , Integer userId);

    public List<TestPaperScore> getAllTestPaperForCourse(Integer courseId);

}
