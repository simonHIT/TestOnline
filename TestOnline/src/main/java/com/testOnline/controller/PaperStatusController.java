package com.testOnline.controller;

import com.testOnline.common.Result;
import com.testOnline.model.Option;
import com.testOnline.model.Question;
import com.testOnline.model.QuestionOption;
import com.testOnline.model.TestPaperState;
import com.testOnline.service.IPaperStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/testpaper")
@Scope("request")
public class PaperStatusController {

    @Autowired
    IPaperStatusService iPaperStatusService;

    private Result result = new Result();

    @RequestMapping(value = "/getAllsubject", method = RequestMethod.GET)
    @ResponseBody
    public Result searchAllsubject(@RequestParam(value = "paperid") Integer paperid){
        ArrayList<Question> answer=iPaperStatusService.getAllQuestionByPaperId(paperid);
        result.setDataList(answer);
        return result;
    }

    @RequestMapping(value = "/getOptions",method = RequestMethod.GET)
    @ResponseBody
    public Result searchOptions(@RequestParam(value = "questionId") Integer questionId){
        List<QuestionOption> answer = iPaperStatusService.getOptions(questionId);
        result.setDataList(answer);
        return result;
    }

    @RequestMapping(value = "/getPapers",method = RequestMethod.GET)
    public  Result searchPapers(@RequestParam(value = "courseId") Integer courseId,
                                 @RequestParam(value = "userId") Integer userId){
        List<TestPaperState> answer = iPaperStatusService.getpapers(courseId,userId);
        result.setDataList(answer);
        return result;
    }
}
