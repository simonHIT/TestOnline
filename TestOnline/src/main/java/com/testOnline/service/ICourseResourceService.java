package com.testOnline.service;

import com.testOnline.model.CourseResources;

import java.util.List;

public interface ICourseResourceService {

    public List<CourseResources> getAll(Integer courseId);

    public Integer addResource(CourseResources courseResources);

    public Integer deleteResource(Integer sources);
}
