package com.testOnline.service;

import org.springframework.stereotype.Service;

import java.util.List;


public interface IPaperService {
    public String getQuestionAnswerByQuestionId(Integer questionId);
    public String getMineQuestionAnserByQuestionId(Integer questionId,Integer paperId,Integer userId);
    public Integer addMineQuestionAnserByQuestionId(List<String> answerList,List<Integer> questionIdList, Integer paperId, Integer userId);
}
