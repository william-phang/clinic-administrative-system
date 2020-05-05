package com.woniuxy.clinic;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.clinic.entity.Stock;
import com.woniuxy.clinic.service.StockService;

@SpringBootTest
class ClinicAdministrativeSystemApplicationTests {

	@Autowired
	StockService stockService;
	
	@Test
	void contextLoads() {
	}
	@Test
	void test1() {
		List<Stock> stocks = stockService.getStockAll();
		
		for(Stock stock:stocks) {
			System.out.println(stock);
		}
	}
	
}
