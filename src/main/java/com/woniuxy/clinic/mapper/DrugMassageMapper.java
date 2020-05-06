package com.woniuxy.clinic.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DrugMassageMapper {
	void insertDrugMapper(Integer stock_id,String drugmassage_dose,String drugmassage_use,
			String drugmassage_fqt,String drugmassage_date,String drugmassage_type);
}
