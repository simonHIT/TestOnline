package com.SRGMS.model;

public class Dstype {
    private Integer dstypeid;

    private String dstypename;

    private String timeunit;

    private String numunit;

    public Integer getDstypeid() {
        return dstypeid;
    }

    public void setDstypeid(Integer dstypeid) {
        this.dstypeid = dstypeid;
    }

    public String getDstypename() {
        return dstypename;
    }

    public void setDstypename(String dstypename) {
        this.dstypename = dstypename == null ? null : dstypename.trim();
    }

    public String getTimeunit() {
        return timeunit;
    }

    public void setTimeunit(String timeunit) {
        this.timeunit = timeunit == null ? null : timeunit.trim();
    }

    public String getNumunit() {
        return numunit;
    }

    public void setNumunit(String numunit) {
        this.numunit = numunit == null ? null : numunit.trim();
    }
}