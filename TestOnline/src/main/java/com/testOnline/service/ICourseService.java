package com.testOnline.service;

import com.testOnline.model.Course;

import javax.persistence.criteria.CriteriaBuilder;
import java.awt.*;
import java.util.List;

public interface ICourseService {
    public List<Course> getAllCourses();
    public List<Course> searchCourseByCourseName(String courseName);
    public List<Course> searchCourseByTeacher(Integer teacherId);
    public Boolean selectCourse(Integer courseId, Integer userId);
    public Integer getTeacherIdByName(String teacherName);
    public Integer getCourseIdByCourseName(String courseName);
    public List<Course> getAllCoursesBystuId(Integer userId);
    public List<Course> getAllCourseByteaId(Integer userId);
    public Integer newMyCourse(Course course);
    public Integer isSelect(Integer userId, Integer courseId);
    public List<Course> getCourseInfo(Integer courseId);
    List<Course> getCourseByType(String type);
}
