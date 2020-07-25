package com.accp.pojo;

public class Jsxm {
    private Integer jiesid;

    private Integer jsxmid;

    private String jsxmname;

    private Long jsxmpice;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    public Integer getJiesid() {
        return jiesid;
    }

    public void setJiesid(Integer jiesid) {
        this.jiesid = jiesid;
    }

    public Integer getJsxmid() {
        return jsxmid;
    }

    public void setJsxmid(Integer jsxmid) {
        this.jsxmid = jsxmid;
    }

    public String getJsxmname() {
        return jsxmname;
    }

    public void setJsxmname(String jsxmname) {
        this.jsxmname = jsxmname == null ? null : jsxmname.trim();
    }

    public Long getJsxmpice() {
        return jsxmpice;
    }

    public void setJsxmpice(Long jsxmpice) {
        this.jsxmpice = jsxmpice;
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