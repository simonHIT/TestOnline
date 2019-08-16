package com.TestOnline.JUnit;

import com.testOnline.model.Course;
import com.testOnline.service.impl.CourseServiceImpl;
import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CourseServiceImplTest {
    CourseServiceImpl courseService = new CourseServiceImpl();

    @Test
    public void getAllCourses() throws Exception {
        List list = courseService.getAllCourses();
        assertNotNull(list);
    }

    @Test
    public void searchCourseByCourseName() throws Exception {
        List<Course> courselist = new ArrayList();
        courselist = courseService.getAllCourses();
        List<Course> list = new ArrayList();

        for(int i=0;i<courselist.size();i++){
            list = courseService.searchCourseByCourseName(courselist.get(i).getCourseName());
            assertNotNull(list);
        }
        for(int i=0;i<courselist.size();i++){
            String name = courselist.get(i).getCourseName();
            String testname = "qqaazzaq";

            if(!testname.equals(name)){
                list = courseService.searchCourseByCourseName(testname);
                assertNull(list);
            }
        }



    }

    @Test
    public void searchCourseByTeacher() throws Exception {
        List<Course> courselist = new ArrayList();
        courselist = courseService.getAllCourses();
        List<Course> list = new ArrayList();

        for(int i=0;i<courselist.size();i++){
            list = courseService.searchCourseByTeacher(courselist.get(i).getUserId());
            assertNotNull(list);
        }
        for(int i=0;i<courselist.size();i++){
            Integer teacherid = courselist.get(i).getUserId();
            Integer testname = 4578964;

            if(testname != teacherid){
                list = courseService.searchCourseByTeacher(testname);
                assertNull(list);
            }
        }
    }

    @Test
    public void selectCourse() throws Exception {
        /*Boolean res = courseService.selectCourse(1,1);
        assertEquals(true,res);*/

    }

    @Test
    public void getTeacherIdByName() throws Exception {
        Integer id = courseService.getTeacherIdByName("noname");
        assertNull(id);

    }

    @Test
    public void getCourseIdByCourseName() throws Exception {
        List<Course> courselist = new ArrayList();
        courselist = courseService.getAllCourses();
        Integer id;

        for(int i=0;i<courselist.size();i++){
            id = courseService.getCourseIdByCourseName(courselist.get(i).getCourseName());
            assertNotNull(id);
        }
        for(int i=0;i<courselist.size();i++){
            String name = courselist.get(i).getCourseName();
            String testname = "noname";

            if(!testname.equals(name)){
                id = courseService.getCourseIdByCourseName(testname);
                assertNull(id);
            }
        }
    }

    @Test
    public void getAllCourseByteaId() throws Exception {
        List<Course> courselist = new ArrayList();
        courselist = courseService.getAllCourses();
        List<Course> list = new ArrayList();

        for(int i=0;i<courselist.size();i++){
            list = courseService.getAllCourseByteaId(courselist.get(i).getUserId());
            assertNotNull(list);
        }
        for(int i=0;i<courselist.size();i++){
            Integer teacherid = courselist.get(i).getUserId();
            Integer testname = 4578964;

            if(testname != teacherid){
                list = courseService.getAllCourseByteaId(testname);
                assertNull(list);
            }
        }
    }

    @Test
    public void getAllCoursesBystuId() throws Exception {

        List<Course> list = new ArrayList();
        list = courseService.getAllCoursesBystuId(88877);
        assertNotNull(list);


    }

    @Test
    public void newMyCourse() throws Exception {
        /*Course course = new Course();
        course.setCourseImg("aaa");
        course.setCourseInfo("aaa");
        course.setCourseName("testcourse");
        course.setCourseTag("aaa");
        course.setUserId(2);
        int res = courseService.newMyCourse(course);
        assertNotEquals(0,res);*/
    }

    @Test
    public void isSelect() throws Exception {
       /* int res;
        res = courseService.isSelect(1,1);
        assertNotEquals(0,res);*/
    }

}