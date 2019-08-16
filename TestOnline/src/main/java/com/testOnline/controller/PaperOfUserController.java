package com.testOnline.controller;

import com.testOnline.common.Result;
import com.testOnline.model.TestPaperState;
import com.testOnline.service.IPaperOfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("papersfromstu")
public class PaperOfUserController {

    @Autowired
    private IPaperOfUserService paperOfUserService;

    private Result result;

    /**
     * 前台页面点击一个发布的考试试题，跳转到一个页面，列出所有学生做过的试卷
     * @param state 学生所做的试卷的状态
     * @param paperId 前台传过来的试题id
     * @return
     */

    @RequestMapping(value = "papers",method = RequestMethod.POST)
    public Result findAllpapersOfStu(@RequestParam("state")String state,
                                                   @RequestParam("paperId")Integer paperId){

        List<TestPaperState> papers=new ArrayList<TestPaperState>();

        papers=paperOfUserService.findAllUserPaperWithState(state,paperId);

        this.result=new Result();

        this.result.setDataList(papers);

        return result;
    }

}
