package com.testOnline.dao;

import com.testOnline.model.CourseResources;
import com.testOnline.model.CourseResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseResourcesMapper {
    long countByExample(CourseResourcesExample example);

    int deleteByExample(CourseResourcesExample example);

    int deleteByPrimaryKey(Integer resourcesId);

    int insert(CourseResources record);

    int insertSelective(CourseResources record);

    List<CourseResources> selectByExample(CourseResourcesExample example);

    CourseResources selectByPrimaryKey(Integer resourcesId);

    int updateByExampleSelective(@Param("record") CourseResources record, @Param("example") CourseResourcesExample example);

    int updateByExample(@Param("record") CourseResources record, @Param("example") CourseResourcesExample example);

    int updateByPrimaryKeySelective(CourseResources record);

    int updateByPrimaryKey(CourseResources record);
}