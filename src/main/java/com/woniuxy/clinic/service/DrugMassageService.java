package com.woniuxy.clinic.service;

public interface DrugMassageService {
	void add(Integer stock_id,String drugmassage_dose,String drugmassage_use,
			String drugmassage_fqt,String drugmassage_date,String drugmassage_type);
}
