package com.accp.dao;

import com.accp.pojo.Section;

public interface SectionMapper {
    int deleteByPrimaryKey(Integer sectionbh);

    int insert(Section record);

    int insertSelective(Section record);

    Section selectByPrimaryKey(Integer sectionbh);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
}