package com.woniuxy.clinic.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.mapper.DrugMapper;
import com.woniuxy.clinic.mapper.DrugMassageMapper;
import com.woniuxy.clinic.service.DrugMassageService;

@Service
public class DrugMassageServiceImpl implements DrugMassageService {

	@Autowired
	DrugMassageMapper drugMassageMapper;
	
	@Override
	public void add(Integer stock_id, String drugmassage_dose, String drugmassage_use, String drugmassage_fqt,
			String drugmassage_date, String drugmassage_type) {
		drugMassageMapper.insertDrugMapper(stock_id, drugmassage_dose, drugmassage_use, drugmassage_fqt, drugmassage_date, drugmassage_type);
		
	}

}
