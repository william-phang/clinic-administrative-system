package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TDrug;

public interface PharmacyService {

	List<TDrug> showDrugs(TDrug drug, Integer currentPage, Integer pageSize);

}
