package com.SRGMS.model;

public class Fitdetail {
    private Integer fitdetailid;

    private Integer fitid;

    private Integer emeterid;

    private Double value;

    public Integer getFitdetailid() {
        return fitdetailid;
    }

    public void setFitdetailid(Integer fitdetailid) {
        this.fitdetailid = fitdetailid;
    }

    public Integer getFitid() {
        return fitid;
    }

    public void setFitid(Integer fitid) {
        this.fitid = fitid;
    }

    public Integer getEmeterid() {
        return emeterid;
    }

    public void setEmeterid(Integer emeterid) {
        this.emeterid = emeterid;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}