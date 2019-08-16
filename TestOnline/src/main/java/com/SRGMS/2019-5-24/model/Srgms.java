package com.SRGMS.model;

public class Srgms {
    private Integer srgmid;

    private String srgmname;

    private Integer srgmtypeid;

    private String publication;

    private Integer userid;

    private Integer emeternum;

    public Integer getSrgmid() {
        return srgmid;
    }

    public void setSrgmid(Integer srgmid) {
        this.srgmid = srgmid;
    }

    public String getSrgmname() {
        return srgmname;
    }

    public void setSrgmname(String srgmname) {
        this.srgmname = srgmname == null ? null : srgmname.trim();
    }

    public Integer getSrgmtypeid() {
        return srgmtypeid;
    }

    public void setSrgmtypeid(Integer srgmtypeid) {
        this.srgmtypeid = srgmtypeid;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication == null ? null : publication.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getEmeternum() {
        return emeternum;
    }

    public void setEmeternum(Integer emeternum) {
        this.emeternum = emeternum;
    }
}