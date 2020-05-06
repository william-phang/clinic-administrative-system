package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TRegistrationFeeDto;
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

	@Override
	public TRegistrationFee selectTRegistrationFeeById(Integer regis_id) {
		
		return tRegistrationFeeMapper.selectByPrimaryKey(regis_id);
	}

	@Override
	public List<TRegistrationFee> selectByWhere(TRegistrationFee tRegistrationFee) {
		List<TRegistrationFee> tRegistrationFees = 
				tRegistrationFeeMapper.selectByWhere(tRegistrationFee);
		return tRegistrationFees;
	}

	@Override
	public List<TRegistrationFee> selectAlltRegistrationFeesByCondition(TRegistrationFee tRegistrationFee,
			Integer pageIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TRegistrationFee> findUsersByPage(Integer currentPage, Integer pageSize, TRegistrationFeeDto dto) {
		// TODO Auto-generated method stub
		return tRegistrationFeeMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
	}

	@Override
	public int selectByPageCount(TRegistrationFeeDto dto) {
		// TODO Auto-generated method stub
		return tRegistrationFeeMapper.selectByPageCount(dto);
	}

	

	
}
