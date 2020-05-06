package com.woniuxy.clinic.mapper;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.CaseMessage;
import com.woniuxy.clinic.entity.Drug;
import com.woniuxy.clinic.entity.PhysiqueMessage;
import com.woniuxy.clinic.entity.Stock;

@SpringBootTest
class caseTest {
	
	@Autowired
	CaseMapper tCaseMapper;
	@Autowired
	PhysiqueMessageMapper physiqueMessageMapper;
	@Autowired
	CaseMessageMapper caseMessageMapper;
	@Autowired
	StockMapper stockMapper;
	@Autowired
	DrugMapper drugMapper;
	@Autowired
	DrugMassageMapper drugMassageMapper;
	
	
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
	@Test
	void test04() {
		List<Stock> stocks = stockMapper.selectByAll();
		for (Stock stock : stocks) {
			System.out.println(stock);
		}
	}
	@Test
	void test05() {
		Drug drug = drugMapper.selectByname("复方氯化钠注射液");
		System.out.println(drug);
	}
	@Test
	void test06() {
		Integer drug_sn=1;
		String drugmassage_dose="se";
		String drugmassage_use="se";
		String drugmassage_fqt="se";
		String drugmassage_date="se";
		String drugmassage_type="se";
		drugMassageMapper.insertDrugMapper(drug_sn, drugmassage_dose, drugmassage_use, drugmassage_fqt, drugmassage_date, drugmassage_type);
	}
}
