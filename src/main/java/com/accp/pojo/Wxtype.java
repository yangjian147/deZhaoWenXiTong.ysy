package com.accp.pojo;

public class Wxtype {
    private Integer wxtypeid;

    private String wxtypename;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    public Integer getWxtypeid() {
        return wxtypeid;
    }

    public void setWxtypeid(Integer wxtypeid) {
        this.wxtypeid = wxtypeid;
    }

    public String getWxtypename() {
        return wxtypename;
    }

    public void setWxtypename(String wxtypename) {
        this.wxtypename = wxtypename == null ? null : wxtypename.trim();
    }

    public Integer getBz1() {
        return bz1;
    }

    public void setBz1(Integer bz1) {
        this.bz1 = bz1;
    }

    public Integer getBz2() {
        return bz2;
    }

    public void setBz2(Integer bz2) {
        this.bz2 = bz2;
    }

    public Integer getBz3() {
        return bz3;
    }

    public void setBz3(Integer bz3) {
        this.bz3 = bz3;
    }
}