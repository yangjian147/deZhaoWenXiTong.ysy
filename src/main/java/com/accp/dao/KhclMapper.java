package com.accp.dao;

import com.accp.pojo.Khcl;

public interface KhclMapper {
    int deleteByPrimaryKey(Integer khclid);

    int insert(Khcl record);

    int insertSelective(Khcl record);

    Khcl selectByPrimaryKey(Integer khclid);

    int updateByPrimaryKeySelective(Khcl record);

    int updateByPrimaryKey(Khcl record);
}