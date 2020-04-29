package com.woniuxy.clinic.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TMedicalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TMedicalFee;

public interface TMedicalFeeService {

	void insertTMedicalFee(TMedicalFee tMedicalFee);
	
	//软删除:更改费用状态(启用改为禁用)
	void delectTMedicalFeeById(TMedicalFee tMedicalFee);
	
	void updateTMedicalFeeById(TMedicalFee tMedicalFee);
	
	TMedicalFee selectTMedicalFeeById(Integer medical_id);
	
	List<TMedicalFee> selectTMedicalFees();
	
	List<TMedicalFee> selectByWhere(TMedicalFee tMedicalFee);
	
	List<TMedicalFee> selectAlltMedicalFeesByCondition
	(TAdditionalFee tMedicalFee,Integer pageIndex,Integer pageSize);
	
	List<TMedicalFee> findUsersByPage(Integer currentPage, Integer pageSize ,TMedicalFeeDto dto);

	int selectByPageCount(@Param("dto")TMedicalFeeDto dto);
}
