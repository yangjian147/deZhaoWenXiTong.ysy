package com.accp.dao;

import com.accp.pojo.Kehu;

public interface KehuMapper {
    int deleteByPrimaryKey(Integer kehuid);

    int insert(Kehu record);

    int insertSelective(Kehu record);

    Kehu selectByPrimaryKey(Integer kehuid);

    int updateByPrimaryKeySelective(Kehu record);

    int updateByPrimaryKey(Kehu record);
}