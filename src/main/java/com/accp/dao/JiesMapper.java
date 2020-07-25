package com.accp.dao;

import com.accp.pojo.Jies;

public interface JiesMapper {
    int deleteByPrimaryKey(Integer jiesid);

    int insert(Jies record);

    int insertSelective(Jies record);

    Jies selectByPrimaryKey(Integer jiesid);

    int updateByPrimaryKeySelective(Jies record);

    int updateByPrimaryKey(Jies record);
}