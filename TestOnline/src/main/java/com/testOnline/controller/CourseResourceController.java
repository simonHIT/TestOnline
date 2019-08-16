package com.testOnline.controller;

import com.testOnline.common.Result;
import com.testOnline.model.CourseResources;
import com.testOnline.service.ICourseResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/source")
@Scope("request")
public class CourseResourceController {
    @Autowired
    private ICourseResourceService courseResourceService;

    private Result result = new Result();


    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public Result getAllList(@RequestParam(value = "courseId")Integer courseId){
        List<CourseResources> courseResources = courseResourceService.getAll(courseId);

        result.setDataList(courseResources);

        return result;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addResources(@RequestParam(value = "courseId")Integer courseId,
                               @RequestParam(value = "resourcesName")String resourcesName,
                               @RequestParam(value = "resources")String resources ){
        CourseResources courseResources = new CourseResources();
        courseResources.setCourseid(courseId);
        courseResources.setResourcesname(resourcesName);
        courseResources.setResources(resources);

        int row = courseResourceService.addResource(courseResources);
        if(row > 0 ){
            result.setSuccess("添加成功");
        }else {
            result.setError("失败");
        }
        return result;
    }

}
