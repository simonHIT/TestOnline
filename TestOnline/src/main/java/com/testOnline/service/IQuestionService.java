package com.testOnline.service;

import com.testOnline.model.QuestionOption;
import com.testOnline.model.QuestionWithBLOBs;

import java.util.List;

public interface IQuestionService {

    public Integer addQuestion(String que_info, String queTag, Integer courseId, String queAns, String queValue, String queRank, List<String> options);

    public List<QuestionWithBLOBs> getQuestionsForQuiz(Integer num, Integer courseId);

    public List<QuestionOption> getOptions(Integer queId);
}
