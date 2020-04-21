package com.woniuxy.clinic.service;

import com.woniuxy.clinic.entity.Patient;

public interface CaseService {
	
	// 查询患者信息
	Patient getPatientById(int patientID);
	
	
}
