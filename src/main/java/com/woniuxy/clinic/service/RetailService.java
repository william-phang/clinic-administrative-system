package com.woniuxy.clinic.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.Retail_Medicine;

public interface RetailService {

	void insertRetailMedecines(Integer medical_id);

	PageInfo showRetailMedicines(Integer currentPage, Integer pageSize);

	void addOne(Integer drug_sn);

	void delete(Integer drug_sn);

	void reduceOne(Integer drug_sn);

	List<Retail_Medicine> findRetailMedince();

	void saveOrderInfo(List<Retail_Medicine> retail_drugs, Double total, String patient_sn);

	void savePayInfo(List<Retail_Medicine> retail_drugs, Double total,  String patient_sn);

	

}
