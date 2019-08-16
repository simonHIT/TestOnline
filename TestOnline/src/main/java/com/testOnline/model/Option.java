package com.testOnline.model;

public class Option {
    private Integer optionId;

    private Integer queId;

    private String optionInfo;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    public String getOptionInfo() {
        return optionInfo;
    }

    public void setOptionInfo(String optionInfo) {
        this.optionInfo = optionInfo == null ? null : optionInfo.trim();
    }
}