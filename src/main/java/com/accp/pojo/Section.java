package com.accp.pojo;

public class Section {
    private Integer sectionbh;

    private String sectionname;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    public Integer getSectionbh() {
        return sectionbh;
    }

    public void setSectionbh(Integer sectionbh) {
        this.sectionbh = sectionbh;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname == null ? null : sectionname.trim();
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