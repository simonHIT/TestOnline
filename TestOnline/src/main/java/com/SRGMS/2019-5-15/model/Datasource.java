package com.SRGMS.model;

import java.util.Date;

public class Datasource {
    private Integer dsid;

    private String dsname;

    private Integer dstypeid;

    private Date time;

    private String publication;

    private Integer userid;

    private String description;

    public Integer getDsid() {
        return dsid;
    }

    public void setDsid(Integer dsid) {
        this.dsid = dsid;
    }

    public String getDsname() {
        return dsname;
    }

    public void setDsname(String dsname) {
        this.dsname = dsname == null ? null : dsname.trim();
    }

    public Integer getDstypeid() {
        return dstypeid;
    }

    public void setDstypeid(Integer dstypeid) {
        this.dstypeid = dstypeid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}