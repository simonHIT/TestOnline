package com.testOnline.common;

import java.util.HashMap;
import java.util.Map;

public class Constant {

    public static final Integer SUCCESS_STATUS_CODE = 0;//接口返回成功status信息的状态码
    public static final Integer ERROR_STATUS_CODE = -1;//接口返回错误status信息的状态码
    /**登录相关**/
    public static final Integer NO_LOGIN_ERROR = 403;
    public static final Integer NO_PERMISSION_ERROR = 401;
    public static final String  EMAIL_EXISTED="邮箱已存在";
    public static final String  USERNAME_EXISTED="用户名已存在";
    public static final String  USERExisted="用户已存在";
    public static final String  REGISTSUCCESS="注册成功";
    public static final String  USERTABLEERROR="数据库错误";
    public static final String  INFOINVALID="注册信息有误";


    public static final Integer CAN_NOT_CONVERT_DATE=100;

    /** Device Manage **/
    public static final Integer ALREADY_EXIST= 3;
    public static final Integer NOT_EXIST = 4;

    /**定义订单状态**/
    public static final String NOT_CREATE_STATE="0";
    public static final String NOT_ORDER_STATE="1";
    public static final String INTERRUPT_STATE="2";
    public static final String ORDER_STATE="3";
    public static final String ORDER_CLOSE_STATE="4";
    public static final String NOT_ORDER_AND_INTERRUPT="5";

    /**定义订单类型*/
    public static final String ORIGINAL_TYPE="1";

    /**定义三种试卷的状态*/
    public static final String Unfinished="0";
    public static final String finished="1";
    public static final String checked="2";
}

