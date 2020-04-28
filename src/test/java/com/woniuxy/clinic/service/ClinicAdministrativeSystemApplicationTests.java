package com.woniuxy.clinic.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TRegistrationFee;

@SpringBootTest
class ClinicAdministrativeSystemApplicationTests {

	@Autowired
	TAdditionalFeeService tAdditionalFeeService;
	
	@Autowired
	TRegistrationFeeService tRegistrationFeeService;
	
	@Test
	void contextLoads() {
		TAdditionalFee tAdditionalFee=new TAdditionalFee();
//		tAdditionalFee.setAdditionalName("医疗费");
		tAdditionalFeeService.insertTAdditionalFee(tAdditionalFee);
	}
	
	@Test
	void contextLoad01() {
		
		//tAdditionalFeeService.delectTadditionalFeeById(8);
	}
	
	@Test
	void contextLoad02() {
		
//		TAdditionalFee tAdditionalFee=
//				new TAdditionalFee(8,"注射费",new BigDecimal("20"),new BigDecimal("10"),new Date(),"张三","禁用");
//		tAdditionalFeeService.updateTadditionalFeeById(tAdditionalFee);
	}
	
	@Test
	void contextLoad03() {
		
		List<TAdditionalFee> tAdditionalFees = tAdditionalFeeService.selectTadditionalFees();
		System.out.println(tAdditionalFees);
	}
	
	@Test
	void contextLoad04() {
		
		TRegistrationFee tRegistrationFee=
				new TRegistrationFee(null,"专家挂号费",new BigDecimal("20"),new BigDecimal("10"),new Date(),"张三","启用");
		tRegistrationFeeService.insertTRegistrationFee(tRegistrationFee);
	}
	
	@Test
	void contextLoad05() {
		
		TAdditionalFee tAdditionalFee=new TAdditionalFee();
		List<TAdditionalFee> tAdditionalFees = 
				tAdditionalFeeService.selectByWhere(tAdditionalFee);
		System.out.println(tAdditionalFees);;
	}
	
	@Test
	void contextLoad06() {
		
		TAdditionalFee tAdditionalFee=new TAdditionalFee();
		Integer pageIndex=1;
		Integer pageSize=3;
		List<TAdditionalFee> tAdditionalFees = tAdditionalFeeService.selectAlltAdditionalFeesByCondition
		(tAdditionalFee, pageIndex, pageSize);
		System.out.println(tAdditionalFees);;
	}
}
