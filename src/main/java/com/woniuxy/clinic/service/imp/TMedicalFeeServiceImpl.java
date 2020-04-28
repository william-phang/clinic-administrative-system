package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TMedicalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
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
	
	@Override
	public TMedicalFee selectTMedicalFeeById(Integer medical_id) {
		TMedicalFee tMedicalFee = tMedicalFeeMapper.selectByPrimaryKey(medical_id);
		
		return tMedicalFee;
	}

	@Override
	public List<TMedicalFee> selectByWhere(TMedicalFee tMedicalFee) {

		List<TMedicalFee> tMedicalFees = 
				tMedicalFeeMapper.selectByWhere(tMedicalFee);
		return tMedicalFees;
	}

	@Override
	public List<TMedicalFee> selectAlltMedicalFeesByCondition(TAdditionalFee tMedicalFee, Integer pageIndex,
			Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TMedicalFee> findUsersByPage(Integer currentPage, Integer pageSize, TMedicalFeeDto dto) {
		// TODO Auto-generated method stub
		return tMedicalFeeMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
	}

	@Override
	public int selectByPageCount(TMedicalFeeDto dto) {
		// TODO Auto-generated method stub
		return tMedicalFeeMapper.selectByPageCount(dto);
	}


	
}
