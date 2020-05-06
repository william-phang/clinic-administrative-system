package com.woniuxy.clinic.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TRegistrationFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TRegistrationFee;

public interface TRegistrationFeeService {

	void insertTRegistrationFee(TRegistrationFee tRegistrationFee);
	
	//软删除:更改费用状态(启用改为禁用)
	void delectTRegistrationFeeById(TRegistrationFee tRegistrationFee);
	
	void updateTRegistrationFeeById(TRegistrationFee tRegistrationFee);
	
	TRegistrationFee selectTRegistrationFeeById(Integer regis_id);
	
	List<TRegistrationFee> selectTRegistrationFees();
	
	List<TRegistrationFee> selectByWhere(TRegistrationFee tRegistrationFee);
	
	List<TRegistrationFee> selectAlltRegistrationFeesByCondition
	(TRegistrationFee tRegistrationFee,Integer pageIndex,Integer pageSize);
	
	List<TRegistrationFee> findUsersByPage(Integer currentPage, Integer pageSize ,TRegistrationFeeDto dto);

	int selectByPageCount(@Param("dto")TRegistrationFeeDto dto);
}
