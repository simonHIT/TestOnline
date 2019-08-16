package com.testOnline.dao;

import com.testOnline.model.Question;
import com.testOnline.model.QuestionExample;
import com.testOnline.model.QuestionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {
    long countByExample(QuestionExample example);

    int deleteByExample(QuestionExample example);

    int deleteByPrimaryKey(Integer queId);

    int insert(QuestionWithBLOBs record);

    int insertSelective(QuestionWithBLOBs record);

    List<QuestionWithBLOBs> selectByExampleWithBLOBs(QuestionExample example);

    List<Question> selectByExample(QuestionExample example);

    QuestionWithBLOBs selectByPrimaryKey(Integer queId);

    int updateByExampleSelective(@Param("record") QuestionWithBLOBs record, @Param("example") QuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionWithBLOBs record, @Param("example") QuestionExample example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByPrimaryKeySelective(QuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionWithBLOBs record);

    int updateByPrimaryKey(Question record);
}