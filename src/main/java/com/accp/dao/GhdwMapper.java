package com.accp.dao;

import com.accp.pojo.Ghdw;

public interface GhdwMapper {
    int deleteByPrimaryKey(Integer ghdwbh);

    int insert(Ghdw record);

    int insertSelective(Ghdw record);

    Ghdw selectByPrimaryKey(Integer ghdwbh);

    int updateByPrimaryKeySelective(Ghdw record);

    int updateByPrimaryKey(Ghdw record);
}