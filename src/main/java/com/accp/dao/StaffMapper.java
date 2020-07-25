package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);
   
    int updateByPrimaryKey(Staff record);
    Staff selectuser(@Param("staffAccount")String staffAccount,@Param("staffPawss")String staffPawss);
    Staff selectuserPhone(@Param("staff")String staff);

}