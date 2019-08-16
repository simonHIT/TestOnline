package com.testOnline.service.impl;

import com.testOnline.dao.CourseResourcesMapper;
import com.testOnline.model.CourseResources;
import com.testOnline.model.CourseResourcesExample;
import com.testOnline.service.ICourseResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ICourseResourceService")
public class CourseResourceServiceImpl implements ICourseResourceService {

    @Autowired
    CourseResourcesMapper courseResourcesMapper;

    public List<CourseResources> getAll(Integer courseId){
        CourseResourcesExample courseResourcesExample = new CourseResourcesExample();
        courseResourcesExample.clear();
        courseResourcesExample.or().andCourseidEqualTo(courseId);
        List<CourseResources> courseResources = courseResourcesMapper.selectByExample(courseResourcesExample);
        return courseResources;
    }

    public Integer addResource(CourseResources courseResources){
        int row = courseResourcesMapper.insertSelective(courseResources);
        return row;
    }

    public Integer deleteResource(Integer sources){
        int row = courseResourcesMapper.deleteByPrimaryKey(sources);
        return  row;
    }
}
