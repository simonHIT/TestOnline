package com.SRGMS.model;

public class FitdetailResult {
    private Integer fitdetailResultid;

    private Integer fitid;

    private Integer emeterid;

    private Double value;

    public Integer getFitdetailResultid() {
        return fitdetailResultid;
    }

    public void setFitdetailResultid(Integer fitdetailResultid) {
        this.fitdetailResultid = fitdetailResultid;
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