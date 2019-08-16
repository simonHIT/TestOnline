package com.testOnline.common;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status {

    private Integer code = 0;//状态码
    private String msg;//状态消息

    public Status() {
    }

    public Status(Integer code) {
        this.code = code;
    }

    public Status(String msg) {
        this.msg = msg;
    }

    public Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
