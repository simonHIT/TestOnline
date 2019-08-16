package com.SRGMS.model;

public class Usertype {
    private Integer usertypeid;

    private String usertypename;

    public Integer getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(Integer usertypeid) {
        this.usertypeid = usertypeid;
    }

    public String getUsertypename() {
        return usertypename;
    }

    public void setUsertypename(String usertypename) {
        this.usertypename = usertypename == null ? null : usertypename.trim();
    }
}