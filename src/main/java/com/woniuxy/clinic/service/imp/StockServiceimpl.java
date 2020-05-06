package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.Stock;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.mapper.StockMapper;
import com.woniuxy.clinic.service.StockService;

@Service
public class StockServiceimpl implements StockService {

	@Autowired
	StockMapper stockMapper;
	
	@Override
	public Stock getstock_amount(int drug_sn) {
		if(drug_sn<0) {
			throw new PharmacyException("数据不合法");
		}
		Stock stock = stockMapper.selelctBydrug_sn(drug_sn);
		if(stock==null) {
			throw new PharmacyException("没有次数据");
		}
		return stock;
	}

	@Override
	public List<Stock> getStockAll() {
		List<Stock> selectByAll = stockMapper.selectByAll();
		if(selectByAll==null) {
			throw new PharmacyException("数据为空");
		}
		return selectByAll;
	}
	
}
