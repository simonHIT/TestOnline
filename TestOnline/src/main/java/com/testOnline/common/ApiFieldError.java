package com.testOnline.common;

public class ApiFieldError {

    private String field;
    private String code;

    public ApiFieldError(String field, String code, Object rejectedValue) {
        this.field = field;
        this.code = code;
        this.rejectedValue = rejectedValue;
    }

    private Object rejectedValue;

    public String getField() {
        return field;
    }

    public String getCode() {
        return code;
    }

    public Object getRejectedValue() {
        return rejectedValue;
    }


    public void setField(String field) {
        this.field = field;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRejectedValue(Object rejectedValue) {
        this.rejectedValue = rejectedValue;
    }
}
