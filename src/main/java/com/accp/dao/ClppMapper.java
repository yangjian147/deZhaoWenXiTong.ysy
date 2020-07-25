package com.accp.dao;

import com.accp.pojo.Clpp;

public interface ClppMapper {
    int deleteByPrimaryKey(Integer clppid);

    int insert(Clpp record);

    int insertSelective(Clpp record);

    Clpp selectByPrimaryKey(Integer clppid);

    int updateByPrimaryKeySelective(Clpp record);

    int updateByPrimaryKey(Clpp record);
}