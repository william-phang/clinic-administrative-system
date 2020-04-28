package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.TRegistrationFee;
import com.woniuxy.clinic.entity.TRegistrationFeeExample;
import com.woniuxy.clinic.mapper.TRegistrationFeeMapper;
import com.woniuxy.clinic.service.TRegistrationFeeService;

@Service("tRegistrationFeeService")
public class TRegistrationFeeServiceImpl implements TRegistrationFeeService{

	@Autowired
	TRegistrationFeeMapper tRegistrationFeeMapper;
	
	@Override
	public void insertTRegistrationFee(TRegistrationFee tRegistrationFee) {
		
		tRegistrationFeeMapper.insert(tRegistrationFee);
	}

	@Override
	public void delectTRegistrationFeeById(TRegistrationFee tRegistrationFee) {
		
		tRegistrationFeeMapper.updateByPrimaryKey(tRegistrationFee);
	}

	@Override
	public void updateTRegistrationFeeById(TRegistrationFee tRegistrationFee) {
		
		tRegistrationFeeMapper.updateByPrimaryKey(tRegistrationFee);
	}

	@Override
	public List<TRegistrationFee> selectTRegistrationFees() {
		TRegistrationFeeExample example=new TRegistrationFeeExample();
		List<TRegistrationFee> tRegistrationFees = tRegistrationFeeMapper.selectByExample(example);
		return tRegistrationFees;
	}

	

	
}
