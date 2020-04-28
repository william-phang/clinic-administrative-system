package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TMedicalFee;

public interface TMedicalFeeService {

	void insertTMedicalFee(TMedicalFee tMedicalFee);
	
	//软删除:更改费用状态(启用改为禁用)
	void delectTMedicalFeeById(TMedicalFee tMedicalFee);
	
	void updateTMedicalFeeById(TMedicalFee tMedicalFee);
	
	List<TMedicalFee> selectTMedicalFees();
}
