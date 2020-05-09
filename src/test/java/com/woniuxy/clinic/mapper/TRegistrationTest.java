package com.woniuxy.clinic.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.dto.TRegistrationDto;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TRegistration;

@SpringBootTest
class TRegistrationTest {
	
	@Autowired
	TRegistrationMapper tRegistrationMapper;
	
	
	// 通过病历中的挂号记录id查询对应的所有信息
	@Test
	void test01() {
		
		TRegistrationDto dto=new TRegistrationDto();
		Patient patient=new Patient();
		dto.setPatient(patient);
		System.out.println(tRegistrationMapper.selectByPageCount(dto));
	}
	
	@Test
	void test02() throws ParseException {
		
		TRegistrationDto dto=new TRegistrationDto();
		//dto.setReception_status("已退号");
		String str="2020-05-05";
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(str);
        System.out.println("字符串类型的日期："+date);
//		dto.setRe_create_time(new Date());
//		Patient patient=new Patient();
//		//patient.setPatient_name("张三");
//		dto.setPatient(patient);
//		Integer currentPage=1;
//		Integer pageSize=1;
//		List<TRegistration> tRegistrations = 
//				tRegistrationMapper.selectByPage((currentPage-1)*pageSize, pageSize, dto);
//		System.out.println(tRegistrations);
	}
	
}
