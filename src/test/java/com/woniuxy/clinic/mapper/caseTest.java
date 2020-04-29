package com.woniuxy.clinic.mapper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.CaseMessage;
import com.woniuxy.clinic.entity.PhysiqueMessage;

@SpringBootTest
class caseTest {
	
	@Autowired
	CaseMapper tCaseMapper;
	@Autowired
	PhysiqueMessageMapper physiqueMessageMapper;
	@Autowired
	CaseMessageMapper caseMessageMapper;
	
	// 通过病历中的挂号记录id查询对应的所有信息
	@Test
	void test01() {
		Case selectTCase = tCaseMapper.selectTCase(1);
		System.out.println(selectTCase);
	}
	@Test
	void test02() {
		PhysiqueMessage physiqueMessage=new PhysiqueMessage(1, 11.0, 1, 
				1, 1, 1.0, 1.0, 1.0, 1.0);
		physiqueMessageMapper.insertPhysiqueMessage(physiqueMessage);
	}
	@Test
	void test03() {
		CaseMessage caseMessage=new CaseMessage(1, new Date(), "ss", "sa", 
				"as", "sa", "as", "s", "as", "das", "asd");
		caseMessageMapper.insertCaseMessage(caseMessage);
	}
}
