package com.TestOnline.dao;

import com.testOnline.model.User;
import com.testOnline.service.IPaperService;
import com.testOnline.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.testOnline.service.IPaperService;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    private IPaperService p;

    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        String an = p.getQuestionAnswerByQuestionId(1);
        System.out.println(an);
    }

}