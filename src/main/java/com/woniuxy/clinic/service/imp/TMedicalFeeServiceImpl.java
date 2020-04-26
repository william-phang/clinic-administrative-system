package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TMedicalFeeExample;
import com.woniuxy.clinic.mapper.TMedicalFeeMapper;
import com.woniuxy.clinic.service.TMedicalFeeService;

@Service("tMedicalFeeService")
public class TMedicalFeeServiceImpl implements TMedicalFeeService{

	@Autowired
	TMedicalFeeMapper tMedicalFeeMapper;
	
	@Override
	public void insertTMedicalFee(TMedicalFee tMedicalFee) {
		
		tMedicalFeeMapper.insert(tMedicalFee);
	}

	@Override
	public void delectTMedicalFeeById(TMedicalFee tMedicalFee) {
		tMedicalFeeMapper.updateByPrimaryKey(tMedicalFee);
		
	}

	@Override
	public void updateTMedicalFeeById(TMedicalFee tMedicalFee) {
		
		tMedicalFeeMapper.updateByPrimaryKey(tMedicalFee);
	}

	@Override
	public List<TMedicalFee> selectTMedicalFees() {
		TMedicalFeeExample example=new TMedicalFeeExample();
		List<TMedicalFee> tMedicalFees = tMedicalFeeMapper.selectByExample(example);
		return tMedicalFees;
	}

	
}
