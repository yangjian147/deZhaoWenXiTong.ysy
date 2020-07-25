package com.accp.biz.yj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StaffMapper;
import com.accp.pojo.Staff;

@Service
@Transactional
public class staffBiz {
	@Autowired
	private StaffMapper staffmapper;
	public Staff selectuser(String name, String password) {
		return staffmapper.selectuser(name, password);
	}
	public Staff selectuserPhone(String phone) {
		return staffmapper.selectuserPhone(phone);
	}
}
