package com.testOnline.service;

import com.testOnline.model.User;

import java.util.List;

public interface IDeleteService {
    public int DeleteQueByQueId(List<Integer> queId);

    public int DeleteCourse(Integer userId, Integer courseId);

    public List<User> UserInformation(Integer userId);
}
