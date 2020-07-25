package com.accp.dao;

import com.accp.pojo.Waiqin;

public interface WaiqinMapper {
    int deleteByPrimaryKey(Integer waiqinid);

    int insert(Waiqin record);

    int insertSelective(Waiqin record);

    Waiqin selectByPrimaryKey(Integer waiqinid);

    int updateByPrimaryKeySelective(Waiqin record);

    int updateByPrimaryKey(Waiqin record);
}