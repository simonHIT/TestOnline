package com.SRGMS.model;

public class Emeter {
    private Integer emeterid;

    private String name;

    private String meaning;

    private Integer expressionid;

    public Integer getEmeterid() {
        return emeterid;
    }

    public void setEmeterid(Integer emeterid) {
        this.emeterid = emeterid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning == null ? null : meaning.trim();
    }

    public Integer getExpressionid() {
        return expressionid;
    }

    public void setExpressionid(Integer expressionid) {
        this.expressionid = expressionid;
    }
}