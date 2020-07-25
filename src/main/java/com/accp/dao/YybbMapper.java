package com.accp.dao;

import com.accp.pojo.Yybb;

public interface YybbMapper {
    int deleteByPrimaryKey(Integer yybbid);

    int insert(Yybb record);

    int insertSelective(Yybb record);

    Yybb selectByPrimaryKey(Integer yybbid);

    int updateByPrimaryKeySelective(Yybb record);

    int updateByPrimaryKey(Yybb record);
}