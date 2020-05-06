package com.woniuxy.clinic.mapper;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Order_Medicine;

@SpringBootTest
class OrderTest {
	
	@Autowired
	OrderMapper orderMapper;
	
//	@Test
//	void test01() {
////		Date date = new Date();
////		System.out.println(date);
////		Order order = new Order(null, "1234", "零售", null, null, "aa", null, 12.44444, "1", "微信");
//		List<Order> orders = orderMapper.selectPaidOrders();
//		for (Order order : orders) {
//			System.out.println(order);
//		}
//	}
	
	@Test
	void test02() {
		Order order = new Order(1, "1234", "零售", null, null, "aa", null, 12.44444, "1", "微信");
		orderMapper.setOrderToRefunded(order);
		
	}
	
	@Test
	void test03() {
		List<Order_Medicine> order_Medecines = orderMapper.findOrder_MedecinesByOrder_id(1);
		System.out.println(order_Medecines);
		
	}

}
