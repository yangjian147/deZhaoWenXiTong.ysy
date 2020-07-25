package com.accp.pojo;

public class Post {
    private Integer postid;

    private Integer sectionbh;

    private String postname;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getSectionbh() {
        return sectionbh;
    }

    public void setSectionbh(Integer sectionbh) {
        this.sectionbh = sectionbh;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
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