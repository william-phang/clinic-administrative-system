package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TAdditionalFeeExample;
import com.woniuxy.clinic.exception.TAdditionalFeeException;
import com.woniuxy.clinic.exception.TRegistrationException;
import com.woniuxy.clinic.mapper.TAdditionalFeeMapper;
import com.woniuxy.clinic.service.TAdditionalFeeService;

@Service("tAdditionalFeeService")
public class TAdditionalFeeServiceImpl implements TAdditionalFeeService{

	@Autowired
	TAdditionalFeeMapper tAdditionalFeeMapper;
	
	@Override
	public void insertTAdditionalFee(TAdditionalFee tAdditionalFee) {
		
		try {
			tAdditionalFeeMapper.insert(tAdditionalFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

	@Override
	public void delectTadditionalFeeById(TAdditionalFee tAdditionalFee) {
		
		try {
			tAdditionalFeeMapper.updateByPrimaryKey(tAdditionalFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
		
	}

	@Override
	public void updateTadditionalFeeById(TAdditionalFee tAdditionalFee) {
		
		try {
			tAdditionalFeeMapper.updateByPrimaryKey(tAdditionalFee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

	@Override
	public List<TAdditionalFee> selectTadditionalFees() {
		
		try {
			TAdditionalFeeExample example=new TAdditionalFeeExample();
			List<TAdditionalFee> tAdditionalFees = tAdditionalFeeMapper.selectByExample(example);
			return tAdditionalFees;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

	@Override
	public List<TAdditionalFee> selectByWhere(TAdditionalFee tAdditionalFee) {
		
		try {
			List<TAdditionalFee> tAdditionalFees = 
					tAdditionalFeeMapper.selectByWhere(tAdditionalFee);
			return tAdditionalFees;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

	@Override
	public TAdditionalFee selectTadditionalFeeById(Integer additional_id) {
		
		try {
			TAdditionalFee tAdditionalFee = tAdditionalFeeMapper.selectByPrimaryKey(additional_id);
			return tAdditionalFee;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

	//分页查询
	@Override
	public List<TAdditionalFee> selectAlltAdditionalFeesByCondition(TAdditionalFee tAdditionalFee, Integer pageIndex,
			Integer pageSize) {
		
		try {
			List<TAdditionalFee> tAdditionalFees = 
					tAdditionalFeeMapper.selectAlltAdditionalFeesByCondition
			(tAdditionalFee, (pageIndex-1)*pageSize, pageSize);
			return tAdditionalFees;
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

	@Override
	public List<TAdditionalFee> findUsersByPage(Integer currentPage, Integer pageSize, TAdditionalFeeDto dto) {
		
		try {
			return tAdditionalFeeMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

	@Override
	public int selectByPageCount(TAdditionalFeeDto dto) {
		
		try {
			return tAdditionalFeeMapper.selectByPageCount(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TAdditionalFeeException("系统维护中");
		}
	}

}
