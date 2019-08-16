package com.testOnline.model;

public class QuestionWithBLOBs extends Question {
    private String queInfo;

    private String queAns;

    public String getQueInfo() {
        return queInfo;
    }

    public void setQueInfo(String queInfo) {
        this.queInfo = queInfo == null ? null : queInfo.trim();
    }

    public String getQueAns() {
        return queAns;
    }

    public void setQueAns(String queAns) {
        this.queAns = queAns == null ? null : queAns.trim();
    }
}