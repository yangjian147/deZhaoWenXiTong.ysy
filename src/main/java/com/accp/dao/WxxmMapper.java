package com.accp.dao;

import com.accp.pojo.Wxxm;

public interface WxxmMapper {
    int deleteByPrimaryKey(Integer wxxmid);

    int insert(Wxxm record);

    int insertSelective(Wxxm record);

    Wxxm selectByPrimaryKey(Integer wxxmid);

    int updateByPrimaryKeySelective(Wxxm record);

    int updateByPrimaryKey(Wxxm record);
}