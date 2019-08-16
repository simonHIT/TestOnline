package com.testOnline.controller;

import com.testOnline.common.Constant;
import com.testOnline.common.Result;
import com.testOnline.model.User;
import com.testOnline.service.IMyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController("myUserController")
@RequestMapping("/myuser")
@Scope("request")
public class MyUserController {
    @Autowired
    @Qualifier("myUserService")
    private IMyUserService myUserService;

    private Result result;

    /**
     *用户注册，前台应该传来用户注册表单的数据
     * @param userName 用户名
     * @param userPwd 用户密码
     * @param userEmail 用户邮箱
     * @param roleId 用户角色
     * @param sex 用户性别
     * @param address 用户地址
     * @param img 用户图片
     * @return 操作结果集 0 用户已存在；1用户邮箱已存在；2用户名已存在；3 注册成功;4用户表插入失败;5用户名邮箱为空
     */
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public Result userRegister(@RequestParam(value = "userName",required = true) String userName,
                               @RequestParam(value = "userPwd",required = true) String userPwd,
                               @RequestParam(value = "userEmail",required = true) String userEmail ,
                               @RequestParam(value = "roleId",required = true) int roleId,
                               @RequestParam(value = "sex",required = false) String sex,
                               @RequestParam(value = "address",required = false) String address,
                               @RequestParam(value = "img",required = false) String img){

        this.result=new Result();
        if((userName==null||"".equals(userName))||(userEmail==null||"".equals(userEmail))){
            this.result.setError(Constant.INFOINVALID);
            return this.result;
        }
        if (myUserService.hasUser(userName,userEmail)){
            this.result.setError(Constant.USERExisted);
            return this.result;
        }else {
            if (myUserService.hasUser(userName,"")){
                this.result.setError(Constant.USERNAME_EXISTED);
                return this.result;
            }
            if (myUserService.hasUser("",userEmail)){
                this.result.setError(Constant.EMAIL_EXISTED);
                return this.result;
            }
            int result=myUserService.UserRegister(userName,userPwd,userEmail,roleId,sex,address,img);
            if (result==1){
                this.result.setSuccess(Constant.REGISTSUCCESS);
                return this.result;
            }else {
                this.result.setError(Constant.USERTABLEERROR);
                return this.result;
            }

        }

    }

    /**
     *用户登录，前台根据返回用户对象的角色跳转到相应的界面
     * @param userName 用户名
     * @param userPwd 用户密码
     * @param userMail 用户邮箱
     * @return 用户的对象,前台通过用户对象属性是否为空判断是否登录成功
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result userLogin(@RequestParam(value = "userName",required = false) String userName,
                            @RequestParam(value = "userPwd",required = true) String userPwd,
                            @RequestParam(value = "userMail",required = false) String userMail, HttpSession session){

        this.result=new Result();

        User user=new User();
        if((userName==null||"".equals(userName))&&(userMail==null||"".equals(userMail))){
            this.result.setError("登录信息为空");
            return this.result;
        }else {
            user=myUserService.userLogin(userName,userPwd,userMail);
            if ((user.getUserId())!=null){

                session.setAttribute("user",user);
                User user1= (User) session.getAttribute("user");
                System.out.println(user1);
                this.result.setEntity(user);
            }
            else {
                this.result.setError("用户名或密码错误");
            }

            return this.result;
        }

    }

    /**
     *用户更新信息
     * @param userName 用户名
     * @param userPwd 用户密码
     * @param userEmail 用户邮箱
     * @param roleId 角色id
     * @param sex 性别
     * @param address 地址
     * @param img 图片
     * @return 操作结果集
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result userUpdate(@RequestParam(value = "userName",required = true) String userName,
                             @RequestParam(value = "userPwd",required = true) String userPwd,
                             @RequestParam(value = "userEmail",required = true) String userEmail ,
                             @RequestParam(value = "roleId",required = true) int roleId,
                             @RequestParam(value = "sex",required = true) String sex,
                             @RequestParam(value = "address",required = true) String address,
                             @RequestParam(value = "img",required = true) String img,
                             @RequestParam(value = "userId",required = true)Integer userId,HttpSession session){

        this.result=new Result();
        User user=new User();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserEmail(userEmail);
        user.setUserPwd(userPwd);
        user.setRoleId(roleId);
        user.setUserSex(sex);
        user.setUserAddress(address);
        user.setUserImg(img);
        int result=myUserService.UpdateUserInformation(user);
        if(result==1){
            session.setAttribute("user",user);
        }
        this.result.setEntity(result);
        return this.result;
    }

    @RequestMapping(value = "/currentuser",method = RequestMethod.POST)
    public Result getCurrentUser( HttpSession session){

        User user= (User) session.getAttribute("user");
        result=new Result();
        if (user!=null){

            this.result.setEntity(user);
        }else {
            this.result.setError("获取session失败");
        }

        return this.result;

    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public Result logout(HttpSession session){

        session.removeAttribute("user");

        result=new Result();

        this.result.setSuccess("登出成功");

        return this.result;

    }
}
