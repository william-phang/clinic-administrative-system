package com.woniuxy.clinic.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.TAdditionalFee;

@SpringBootTest
class ClinicAdministrativeSystemApplicationTests {

	@Autowired
	TAdditionalFeeService tAdditionalFeeService;
	
	@Test
	void contextLoads() {
		TAdditionalFee tAdditionalFee=new TAdditionalFee();
//		tAdditionalFee.setAdditionalName("医疗费");
		tAdditionalFeeService.insertTAdditionalFee(tAdditionalFee);
	}
	
	@Test
	void contextLoad01() {
		
		tAdditionalFeeService.delectTadditionalFeeById(8);
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

}
