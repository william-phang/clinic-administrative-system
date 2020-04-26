package com.woniuxy.clinic.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TCase;
import com.woniuxy.clinic.mapper.TCaseMapper;
import com.woniuxy.clinic.service.CaseService;

@Service
public class CaseServiceImpl implements CaseService {

	@Autowired
	TCaseMapper tCaseMapper;
	@Override
	public TCase getTCase(int case_id) {
		TCase case1=new TCase();
		if(case_id<0) {
			return case1;
		}
		case1 = tCaseMapper.selectTCase(case_id);
		return case1;
	}
	
}
