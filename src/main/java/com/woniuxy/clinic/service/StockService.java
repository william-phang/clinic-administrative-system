package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.Stock;

public interface StockService {
	Stock getstock_amount(int drug_sn);
	
	List<Stock> getStockAll();
}
