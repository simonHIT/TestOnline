package com.testOnline.controller;

import com.testOnline.common.Result;
import com.testOnline.service.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/paper")
@Scope("request")
public class PaperController {
    @Autowired
    private IPaperService PaperService;

    private Result result=new Result();

    /**根据题目id返回正确答案，Path解析url中的信息*/
    @RequestMapping(value = "/real-answer/{question-id}",method = RequestMethod.GET)
    public Result searchRealAnswer(@PathVariable(value = "question-id")Integer questionId){
        String answer=PaperService.getQuestionAnswerByQuestionId(questionId);
        result.setEntity(answer);
        return result;
    }

    @RequestMapping(value = "/mine-answer",method = RequestMethod.GET)
    public Result searchMineAnswer(@RequestParam(value = "questionId")Integer questionId,
                                   @RequestParam(value = "paperId")Integer paperId,
                                   @RequestParam(value = "userId")Integer userId){
        String answer=PaperService.getMineQuestionAnserByQuestionId(questionId, paperId, userId);
        result.setEntity(answer);
        return result;
    }

    /**交卷时前台传来的数据应该是一个List<String>的answer的集合等*/
    @RequestMapping(value="/submit",method = RequestMethod.POST)
    public Result submitPaper(@RequestParam(value="answerList")List<String>answerList,
                              @RequestParam(value = "questionIdList")List<Integer> questionIdList,
                              @RequestParam(value = "paperId")Integer paperId,
                              @RequestParam(value = "userId")Integer userId){
        int result=PaperService.addMineQuestionAnserByQuestionId(answerList, questionIdList, paperId, userId);
        if(result>0) {
            this.result.setSuccess("交卷成功");
        }
        else {
            this.result.setError("交卷失败");
        }

        return this.result;
    }
}
