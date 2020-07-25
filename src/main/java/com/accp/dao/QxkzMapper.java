package com.accp.dao;

import com.accp.pojo.Qxkz;

public interface QxkzMapper {
    int deleteByPrimaryKey(Integer qxid);

    int insert(Qxkz record);

    int insertSelective(Qxkz record);

    Qxkz selectByPrimaryKey(Integer qxid);

    int updateByPrimaryKeySelective(Qxkz record);

    int updateByPrimaryKey(Qxkz record);
}