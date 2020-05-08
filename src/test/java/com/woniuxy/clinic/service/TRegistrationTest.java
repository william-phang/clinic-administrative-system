package com.woniuxy.clinic.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.dto.TRegistrationDto;
import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TRegistration;
import com.woniuxy.clinic.mapper.TRegistrationMapper;

@SpringBootTest
class TRegistrationTest {

	@Autowired
	TRegistrationMapper tRegistrationMapper;
	
	@Test
	void test01() {
		
		TRegistrationDto dto=new TRegistrationDto();
		Patient patient=new Patient();
		dto.setPatient(patient);
		System.out.println(tRegistrationMapper.selectByPageCount(dto));
	}
	
	@Test
	void test02() {
		
		TRegistrationDto dto=new TRegistrationDto();
		//dto.setReception_status("已退号");
		Patient patient=new Patient();
		//patient.setPatient_name("张三");
		dto.setPatient(patient);
		Integer currentPage=1;
		Integer pageSize=1;
		List<TRegistration> tRegistrations = 
				tRegistrationMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
		System.out.println(tRegistrations);
	}
}
