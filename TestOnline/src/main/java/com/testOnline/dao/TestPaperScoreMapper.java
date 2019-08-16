package com.testOnline.dao;

import com.testOnline.model.TestPaperScore;
import com.testOnline.model.TestPaperScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPaperScoreMapper {
    long countByExample(TestPaperScoreExample example);

    int deleteByExample(TestPaperScoreExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(TestPaperScore record);

    int insertSelective(TestPaperScore record);

    List<TestPaperScore> selectByExample(TestPaperScoreExample example);

    TestPaperScore selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") TestPaperScore record, @Param("example") TestPaperScoreExample example);

    int updateByExample(@Param("record") TestPaperScore record, @Param("example") TestPaperScoreExample example);

    int updateByPrimaryKeySelective(TestPaperScore record);

    int updateByPrimaryKey(TestPaperScore record);

    /**
     *  获取表中全部数据
     * @return
     */
    int selectCnt();
}