package com.woniuxy.clinic.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.mapper.CaseMapper;
import com.woniuxy.clinic.service.CaseService;

@Service
public class CaseServiceImpl implements CaseService {

	@Autowired
	CaseMapper tCaseMapper;
	@Override
	public Case getTCase(int case_id) {
		Case case1=new Case();
		if(case_id<0) {
			return case1;
		}
		case1 = tCaseMapper.selectTCase(case_id);
		return case1;
	}
	
}
