package com.testOnline.service;
import com.testOnline.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

public interface IMyUserService {

    public int UserRegister(String userName, String userPwd, String userEmail, int roleId, String sex, String address, String img);

    public int UpdateUserInformation(User user);

    public User userLogin(String userName, String password, String userMail);

    public boolean hasUser(String userName, String userMail);

    public User selectUserByUserId(Integer userId);

    public User selectUserByUserName(String userName);

    public int updateUserPassword(Integer userId, String password);
}
