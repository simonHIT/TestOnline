package com.testOnline.dao;

import com.testOnline.model.TestPaperState;
import com.testOnline.model.TestPaperStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPaperStateMapper {
    long countByExample(TestPaperStateExample example);

    int deleteByExample(TestPaperStateExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(TestPaperState record);

    int insertSelective(TestPaperState record);

    List<TestPaperState> selectByExample(TestPaperStateExample example);

    TestPaperState selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") TestPaperState record, @Param("example") TestPaperStateExample example);

    int updateByExample(@Param("record") TestPaperState record, @Param("example") TestPaperStateExample example);

    int updateByPrimaryKeySelective(TestPaperState record);

    int updateByPrimaryKey(TestPaperState record);
}