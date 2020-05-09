package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.dto.TRegistrationDto;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TRegistration;
import com.woniuxy.clinic.exception.TRegistrationException;
import com.woniuxy.clinic.mapper.TRegistrationMapper;
import com.woniuxy.clinic.service.TRegistrationService;

@Service("tRegistrationService")
public class TRegistrationServiceImpl implements TRegistrationService{

	@Autowired
	TRegistrationMapper tRegistrationMapper;

	@Override
	public List<TRegistration> findUsersByPage(Integer currentPage, Integer pageSize, TRegistrationDto dto) {
		try {
			return tRegistrationMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationException("系统维护中");
		}
		
	}

	@Override
	public int selectByPageCount(TRegistrationDto dto) {
		
		try {
			return tRegistrationMapper.selectByPageCount(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new TRegistrationException("系统维护中");
		}
	}
	
	

}
