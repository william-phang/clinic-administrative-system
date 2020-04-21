package com.woniuxy.clinic.service.imp;

import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.service.CaseService;

@Service
public class CaseServiceImpl implements CaseService {

	
	
	// 一对一形式查询患者信息
	public Patient getPatientById(int patientID) {
		Patient patient = new Patient();
		// 判断数据的有效性
		if(patientID<0) {
			return patient;
		}
		
		
		
		
		return null;
	}
	
	
	
}
