package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
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
	public void delectTadditionalFeeById(TAdditionalFee tAdditionalFee) {
		tAdditionalFeeMapper.updateByPrimaryKey(tAdditionalFee);
		
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

	@Override
	public TAdditionalFee selectTadditionalFeeById(Integer additional_id) {
		TAdditionalFee tAdditionalFee = tAdditionalFeeMapper.selectByPrimaryKey(additional_id);
		return tAdditionalFee;
	}

	//分页查询
	@Override
	public List<TAdditionalFee> selectAlltAdditionalFeesByCondition(TAdditionalFee tAdditionalFee, Integer pageIndex,
			Integer pageSize) {
		List<TAdditionalFee> tAdditionalFees = 
				tAdditionalFeeMapper.selectAlltAdditionalFeesByCondition
		(tAdditionalFee, (pageIndex-1)*pageSize, pageSize);
		return tAdditionalFees;
	}

	@Override
	public List<TAdditionalFee> findUsersByPage(Integer currentPage, Integer pageSize, TAdditionalFeeDto dto) {
		
		return tAdditionalFeeMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
	}

	@Override
	public int selectByPageCount(TAdditionalFeeDto dto) {
		
		return tAdditionalFeeMapper.selectByPageCount(dto);
	}

}
