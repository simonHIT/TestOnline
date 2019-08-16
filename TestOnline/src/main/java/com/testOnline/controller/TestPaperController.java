package com.testOnline.controller;
import com.testOnline.common.Result;
import com.testOnline.model.Question;
import com.testOnline.model.QuestionWithBLOBs;
import com.testOnline.model.TestPaperScore;
import com.testOnline.model.TestPaperToQuestion;
import com.testOnline.service.IPaperService;
import com.testOnline.service.ITestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/paperservice")
@Scope("request")
public class TestPaperController {

    @Autowired
    private ITestPaperService iTestPaperService;

    private Result result=new Result();

    /**
     * 功能 ： 获取当前课程下的全部题目
     * @param courseId 课程id
     * @return
     */
    @RequestMapping(value = "/getQ/{courseId}",method = RequestMethod.GET)
    @ResponseBody
    public Result searchRealAnswer(@PathVariable(value = "courseId")Integer courseId){

        List<QuestionWithBLOBs> questions = iTestPaperService.getAllQuestionByCourse(courseId);

        result.setDataList(questions);

        return result;
    }

    /**
     * 功能：出卷
     * @param courseId  课程编号
     * @param questionIdList  题目编号
     * @return
     */
    @RequestMapping(value="/submit",method = RequestMethod.POST)
    @ResponseBody
    public Result submitPaper(@RequestParam(value="courseId")Integer courseId,
                              @RequestParam(value = "questionIdList")List<Integer> questionIdList){
        int result = iTestPaperService.addTestPaperFromCourse(courseId,questionIdList);
        if(result>0) {
            this.result.setSuccess("出卷成功");
        }
        else {
            this.result.setError("出卷失败");
        }
        return this.result;
    }


    /**
     * 评分
     * @param paperId
     * @param userId
     * @param quesIdList
     * @param scoresList
     * @return
     */

    @RequestMapping(value="/point",method = RequestMethod.POST)
    @ResponseBody
    public Result pointPaper(@RequestParam(value="paperId")Integer paperId,
                              @RequestParam(value = "userId")Integer userId,
                             @RequestParam(value="quesIdList")List<Integer> quesIdList,
                             @RequestParam(value = "scoresList")List<String> scoresList){
        int result = iTestPaperService.pointPaperScore(paperId,userId);

        if(result>0) {
            int r = 0;
            r = iTestPaperService.submitPaperScore(paperId,userId,quesIdList,scoresList);
            if (r >0){
                this.result.setSuccess("评卷成功");
            }else {
                this.result.setError("评卷失败");
            }
        }
        else {
            this.result.setError("评卷失败");
        }
        return this.result;
    }


    @RequestMapping(value="/minq",method = RequestMethod.GET)
    @ResponseBody
    public Result getMinQuestion(@RequestParam(value="paperId")Integer paperId,
                             @RequestParam(value = "userId")Integer userId){
        List<TestPaperToQuestion> list = iTestPaperService.getMineQuestion(paperId,userId);
        result.setDataList(list);
        return this.result;
    }

    @RequestMapping(value="/allpaper",method = RequestMethod.GET)
    @ResponseBody
    public Result getAllPaperCourse(@RequestParam(value="courseId")Integer courseId){
        List<TestPaperScore> list = iTestPaperService.getAllTestPaperForCourse(courseId);
        result.setDataList(list);
        return this.result;
    }

}
