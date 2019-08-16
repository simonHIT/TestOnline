package com.SRGMS.model;

public class Srgmtype {
    private Integer srgmtypeid;

    private String srgmtypename;

    private String appearence;

    public Integer getSrgmtypeid() {
        return srgmtypeid;
    }

    public void setSrgmtypeid(Integer srgmtypeid) {
        this.srgmtypeid = srgmtypeid;
    }

    public String getSrgmtypename() {
        return srgmtypename;
    }

    public void setSrgmtypename(String srgmtypename) {
        this.srgmtypename = srgmtypename == null ? null : srgmtypename.trim();
    }

    public String getAppearence() {
        return appearence;
    }

    public void setAppearence(String appearence) {
        this.appearence = appearence == null ? null : appearence.trim();
    }
}