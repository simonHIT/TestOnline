package com.testOnline.model;

public class Question {
    private Integer queId;

    private String queTag;

    private Integer courseId;

    private String queValue;

    private String queRank;

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    public String getQueTag() {
        return queTag;
    }

    public void setQueTag(String queTag) {
        this.queTag = queTag == null ? null : queTag.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getQueValue() {
        return queValue;
    }

    public void setQueValue(String queValue) {
        this.queValue = queValue == null ? null : queValue.trim();
    }

    public String getQueRank() {
        return queRank;
    }

    public void setQueRank(String queRank) {
        this.queRank = queRank == null ? null : queRank.trim();
    }
}