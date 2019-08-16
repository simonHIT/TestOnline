package com.testOnline.service.impl;

import com.testOnline.dao.CourseMapper;
import com.testOnline.dao.SelectCourseMapper;
import com.testOnline.dao.UserMapper;
import com.testOnline.model.*;
import com.testOnline.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ICourseService")
public class CourseServiceImpl implements ICourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private SelectCourseMapper selectCourseMapper;

    @Autowired
    private UserMapper userMapper;

    CourseExample courseExample = new CourseExample();
    UserExample userExample = new UserExample();

    @Override
    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        try {
            courseExample.clear();
            courseExample.or();
            courseList = courseMapper.selectByExampleWithBLOBs(courseExample);

        }catch(Exception e){
            System.out.println(e);
        }
        return courseList;
    }

    @Override
    public List<Course> searchCourseByCourseName(String courseName) {
        List<Course> courseList = new ArrayList<>();
        try {
            courseExample.clear();
            courseExample.or().andCourseNameLike(courseName);
            courseList = courseMapper.selectByExampleWithBLOBs(courseExample);
        }catch(Exception e){
            System.out.println(e);
        }
        return courseList;
    }

    @Override
    public List<Course> searchCourseByTeacher(Integer teacherId) {
        List<Course> courseList = new ArrayList<>();
        try {
            courseExample.clear();
            courseExample.or().andUserIdEqualTo(teacherId);
            courseList = courseMapper.selectByExample(courseExample);
        }catch(Exception e){
//            System.out.println(e);
        }
        return courseList;
    }

    @Override
    public Boolean selectCourse(Integer courseId, Integer userId) {
        try {
            SelectCourse selectcourse = new SelectCourse();
            selectcourse.setCourseId(courseId);
            selectcourse.setUserId(userId);
            selectCourseMapper.insert(selectcourse);
            return true;

        }catch(Exception e){
            return false;
        }

    }

    @Override
    public Integer getTeacherIdByName(String teacherName) {
        Integer teacherId = null;
        try {
            userExample.clear();
            userExample.or().andUserNameEqualTo(teacherName);
            teacherId = userMapper.selectByExample(userExample).get(0).getUserId();

        }catch(Exception e){
            System.out.println(e);
        }
        return teacherId;
    }

    @Override
    public Integer getCourseIdByCourseName(String courseName) {
        Integer courseId = null;
        try {
            courseExample.clear();
            courseExample.or().andCourseNameEqualTo(courseName);
            courseId = courseMapper.selectByExample(courseExample).get(0).getCourseId();
        }catch(Exception e){
            System.out.println(e);
        }
        return courseId;
    }

    @Override
    public List<Course> getAllCourseByteaId(Integer userId){
        List<Course> courses = new ArrayList<>();
        try {
            courseExample.clear();
            courseExample.or().andUserIdEqualTo(userId);
            courses = courseMapper.selectByExample(courseExample);
        }catch (Exception e){
//            System.out.println(e);
        }
        return  courses;
    }

    @Override
    public List<Course> getAllCoursesBystuId(Integer userId){

        List<SelectCourse> selectCourses = new ArrayList<>();
        List<Course> courses = new ArrayList<Course>();
        try {
            SelectCourseExample selectCourseExample = new SelectCourseExample();
            selectCourseExample.clear();
            selectCourseExample.or().andUserIdEqualTo(userId);

            selectCourses = selectCourseMapper.selectByExample(selectCourseExample);


            for (int i = 0; i < selectCourses.size(); i++) {
                int j = selectCourses.get(i).getCourseId();
                courseExample.clear();
                courseExample.or().andCourseIdEqualTo(selectCourses.get(i).getCourseId());
                if (courseMapper.selectByExample(courseExample).size() > 0) {
                    Course course = courseMapper.selectByExample(courseExample).get(0);
                    courses.add(course);
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return  courses;
    }

    @Override
    public Integer newMyCourse(Course course){
        int row = 0;
        try {
            row += courseMapper.insert(course);
        }catch (Exception e){
            System.out.println(e);
        }
        return row;
    }

    @Override
    public Integer isSelect(Integer userId, Integer courseId){
        int row = 0;
        try {
            SelectCourseExample selectCourseExample = new SelectCourseExample();
            selectCourseExample.clear();
            selectCourseExample.or().andUserIdEqualTo(userId).andCourseIdEqualTo(courseId);
            row += selectCourseMapper.selectByExample(selectCourseExample).size();
        }catch (Exception e){
            System.out.println(e);
        }
        return  row;
    }

    public List<Course> getCourseInfo(Integer courseId){
        CourseExample courseExample = new CourseExample();
        courseExample.clear();
        courseExample.or().andCourseIdEqualTo(courseId);
        List<Course> courses = courseMapper.selectByExampleWithBLOBs(courseExample);

        return courses;
    }

    public List<Course> getCourseByType(String type){

        CourseExample courseExample = new CourseExample();

        courseExample.clear();

        courseExample.or().andCourseTagEqualTo(type);

        List<Course> courses = courseMapper.selectByExampleWithBLOBs(courseExample);

        return courses;
    }

}
