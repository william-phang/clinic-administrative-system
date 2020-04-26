package com.woniuxy.clinic.service;

import com.woniuxy.clinic.entity.TCase;

public interface CaseService {
	
	// 根据工作太接诊插入的id查询是否存在
	TCase getTCase(int case_id);
	
}
