package com.SRGMS.model;

public class Srgmfit {
    private Integer srgmfitid;

    private Integer srgmid;

    private Integer dsid;

    private Double mse;

    private Double meop;

    private Double rsquare;

    private Double variation;

    private Double rmsPe;

    private Double ts;

    private Double bmmre;

    private String fitpath;

    private String repath;

    private Integer ownerid;

    public Integer getSrgmfitid() {
        return srgmfitid;
    }

    public void setSrgmfitid(Integer srgmfitid) {
        this.srgmfitid = srgmfitid;
    }

    public Integer getSrgmid() {
        return srgmid;
    }

    public void setSrgmid(Integer srgmid) {
        this.srgmid = srgmid;
    }

    public Integer getDsid() {
        return dsid;
    }

    public void setDsid(Integer dsid) {
        this.dsid = dsid;
    }

    public Double getMse() {
        return mse;
    }

    public void setMse(Double mse) {
        this.mse = mse;
    }

    public Double getMeop() {
        return meop;
    }

    public void setMeop(Double meop) {
        this.meop = meop;
    }

    public Double getRsquare() {
        return rsquare;
    }

    public void setRsquare(Double rsquare) {
        this.rsquare = rsquare;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }

    public Double getRmsPe() {
        return rmsPe;
    }

    public void setRmsPe(Double rmsPe) {
        this.rmsPe = rmsPe;
    }

    public Double getTs() {
        return ts;
    }

    public void setTs(Double ts) {
        this.ts = ts;
    }

    public Double getBmmre() {
        return bmmre;
    }

    public void setBmmre(Double bmmre) {
        this.bmmre = bmmre;
    }

    public String getFitpath() {
        return fitpath;
    }

    public void setFitpath(String fitpath) {
        this.fitpath = fitpath == null ? null : fitpath.trim();
    }

    public String getRepath() {
        return repath;
    }

    public void setRepath(String repath) {
        this.repath = repath == null ? null : repath.trim();
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }
}