package com.testOnline.service.impl;

import com.testOnline.dao.QuestionMapper;
import com.testOnline.model.*;
import com.testOnline.service.IMyUserService;
import com.testOnline.service.ITestPaperService;
import com.testOnline.service.IMyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testOnline.common.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testOnline.model.User;
import com.testOnline.dao.UserMapper;
import com.testOnline.model.UserExample;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service("myUserService")
public class MyUserServiceImpl implements IMyUserService {

    @Autowired
    UserMapper userMapper;

    UserExample userExample = new UserExample();

    /**
     * 用户登录，前台应该传来用户的相关信息
     * @param userName 用户名
     * @param userPwd 用户密码
     * @param userEmail 用户邮箱
     * @param roleId 用户角色
     * @param sex 用户性别
     * @param address 用户住址
     * @param img 用户图片
     * @return 返回影响的数据库行数
     */
    public int UserRegister(String userName,String userPwd,String userEmail ,int roleId,String sex,String address,String img){

        int row = 0;

        User user = new User();

        user.setRoleId(roleId);
        user.setUserEmail(userEmail);
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        user.setUserSex(sex);
        user.setUserAddress(address);
        user.setUserImg(img);


        row = userMapper.insert(user);

        return row;
    }


    /**
     * 更新用户信息
     * @param user 用户的对象，包含用户的各种信息
     * @return 影响的数据库行数
     */
    public int UpdateUserInformation(User user){

        int row = 0;

        row = userMapper.updateByPrimaryKey(user);

        return row;
    }

    /**
     * 用户登录
     * @param userName 用户名，可选
     * @param userPwd 用户密码
     * @param userMail 用户邮箱，可选
     * @return 用户的对象
     */
    public User userLogin(String userName,String userPwd,String userMail){


        userExample.clear();

        if (userMail!=null&&!"".equals(userMail)){
            userExample.or().andUserEmailEqualTo(userMail).andUserPwdEqualTo(userPwd);
        }
        if (userName!=null&&!"".equals(userName)){
            userExample.or().andUserNameEqualTo(userName).andUserPwdEqualTo(userPwd);
        }
        List<User> users = userMapper.selectByExample(userExample);
        User user=new User();
        if(users.size() > 0){
            user=users.get(0);
            return user;
        }else {
            return user ;
        }

           }

    /**
     * 用户注册前判断用户信息是否已存在
     * @param userName 用户名
     * @param userMail 用户邮箱
     * @return true，已存在；false，不存在
     */
    @Override
    public boolean hasUser(String userName, String userMail) {

        Boolean flag = false;


        if (userMail!=null&&!"".equals(userMail)){
            userExample.clear();
            userExample.or().andUserEmailEqualTo(userMail);
        }
        if (userName!=null&&!"".equals(userName)){
            userExample.clear();
            userExample.or().andUserNameEqualTo(userName);
        }
        if (userMail!=null&&!"".equals(userMail)&&userName!=null&&!"".equals(userName)){
            userExample.clear();
            userExample.or().andUserNameEqualTo(userName).andUserEmailEqualTo(userMail);
        }

        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() > 0){
            flag = true;
        }else {
            flag = false;
        }

        return flag;
    }

    @Override
    public User selectUserByUserId(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User selectUserByUserName(String userName) {
        userExample.clear();
        userExample.or().andUserNameEqualTo(userName);
        List<User> user= userMapper.selectByExample(userExample);
        return user.get(0);
    }

    @Override
    public int updateUserPassword(Integer userId, String password) {
        User user=new User();
        user.setUserId(userId);
        user.setUserPwd(password);
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
