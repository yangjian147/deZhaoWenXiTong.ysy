package com.accp.dao;

import com.accp.pojo.Wxtype;

public interface WxtypeMapper {
    int deleteByPrimaryKey(Integer wxtypeid);

    int insert(Wxtype record);

    int insertSelective(Wxtype record);

    Wxtype selectByPrimaryKey(Integer wxtypeid);

    int updateByPrimaryKeySelective(Wxtype record);

    int updateByPrimaryKey(Wxtype record);
}