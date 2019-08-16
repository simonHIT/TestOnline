package com.testOnline.service.impl;

import com.testOnline.dao.TestPaperStateMapper;
import com.testOnline.model.TestPaperState;
import com.testOnline.model.TestPaperStateExample;
import com.testOnline.service.IPaperOfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("PaperOfUserService")

public class IPaperOfUserServiceImpl implements IPaperOfUserService {

    @Autowired

    private TestPaperStateMapper testPaperStateMapper;

    /**
     * 根据试卷id和试卷状态查询学生做完的试卷列表
     * @param state 学生所做试卷的状态
     * @param paperId 教师所出试卷的id
     * @return 学生所做试卷的列表
     */

    @Override
    public List<TestPaperState> findAllUserPaperWithState(String state, Integer paperId) {

        TestPaperStateExample testPaperStateExample=new TestPaperStateExample();

        testPaperStateExample.clear();

        testPaperStateExample.or().andStateEqualTo(state).andTestPaperIdEqualTo(paperId);

        List<TestPaperState> testPaperStateList=new ArrayList<TestPaperState>();


        testPaperStateList=testPaperStateMapper.selectByExample(testPaperStateExample);

        return testPaperStateList;
    }
}
