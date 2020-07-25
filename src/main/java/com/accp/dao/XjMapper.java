package com.accp.dao;

import com.accp.pojo.Xj;

public interface XjMapper {
    int deleteByPrimaryKey(Integer xjid);

    int insert(Xj record);

    int insertSelective(Xj record);

    Xj selectByPrimaryKey(Integer xjid);

    int updateByPrimaryKeySelective(Xj record);

    int updateByPrimaryKey(Xj record);
}