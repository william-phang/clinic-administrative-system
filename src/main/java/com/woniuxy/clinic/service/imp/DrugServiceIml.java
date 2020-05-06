package com.woniuxy.clinic.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.Drug;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.mapper.DrugMapper;
import com.woniuxy.clinic.service.DrugService;
@Service
public class DrugServiceIml implements DrugService {

	@Autowired
	DrugMapper drugMapper;
	
	@Override
	public Drug getDrug(String name) {
		if(name.length()<1) {
			throw new PharmacyException("没有数据");
		}
		// 根据药物名称查询
		Drug selectByname = drugMapper.selectByname(name);
		if(selectByname==null) {
			throw new PharmacyException("数据有误");
		}
		return selectByname;
	}

}
