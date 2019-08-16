package com.testOnline.controller;

import com.testOnline.common.Result;
import com.testOnline.model.QuestionWithBLOBs;
import com.testOnline.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@Scope("request")
public class QuestionController {

    @Autowired
    private IQuestionService questionService;

    private Result result=new Result();

    /**
     * 添加题目
     * @RequestParam(value = "queInfo") String queInfo 试题信息,
     * @RequestParam(value = "queTag") String  queTag 试题类型（0 选择，1 简答）,
     * @RequestParam(value = "courseId") Integer courseId 课程id,
     * @RequestParam(value = "aueAns") String queAns 试题参考答案,
     * @RequestParam(value = "queValue") String queValue 试题分值,
     * @RequestParam(value = "queRank") String queRank 试题难度,
     * @RequestParam(value = "options",required = false 试题选项 （如果是选择题，需要此参数）
     *
     *
     */
    @RequestMapping(value = "/add",method =RequestMethod.POST )
    public Result addQuestion(@RequestParam(value = "queInfo") String queInfo,
                              @RequestParam(value = "queTag") String  queTag,
                              @RequestParam(value = "courseId") Integer courseId,
                              @RequestParam(value = "aueAns") String queAns,
                              @RequestParam(value = "queValue") String queValue,
                              @RequestParam(value = "queRank") String queRank,
                                  @RequestParam(value = "options",required = false) List<String> options){

        int result=questionService.addQuestion(queInfo,queTag,courseId,queAns,queValue,queRank,options);

        if (result>0){
            this.result.setSuccess("添加成功！");
        }
        else {
            this.result.setError("添加失败！");
        }

        return this.result;
    }


    /**
     *
     * @param num quiz中试题的数目
     * @return 题目的列表 类型是HashMap<Question,List<Option>>类型。
     */
    @RequestMapping(value = "/showQuiz",method = RequestMethod.POST)

    public Result createQuiz(@RequestParam(value = "num")Integer num,
                             @RequestParam(value = "courseId")Integer courseId){

        List<QuestionWithBLOBs> questions =questionService.getQuestionsForQuiz(num,courseId);

        this.result.setDataList(questions);

        return result;
    }

}
