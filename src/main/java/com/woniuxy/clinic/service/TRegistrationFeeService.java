package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TRegistrationFee;

public interface TRegistrationFeeService {

	void insertTRegistrationFee(TRegistrationFee tRegistrationFee);
	
	//软删除:更改费用状态(启用改为禁用)
	void delectTRegistrationFeeById(TRegistrationFee tRegistrationFee);
	
	void updateTRegistrationFeeById(TRegistrationFee tRegistrationFee);
	
	List<TRegistrationFee> selectTRegistrationFees();
}
