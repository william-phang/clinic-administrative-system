package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TMedicalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TMedicalFeeExample;
import com.woniuxy.clinic.exception.TMedicalFeeException;
import com.woniuxy.clinic.exception.TRegistrationException;
import com.woniuxy.clinic.mapper.TMedicalFeeMapper;
import com.woniuxy.clinic.service.TMedicalFeeService;

@Service("tMedicalFeeService")
public class TMedicalFeeServiceImpl implements TMedicalFeeService{

	@Autowired
	TMedicalFeeMapper tMedicalFeeMapper;
	
	@Override
	public void insertTMedicalFee(TMedicalFee tMedicalFee) {
		
		try {
			tMedicalFeeMapper.insert(tMedicalFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
	}

	@Override
	public void delectTMedicalFeeById(TMedicalFee tMedicalFee) {
		
		try {
			tMedicalFeeMapper.updateByPrimaryKey(tMedicalFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
	}

	@Override
	public void updateTMedicalFeeById(TMedicalFee tMedicalFee) {
		
		try {
			tMedicalFeeMapper.updateByPrimaryKey(tMedicalFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
	}

	@Override
	public List<TMedicalFee> selectTMedicalFees() {
		
		try {
			TMedicalFeeExample example=new TMedicalFeeExample();
			List<TMedicalFee> tMedicalFees = tMedicalFeeMapper.selectByExample(example);
			return tMedicalFees;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
	}
	
	@Override
	public TMedicalFee selectTMedicalFeeById(Integer medical_id) {
		
		try {
			TMedicalFee tMedicalFee = tMedicalFeeMapper.selectByPrimaryKey(medical_id);
			return tMedicalFee;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
	}

	@Override
	public List<TMedicalFee> selectByWhere(TMedicalFee tMedicalFee) {

		try {
			List<TMedicalFee> tMedicalFees = 
					tMedicalFeeMapper.selectByWhere(tMedicalFee);
			return tMedicalFees;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
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
		try {
			return tMedicalFeeMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
	}

	@Override
	public int selectByPageCount(TMedicalFeeDto dto) {
		
		try {
			return tMedicalFeeMapper.selectByPageCount(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TMedicalFeeException("系统维护中");
		}
	}


	
}
