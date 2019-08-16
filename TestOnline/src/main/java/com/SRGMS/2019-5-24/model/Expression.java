package com.SRGMS.model;

public class Expression {
    private Integer idexpression;

    private String worm;

    private Integer emeternum;

    private Integer srgmid;

    private String expression;

    public Integer getIdexpression() {
        return idexpression;
    }

    public void setIdexpression(Integer idexpression) {
        this.idexpression = idexpression;
    }

    public String getWorm() {
        return worm;
    }

    public void setWorm(String worm) {
        this.worm = worm == null ? null : worm.trim();
    }

    public Integer getEmeternum() {
        return emeternum;
    }

    public void setEmeternum(Integer emeternum) {
        this.emeternum = emeternum;
    }

    public Integer getSrgmid() {
        return srgmid;
    }

    public void setSrgmid(Integer srgmid) {
        this.srgmid = srgmid;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }
}