package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.DrugDto;
import com.woniuxy.clinic.dto.InputDto;
import com.woniuxy.clinic.dto.OutputDto;
import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.entity.TInputRecord;
import com.woniuxy.clinic.entity.TOutputRecord;
import com.woniuxy.clinic.mapper.TDrugMapper;
import com.woniuxy.clinic.mapper.TInputRecordMapper;
import com.woniuxy.clinic.mapper.TOutputRecordMapper;
import com.woniuxy.clinic.service.PharmacyService;
@Service
public class PharmacyServiceImp implements PharmacyService{
	@Autowired
	private TDrugMapper tDrugMapper;
	@Autowired
	private TInputRecordMapper tInputRecordMapper;
	@Autowired
	private TOutputRecordMapper tOutputRecordMapper;
	@Override
	public PageInfo showDrugsByCondition(DrugDto drugDto, Integer currentPage, Integer pageSize) {
		Integer beginIndex = pageSize*(currentPage-1);
		try {
			//查询总条数
			Integer total = tDrugMapper.selectDrugsNumByCondition(drugDto);
			List<TDrug> tDrugs = tDrugMapper.selectDrugsByCondition(drugDto, beginIndex, pageSize);
			PageInfo<TDrug> pageInfo = new PageInfo<>(tDrugs);
			pageInfo.setTotal(total);
			return pageInfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public TDrug findDrugInfoByDrug_sn(Integer drug_sn) {
		return tDrugMapper.findDrugInfoByDrug_sn(drug_sn);
	}
	@Override
	public void saveDrugInfo(TDrug tDrug) {
		if(tDrug.getDrug_sn()!=null) {
			tDrugMapper.updateDrugInfoByDrug_sn(tDrug);
		}else {
			tDrugMapper.insertDrugInfo(tDrug);
		}
	}
	@Override
	public void editDrugInfoStatus(Integer drug_sn, Integer status) {
		if(status == 1) {
			status = 0;
		}else {
			status = 1;
		}
		tDrugMapper.editDrugInfoStatus(drug_sn,status);
	}
	@Override
	public PageInfo showInputsByCondition(InputDto inputDto, Integer currentPage, Integer pageSize) {
		Integer beginIndex = pageSize*(currentPage-1);
		try {
			//查询总条数
			Integer total = tInputRecordMapper.selectInputsNumByCondition(inputDto);
			List<TInputRecord> inputs = tInputRecordMapper.selectInputsByCondition(inputDto, beginIndex, pageSize);
			PageInfo<TInputRecord> pageInfo = new PageInfo<>(inputs);
			pageInfo.setTotal(total);
			return pageInfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public PageInfo showOutputsByCondition(OutputDto outputDto, Integer currentPage, Integer pageSize) {
		Integer beginIndex = pageSize*(currentPage-1);
		try {
			//查询总条数
			Integer total = tOutputRecordMapper.selectOutputsNumByCondition(outputDto);
			List<TOutputRecord> outputs = tOutputRecordMapper.selectOutputsByCondition(outputDto, beginIndex, pageSize);
			PageInfo<TOutputRecord> pageInfo = new PageInfo<>(outputs);
			pageInfo.setTotal(total);
			return pageInfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
