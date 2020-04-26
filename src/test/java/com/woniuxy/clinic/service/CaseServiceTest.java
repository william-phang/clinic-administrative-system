package com.woniuxy.clinic.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.TCase;

@SpringBootTest
class CaseServiceTest {

	@Autowired
	CaseService caseService;
	@Test
	void contextLoads() {
		TCase tCase = caseService.getTCase(1);
		System.out.println(tCase);
	}
}
