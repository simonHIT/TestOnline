package com.testOnline.controller;


import com.testOnline.common.Result;
import com.testOnline.model.User;
import com.testOnline.service.IDeleteService;
import com.testOnline.service.impl.DeleteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;
import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping(value = "/deletes")
@Scope("request")
public class DeleteController {

    Result result = new Result();

    @Autowired
    IDeleteService deleteService;

    @RequestMapping(value = "/deletequeId",method = RequestMethod.POST)
    public Result deleteQueByQueId(@RequestParam(value = "queId") List<Integer> queId ){
        int status = deleteService.DeleteQueByQueId(queId);
        result.setEntity(status);
        return result;
    }

    @RequestMapping(value = "/deleteCourse",method = RequestMethod.POST)
    public Result deleteCourseById(@RequestParam(value = "userId") Integer userId,
                                   @RequestParam(value = "courseId") Integer courseId){
        int x = deleteService.DeleteCourse(userId,courseId);
        result.setEntity(x);
        return result;
    }

    @RequestMapping(value = "/userInformation",method = RequestMethod.GET)
    public Result userInformation(@RequestParam(value = "userId") Integer userId){
        List<User> users = deleteService.UserInformation(userId);
        result.setEntity(users);
        return result;
    }
}
