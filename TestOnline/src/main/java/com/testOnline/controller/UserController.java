package com.testOnline.controller;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import com.testOnline.common.Result;
import com.testOnline.model.User;
import com.testOnline.service.IMyUserService;
import com.testOnline.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.*;
/**
 * swagger 依赖
 */
import com.wordnik.swagger.annotations.Api;
import org.springframework.web.servlet.ModelAndView;


@RestController("UserController")
@Scope("request")
@RequestMapping("/user")
public class UserController {

    public static String ownEmailAccount  = "17863136300@163.com";
    public static String myEmailSMTPHost = "smtp.163.com";
    public static String ownEmailPassword = "b8812460";
    private Result result=new Result();
    @Autowired
    private IUserService userService;

    @Autowired
    private IMyUserService myUserService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }
    @RequestMapping(value = "change-password",method = RequestMethod.POST)
    public Result changePassword(@RequestParam(value = "userId")Integer userId,
                                 @RequestParam(value = "userPwd")String userPwd){
        int re=myUserService.updateUserPassword(Decryp(userId),userPwd);
        if(re>0){
            result.setSuccess("修改密码成功");
        }else {
            result.setError("修改密码失败");
        }
        return result;
    }
    @RequestMapping(value = "/find-password",method = RequestMethod.POST)
    public Result findpassword(@RequestParam(value = "userName")String userName) {

            Properties prop = new Properties();
            // 设置邮件传输采用的协议smtp
            prop.setProperty("mail.transport.protocol", "smtp");
            // 设置发送人邮件服务器的smtp地址
            // 这里以网易的邮箱smtp服务器地址为例
            prop.setProperty("mail.smtp.host", myEmailSMTPHost);
            // 设置验证机制
            prop.setProperty("mail.smtp.auth", "true");

            // SMTP 服务器的端口 (非 SSL 连接的端口一般默认为 25, 可以不添加, 如果开启了 SSL 连接,
            // 需要改为对应邮箱的 SMTP 服务器的端口, 具体可查看对应邮箱服务的帮助,
            // QQ邮箱的SMTP(SLL)端口为465或587, 其他邮箱自行去查看)

        /*final String smtpPort = "465";
        prop.setProperty("mail.smtp.port", smtpPort);
        prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.setProperty("mail.smtp.socketFactory.fallback", "false");
        prop.setProperty("mail.smtp.socketFactory.port", smtpPort);*/

            // 创建对象回话跟服务器交互
            Session session = Session.getInstance(prop);
            // 会话采用debug模式
            session.setDebug(true);
            // 创建邮件对象
            try {
                Message message = createSimpleMail(session,userName);

                Transport trans = session.getTransport();
                // 链接邮件服务器
                trans.connect(ownEmailAccount, ownEmailPassword);
                // 发送信息
                trans.sendMessage(message, message.getAllRecipients());
                // 关闭链接
                trans.close();
                result.setSuccess("发送成功");
                return result;
            }catch(Exception e){
                e.printStackTrace();
                result.setError(e.getMessage());
            }
        return result;
    }


    public Message createSimpleMail(Session session,String userName) throws Exception {
        MimeMessage message = new MimeMessage(session);
        // 设置发送邮件地址,param1 代表发送地址 param2 代表发送的名称(任意的) param3 代表名称编码方式
        message.setFrom(new InternetAddress(ownEmailAccount, "管理员", "utf-8"));
        // 代表收件人
        String receiveMailAccount=myUserService.selectUserByUserName(userName).getUserEmail();
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiveMailAccount, "李四", "utf-8"));
        // To: 增加收件人（可选）
        /*message.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress("dd@receive.com", "USER_DD", "UTF-8"));
        // Cc: 抄送（可选）
        message.setRecipient(MimeMessage.RecipientType.CC, new InternetAddress("ee@receive.com", "USER_EE", "UTF-8"));
        // Bcc: 密送（可选）
        message.setRecipient(MimeMessage.RecipientType.BCC, new InternetAddress("ff@receive.com", "USER_FF", "UTF-8"));*/
        // 设置邮件主题
        message.setSubject("优学网找回密码");
        // 设置邮件内容
        message.setContent("http://localhost:8080/TestOnline/ChangePassword.html?userId="+Encryp(myUserService.selectUserByUserName(userName).getUserId()), "text/html;charset=utf-8");
        // 设置发送时间
        message.setSentDate(new Date());
        // 保存上面的编辑内容
        message.saveChanges();
        // 将上面创建的对象写入本地
        OutputStream out = new FileOutputStream("MyEmail.eml");
        message.writeTo(out);
        out.flush();
        out.close();
        return message;
    }
    public Integer Encryp(Integer userId){
        userId=userId+1024;
        userId=userId*17;
        return userId;
    }
    public Integer Decryp(Integer userId){
        userId=userId/17;
        userId=userId-1024;
        return userId;
    }

}