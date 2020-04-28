package com.woniuxy.clinic.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.DrugDto;
import com.woniuxy.clinic.dto.InputDto;
import com.woniuxy.clinic.dto.OutputDto;
import com.woniuxy.clinic.entity.TDrug;

public interface PharmacyService {

	PageInfo showDrugsByCondition(DrugDto drugDto, Integer currentPage, Integer pageSize);

	TDrug findDrugInfoByDrug_sn(Integer drug_sn);

	void saveDrugInfo(TDrug tDrug);

	void editDrugInfoStatus(Integer drug_sn, Integer status);

	PageInfo showInputsByCondition(InputDto inputDto, Integer currentPage, Integer pageSize);

	PageInfo showOutputsByCondition(OutputDto outputDto, Integer currentPage, Integer pageSize);

}
