
package com.woniuxy.clinic.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;

public interface TAdditionalFeeService {

	void insertTAdditionalFee(TAdditionalFee tAdditionalFee);
	
	//软删除:更改费用状态(启用改为禁用)
	void delectTadditionalFeeById(TAdditionalFee tAdditionalFee);
	
	void updateTadditionalFeeById(TAdditionalFee tAdditionalFee);
	
	TAdditionalFee selectTadditionalFeeById(Integer additional_id);
	
	List<TAdditionalFee> selectTadditionalFees();
	
	List<TAdditionalFee> selectByWhere(TAdditionalFee tAdditionalFee);
	
	List<TAdditionalFee> selectAlltAdditionalFeesByCondition
	(TAdditionalFee tAdditionalFee,Integer pageIndex,Integer pageSize);
	
	List<TAdditionalFee> findUsersByPage(Integer currentPage, Integer pageSize ,TAdditionalFeeDto dto);

	int selectByPageCount(@Param("dto")TAdditionalFeeDto dto);
}
