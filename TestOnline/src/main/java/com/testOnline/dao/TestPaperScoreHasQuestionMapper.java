package com.testOnline.dao;

import com.testOnline.model.TestPaperScoreHasQuestionExample;
import com.testOnline.model.TestPaperScoreHasQuestionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPaperScoreHasQuestionMapper {
    long countByExample(TestPaperScoreHasQuestionExample example);

    int deleteByExample(TestPaperScoreHasQuestionExample example);

    int deleteByPrimaryKey(TestPaperScoreHasQuestionKey key);

    int insert(TestPaperScoreHasQuestionKey record);

    int insertSelective(TestPaperScoreHasQuestionKey record);

    List<TestPaperScoreHasQuestionKey> selectByExample(TestPaperScoreHasQuestionExample example);

    int updateByExampleSelective(@Param("record") TestPaperScoreHasQuestionKey record, @Param("example") TestPaperScoreHasQuestionExample example);

    int updateByExample(@Param("record") TestPaperScoreHasQuestionKey record, @Param("example") TestPaperScoreHasQuestionExample example);

    int insertTestPaperHasQList(List<TestPaperScoreHasQuestionKey> list);


}