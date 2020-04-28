package com.woniuxy.clinic.mapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TAdditionalFeeExample;
import com.woniuxy.clinic.entity.TAdditionalFeeExample.Criteria;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TMedicalFeeExample;

@SpringBootTest
class ClinicAdministrativeSystemApplicationTests {

	@Autowired
	TAdditionalFeeMapper additionalFeeMapper;

	@Autowired
	TMedicalFeeMapper medicalFeeMapper;

	@Test
	void contextLoads() {
		TAdditionalFee tAdditionalFee = new TAdditionalFee(1, "心电图费", new BigDecimal("20"), new BigDecimal("10"),
				new Date(), "张三", "启用");
		additionalFeeMapper.insert(tAdditionalFee);
	}

	@Test
	void contextLoads01() {
		additionalFeeMapper.deleteByPrimaryKey(1);
	}

	@Test
	void contextLoads02() {
//		TAdditionalFee tAdditionalFee=
//				new TAdditionalFee(1,"注射费",new BigDecimal("25"),new BigDecimal("10"),new Date(),"张三","启用");;
//		additionalFeeMapper.updateByPrimaryKey(tAdditionalFee);
	}

	@Test
	void contextLoads03() {
		TAdditionalFeeExample example = new TAdditionalFeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdditional_feeGreaterThan(new BigDecimal("20"));
		List<TAdditionalFee> additionalFees = additionalFeeMapper.selectByExample(example);
		System.out.println(additionalFees);
	}

	@Test
	void contextLoads033() {

		TAdditionalFee tAdditionalFee = additionalFeeMapper.selectByPrimaryKey(2);
		System.out.println(tAdditionalFee);
	}

	@Test
	void contextLoads04() {

		TMedicalFee medicalFee = new TMedicalFee(null, "专家诊疗费", new BigDecimal("20"), new BigDecimal("10"), new Date(),
				"张三", "启用");
		medicalFeeMapper.insert(medicalFee);
	}

	@Test
	void contextLoads05() {
		TMedicalFee medicalFee = new TMedicalFee(1, "专家诊疗费", new BigDecimal("20"), new BigDecimal("10"), new Date(),
				"张三", "禁用");
		medicalFeeMapper.updateByPrimaryKey(medicalFee);
	}

	@Test
	void contextLoads06() {

		TMedicalFeeExample example = new TMedicalFeeExample();
		List<TMedicalFee> tMedicalFees = medicalFeeMapper.selectByExample(example);
		System.out.println(tMedicalFees);
	}

	@Test
	void contextLoads07() {

		TAdditionalFee tAdditionalFee = new TAdditionalFee();
		tAdditionalFee.setAdditional_founder("张三");
		List<TAdditionalFee> tMedicalFees = additionalFeeMapper.selectByWhere(tAdditionalFee);
		System.out.println(tMedicalFees);
	}

	@Test
	void contextLoads08() {

		TAdditionalFee tAdditionalFee = new TAdditionalFee();
		System.out.println(additionalFeeMapper.selectAlltAdditionalFeesCount(tAdditionalFee));

	}

	@Test
	void contextLoads09() {

		int pageSize = 6;
		int pageIndex = 1;
		TAdditionalFee tAdditionalFee = new TAdditionalFee();
		List<TAdditionalFee> tAdditionalFees = additionalFeeMapper.selectAlltAdditionalFeesByCondition(tAdditionalFee,
				(pageIndex - 1) * pageSize, pageSize);
		System.out.println(tAdditionalFees);
	}

	@Test
	void contextLoads10() {
		// pageNum:起始页
		// pageSize:页大小
		PageHelper.startPage(1, 3);
		TAdditionalFeeExample example = new TAdditionalFeeExample();
		List<TAdditionalFee> tAdditionalFees = additionalFeeMapper.selectByExample(example);
		PageInfo<TAdditionalFee> tAdditionalFeesPage = new PageInfo<>(tAdditionalFees);
		for (TAdditionalFee tAdditionalFee : tAdditionalFeesPage.getList()) {
			System.out.println(tAdditionalFee);
		}
		System.out.println(tAdditionalFeesPage.getFirstPage());
		System.out.println(tAdditionalFeesPage.getLastPage());
		System.out.println(tAdditionalFeesPage.getTotal());
		System.out.println(tAdditionalFeesPage.getPageNum());
	}
}
