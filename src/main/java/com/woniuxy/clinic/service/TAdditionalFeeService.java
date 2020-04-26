package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TAdditionalFee;

public interface TAdditionalFeeService {

	void insertTAdditionalFee(TAdditionalFee tAdditionalFee);
	
	//软删除:更改费用状态(启用改为禁用)
	void delectTadditionalFeeById(int additional_id);
	
	void updateTadditionalFeeById(TAdditionalFee tAdditionalFee);
	
	List<TAdditionalFee> selectTadditionalFees();
	
	List<TAdditionalFee> selectByWhere(TAdditionalFee tAdditionalFee);
}
