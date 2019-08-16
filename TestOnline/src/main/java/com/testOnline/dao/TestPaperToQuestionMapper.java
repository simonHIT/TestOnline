package com.testOnline.dao;

import com.testOnline.model.TestPaperToQuestion;
import com.testOnline.model.TestPaperToQuestionExample;
import com.testOnline.model.TestPaperToQuestionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPaperToQuestionMapper {
    long countByExample(TestPaperToQuestionExample example);

    int deleteByExample(TestPaperToQuestionExample example);

    int deleteByPrimaryKey(TestPaperToQuestionKey key);

    int insert(TestPaperToQuestion record);

    int insertSelective(TestPaperToQuestion record);

    List<TestPaperToQuestion> selectByExampleWithBLOBs(TestPaperToQuestionExample example);

    List<TestPaperToQuestion> selectByExample(TestPaperToQuestionExample example);

    TestPaperToQuestion selectByPrimaryKey(TestPaperToQuestionKey key);

    int updateByExampleSelective(@Param("record") TestPaperToQuestion record, @Param("example") TestPaperToQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TestPaperToQuestion record, @Param("example") TestPaperToQuestionExample example);

    int updateByExample(@Param("record") TestPaperToQuestion record, @Param("example") TestPaperToQuestionExample example);

    int updateByPrimaryKeySelective(TestPaperToQuestion record);

    int updateByPrimaryKeyWithBLOBs(TestPaperToQuestion record);

    int updateByPrimaryKey(TestPaperToQuestion record);

    int updateTestPaperHasQList(List<TestPaperToQuestion> list);
}