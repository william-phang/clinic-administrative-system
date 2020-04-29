
package com.woniuxy.clinic.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.mapper.CaseMapper;
import com.woniuxy.clinic.mapper.CaseMessageMapper;
import com.woniuxy.clinic.service.CaseService;

@Service
public class CaseServiceImpl implements CaseService {
	
	public static int id;
	@Autowired
	CaseMapper tCaseMapper;
	@Autowired
	CaseMessageMapper caseMessageMapper;
	@Override
	public Case getTCase(int case_id) {
		Case case1=new Case();
		if(case_id<0) {
			throw new PharmacyException("数据异常");
		}
		id=case_id;
		case1 = tCaseMapper.selectTCase(case_id);
		return case1;
	}
	
}
