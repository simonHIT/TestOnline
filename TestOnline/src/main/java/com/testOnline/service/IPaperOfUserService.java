package com.testOnline.service;

import com.testOnline.model.TestPaperState;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPaperOfUserService {

    public List<TestPaperState> findAllUserPaperWithState(String state, Integer courseId);
}
