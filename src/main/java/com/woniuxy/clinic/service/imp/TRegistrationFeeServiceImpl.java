package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TRegistrationFeeDto;
import com.woniuxy.clinic.entity.TRegistrationFee;
import com.woniuxy.clinic.entity.TRegistrationFeeExample;
import com.woniuxy.clinic.exception.TMedicalFeeException;
import com.woniuxy.clinic.exception.TRegistrationFeeException;
import com.woniuxy.clinic.mapper.TRegistrationFeeMapper;
import com.woniuxy.clinic.service.TRegistrationFeeService;

@Service("tRegistrationFeeService")
public class TRegistrationFeeServiceImpl implements TRegistrationFeeService{

	@Autowired
	TRegistrationFeeMapper tRegistrationFeeMapper;
	
	@Override
	public void insertTRegistrationFee(TRegistrationFee tRegistrationFee) {
		
		try {
			tRegistrationFeeMapper.insert(tRegistrationFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	@Override
	public void delectTRegistrationFeeById(TRegistrationFee tRegistrationFee) {
		
		try {
			tRegistrationFeeMapper.updateByPrimaryKey(tRegistrationFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	@Override
	public void updateTRegistrationFeeById(TRegistrationFee tRegistrationFee) {
		
		try {
			tRegistrationFeeMapper.updateByPrimaryKey(tRegistrationFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	@Override
	public List<TRegistrationFee> selectTRegistrationFees() {
		
		try {
			TRegistrationFeeExample example=new TRegistrationFeeExample();
			List<TRegistrationFee> tRegistrationFees = tRegistrationFeeMapper.selectByExample(example);
			return tRegistrationFees;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	@Override
	public TRegistrationFee selectTRegistrationFeeById(Integer regis_id) {
		
		try {
			return tRegistrationFeeMapper.selectByPrimaryKey(regis_id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	@Override
	public List<TRegistrationFee> selectByWhere(TRegistrationFee tRegistrationFee) {
		
		try {
			List<TRegistrationFee> tRegistrationFees = 
					tRegistrationFeeMapper.selectByWhere(tRegistrationFee);
			return tRegistrationFees;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	@Override
	public List<TRegistrationFee> selectAlltRegistrationFeesByCondition(TRegistrationFee tRegistrationFee,
			Integer pageIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TRegistrationFee> findUsersByPage(Integer currentPage, Integer pageSize, TRegistrationFeeDto dto) {
		
		try {
			return tRegistrationFeeMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	@Override
	public int selectByPageCount(TRegistrationFeeDto dto) {
		
		try {
			return tRegistrationFeeMapper.selectByPageCount(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationFeeException("系统维护中");
		}
	}

	

	
}
