package com.woniuxy.clinic.mapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TAdditionalFeeExample;
import com.woniuxy.clinic.entity.TAdditionalFeeExample.Criteria;

@SpringBootTest
class ClinicAdministrativeSystemApplicationTests {
	//null,"注射费",20.00,10.00,new Date(),"章三","启用"
	@Autowired
	TAdditionalFeeMapper additionalFeeMapper;
	
	@Test
	void contextLoads() {
//		TAdditionalFee tAdditionalFee=
//				new TAdditionalFee(null,"注射费",new BigDecimal("20"),new BigDecimal("10"),new Date(),"张三","启用");
//		additionalFeeMapper.insert(tAdditionalFee);
	}

	@Test
	void contextLoads01() {
		additionalFeeMapper.deleteByPrimaryKey(5);
	}
	
	@Test
	void contextLoads02() {
//		TAdditionalFee tAdditionalFee=
//				new TAdditionalFee(1,"注射费",new BigDecimal("25"),new BigDecimal("10"),new Date(),"张三","启用");;
//		additionalFeeMapper.updateByPrimaryKey(tAdditionalFee);
	}
	
	@Test
	void contextLoads03() {
		TAdditionalFeeExample example=new TAdditionalFeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdditionalFeeGreaterThan(new BigDecimal("20"));
		List<TAdditionalFee> additionalFees = additionalFeeMapper.selectByExample(example);
		System.out.println(additionalFees);
	}
}
