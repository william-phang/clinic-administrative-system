package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TAdditionalFeeExample;
import com.woniuxy.clinic.mapper.TAdditionalFeeMapper;
import com.woniuxy.clinic.service.TAdditionalFeeService;

@Service("tAdditionalFeeService")
public class TAdditionalFeeServiceImpl implements TAdditionalFeeService{

	@Autowired
	TAdditionalFeeMapper tAdditionalFeeMapper;
	
	@Override
	public void insertTAdditionalFee(TAdditionalFee tAdditionalFee) {
		tAdditionalFeeMapper.insert(tAdditionalFee);
		
	}

	@Override
	public void delectTadditionalFeeById(int additional_id) {
		tAdditionalFeeMapper.deleteByPrimaryKey(additional_id);
		
	}

	@Override
	public void updateTadditionalFeeById(TAdditionalFee tAdditionalFee) {
		tAdditionalFeeMapper.updateByPrimaryKey(tAdditionalFee);
		
	}

	@Override
	public List<TAdditionalFee> selectTadditionalFees() {
		TAdditionalFeeExample example=new TAdditionalFeeExample();
		List<TAdditionalFee> tAdditionalFees = tAdditionalFeeMapper.selectByExample(example);
		return tAdditionalFees;
	}

	@Override
	public List<TAdditionalFee> selectByWhere(TAdditionalFee tAdditionalFee) {
		List<TAdditionalFee> tAdditionalFees = 
				tAdditionalFeeMapper.selectByWhere(tAdditionalFee);
		return tAdditionalFees;
	}

}
