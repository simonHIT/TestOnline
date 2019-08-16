package com.testOnline.service.impl;

import com.testOnline.model.User;
import com.testOnline.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserService userDao;


    @Override
    public User selectUser(long userId) {
        User u=userDao.selectUser(userId);
        return u;
    }

}