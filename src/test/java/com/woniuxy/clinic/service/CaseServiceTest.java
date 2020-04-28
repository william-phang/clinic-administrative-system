package com.woniuxy.clinic.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.Case;

@SpringBootTest
class CaseServiceTest {

	@Autowired
	CaseService caseService;
	@Test
	void contextLoads() {
		Case tCase = caseService.getTCase(1);
		System.out.println(tCase);
	}
}
