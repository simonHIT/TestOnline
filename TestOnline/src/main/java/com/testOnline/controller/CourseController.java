package com.testOnline.controller;

import com.testOnline.common.Result;
import com.testOnline.model.Course;
import com.testOnline.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
@Scope("request")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    private Result result = new Result();

    /*得到所有课程，返回list*/
    @RequestMapping(value = "/showCourse",method = RequestMethod.GET)
    public Result getAllCourse(){
        List<Course> courseList = courseService.getAllCourses();
        if(courseList != null) {
            result.setDataList(courseList);
        }
        else {
            result.setDataList(null);
        }
        return result;
    }


    /*检索课程，根据课程名称或教师*/
    @RequestMapping(value = "/searchCourse",method = RequestMethod.GET)
    public Result searchCourse(@RequestParam(value = "searchInput",required = false)String inputdata,
                               @RequestParam(value = "sType",required = false)String type){

        if(type.equals("coursename") && !inputdata.equals("")){
            result.setDataList(courseService.searchCourseByCourseName(inputdata));
        }
        else if(type.equals("teacher") && !inputdata.equals("")){
            Integer teacherId = courseService.getTeacherIdByName(inputdata);
            result.setDataList(courseService.searchCourseByTeacher(teacherId));
        }
        else{
            result.setError("UnKnown Error!");
        }
        return  result;
    }

    /*选课，存入选课表*/
    @RequestMapping(value = "selectCourse",method = RequestMethod.GET)
    public Result selectCourse(@RequestParam(value = "courseId")Integer courseId,
                               @RequestParam(value = "userId")Integer userId){
//        Integer courseId = courseService.getCourseIdByCourseName(coursename);

        Boolean re =  courseService.selectCourse(courseId,userId);
        if (re == true){
            result.setSuccess("选课成功");
        }
        else {
            result.setError("选课失败");
        }
        return result;
    }

    @RequestMapping(value = "/teaCourse",method = RequestMethod.GET)
    public Result teaCourse(@RequestParam(value = "userId")Integer userId){
        result.setDataList(courseService.getAllCourseByteaId(userId));
        return result;
    }


    @RequestMapping(value = "/stuCourse",method = RequestMethod.GET)
    public Result stuCourse(@RequestParam(value = "userId")Integer userId){
        result.setDataList(courseService.getAllCoursesBystuId(userId));
        return result;
    }

    @RequestMapping(value = "/addCourse",method = RequestMethod.POST)
    public Result stuCourse(@RequestParam(value = "userId")Integer userId,
                            @RequestParam(value = "courseName") String courseName,
                            @RequestParam(value = "courseInfo") String courseInfo,
                            @RequestParam(value = "courseTag") String courseTag,
                            @RequestParam(value = "img") String img){
        Course course = new Course();
        course.setCourseImg(img);
        course.setCourseInfo(courseInfo);
        course.setCourseName(courseName);
        course.setCourseTag(courseTag);
        course.setUserId(userId);

        int row = courseService.newMyCourse(course);

        if(row > 0){
            result.setSuccess("添加成功");
        }else {
            result.setError("失败");
        }
        return  result;
    }

    @RequestMapping(value = "/isSelect",method = RequestMethod.GET)
    public Result isSelect(@RequestParam(value = "courseId")Integer courseId,
                           @RequestParam(value = "userId")Integer userId){

        int row = 0;

        row += courseService.isSelect(userId,courseId);

        if(row > 0){
            result.setSuccess("已添加");
        }else {
            result.setError("未添加");
        }
        return  result;
    }

    @RequestMapping(value = "/getCourseInfo",method = RequestMethod.GET)
    public Result getResult(@RequestParam(value = "courseId")Integer courseId){

        List<Course> courses = courseService.getCourseInfo(courseId);
        if (courses.size() > 0){
            result.setEntity(courses.get(0));
        }else {
            result.setError("no found");
        }
        return result;
    }

    @RequestMapping(value = "/getbyType",method = RequestMethod.GET)
    public Result getCourseByType(@RequestParam(value = "type")String type){

        List<Course> courses = courseService.getCourseByType(type);
        if (courses.size() > 0){
            result.setDataList(courses);
        }else {
            result.setError("no found");
        }
        return result;
    }
}
