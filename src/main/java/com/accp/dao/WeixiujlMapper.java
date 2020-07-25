package com.accp.dao;

import com.accp.pojo.Weixiujl;

public interface WeixiujlMapper {
    int deleteByPrimaryKey(Integer weixiujlid);

    int insert(Weixiujl record);

    int insertSelective(Weixiujl record);

    Weixiujl selectByPrimaryKey(Integer weixiujlid);

    int updateByPrimaryKeySelective(Weixiujl record);

    int updateByPrimaryKey(Weixiujl record);
}