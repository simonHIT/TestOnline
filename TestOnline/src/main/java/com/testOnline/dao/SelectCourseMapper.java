package com.testOnline.dao;

import com.testOnline.model.SelectCourse;
import com.testOnline.model.SelectCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectCourseMapper {
    long countByExample(SelectCourseExample example);

    int deleteByExample(SelectCourseExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(SelectCourse record);

    int insertSelective(SelectCourse record);

    List<SelectCourse> selectByExample(SelectCourseExample example);

    SelectCourse selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") SelectCourse record, @Param("example") SelectCourseExample example);

    int updateByExample(@Param("record") SelectCourse record, @Param("example") SelectCourseExample example);

    int updateByPrimaryKeySelective(SelectCourse record);

    int updateByPrimaryKey(SelectCourse record);
}