package com.testOnline.service;

import com.testOnline.model.Option;
import com.testOnline.model.Question;
import com.testOnline.model.QuestionOption;
import com.testOnline.model.TestPaperState;

import java.util.ArrayList;
import java.util.List;

public interface IPaperStatusService {
    public ArrayList<Question> getAllQuestionByPaperId(Integer paperId);

    public List<QuestionOption> getOptions(Integer questionId);

    public List<TestPaperState> getpapers(Integer courseId, Integer userId);

}
