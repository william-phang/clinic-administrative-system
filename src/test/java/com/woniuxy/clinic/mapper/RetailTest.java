package com.woniuxy.clinic.mapper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.CaseMessage;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.PhysiqueMessage;

@SpringBootTest
class RetailTest {
	
	@Autowired
	RetailMapper retailMapper;
	
//	@Test
//	void test01() {
////		Date date = new Date();
////		System.out.println(date);
//		Order order = new Order(null, "444444", "零售", null, null, "aa", null, 321.99, "3", "卫星");
//		retailMapper.insertOrder(order);
//	}

}
