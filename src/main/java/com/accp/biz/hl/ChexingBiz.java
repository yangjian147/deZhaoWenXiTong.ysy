package com.accp.biz.hl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ChexingMapper;
import com.accp.pojo.Chexing;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ChexingBiz {
	@Autowired
	private ChexingMapper chexingMapper;
	
	public List<Chexing> select() {
		 return chexingMapper.select();
	}
	
	
}
