package com.accp.dao;

import com.accp.pojo.Banzu;

public interface BanzuMapper {
    int deleteByPrimaryKey(Integer bzid);

    int insert(Banzu record);

    int insertSelective(Banzu record);

    Banzu selectByPrimaryKey(Integer bzid);

    int updateByPrimaryKeySelective(Banzu record);

    int updateByPrimaryKey(Banzu record);
}