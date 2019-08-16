package com.testOnline.service.impl;

import com.testOnline.dao.*;
import com.testOnline.model.*;
import com.testOnline.service.IDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("IDeleteService")
public class DeleteServiceImpl implements IDeleteService {
    @Autowired
    TestPaperScoreHasQuestionMapper testPaperScoreHasQuestionMapper;

    TestPaperScoreHasQuestionExample testPaperScoreHasQuestionExample = new TestPaperScoreHasQuestionExample();

    @Autowired
    QuestionMapper questionMapper;

    QuestionExample questionExample = new QuestionExample();

    @Autowired
    QuestionOptionMapper questionOptionMapper;

    QuestionOptionExample questionOptionExample = new QuestionOptionExample();

    @Autowired
    SelectCourseMapper selectCourseMapper;

    SelectCourseExample selectCourseExample = new SelectCourseExample();

    @Autowired
    UserMapper userMapper;

    UserExample userExample = new UserExample();

    @Override
    public int DeleteQueByQueId(List<Integer> queId){
        for(int i=0;i<queId.size();i++) {
            testPaperScoreHasQuestionExample.clear();
            testPaperScoreHasQuestionExample.or().andQuestionQueIdEqualTo(queId.get(i));
            int length = testPaperScoreHasQuestionMapper.selectByExample(testPaperScoreHasQuestionExample).size();
            if(length>=1){
                return -1;
            }
        }
        for(int i=0;i<queId.size();i++){

            questionExample.clear();
            questionExample.or().andQueIdEqualTo(queId.get(i));
            String x = questionMapper.selectByExample(questionExample).get(i).getQueTag();

            if(x.equals("0")){
                questionOptionExample.clear();
                questionOptionExample.or().andQueIdEqualTo(queId.get(i));
                questionOptionMapper.deleteByExample(questionOptionExample);
            }
            questionMapper.deleteByExample(questionExample);
        }


        return 200;
    }

    @Override
    public int DeleteCourse(Integer userId,Integer courseId){
        selectCourseExample.clear();
        selectCourseExample.or().andCourseIdEqualTo(courseId).andUserIdEqualTo(userId);

        int x = selectCourseMapper.deleteByExample(selectCourseExample);

        return x;
    }

    @Override
    public  List<User> UserInformation(Integer userId){
        List<User> users = new ArrayList<>();
        userExample.clear();
        userExample.or().andUserIdEqualTo(userId);
        users = userMapper.selectByExample(userExample);
        return users;
    }
}
