package com.woniuxy.clinic.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.Case;

@SpringBootTest
class caseTest {
	
	@Autowired
	CaseMapper tCaseMapper;
	
	// 通过病历中的挂号记录id查询对应的所有信息
	@Test
	void test01() {
		Case selectTCase = tCaseMapper.selectTCase(1);
		System.out.println(selectTCase);
	}
}
