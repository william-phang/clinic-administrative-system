package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TAdditionalFee;

public interface TAdditionalFeeService {

	void insertTAdditionalFee(TAdditionalFee tAdditionalFee);
	
	void delectTadditionalFeeById(int additionalId);
	
	void updateTadditionalFeeById(TAdditionalFee tAdditionalFee);
	
	List<TAdditionalFee> selectTadditionalFees();
}
