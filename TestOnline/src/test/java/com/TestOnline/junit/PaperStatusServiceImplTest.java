package com.TestOnline.junit;

import com.testOnline.service.impl.PaperStatusServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class PaperStatusServiceImplTest {


    PaperStatusServiceImpl paperStatusService = new PaperStatusServiceImpl();

    @Test
    public void getAllQuestionByPaperId() {

    }

    @Test
    public void getOptions() {
        assertNotNull(paperStatusService.getOptions(1));
    }

    @Test
    public void getpapers() {
    }
}