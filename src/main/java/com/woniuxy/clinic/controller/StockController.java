package com.woniuxy.clinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.common.CommonResult;
import com.woniuxy.clinic.common.ResultUtil;
import com.woniuxy.clinic.entity.Stock;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@ResponseBody
	@RequestMapping("/stock")
	public CommonResult<Stock> getStockAll(){
		CommonResult<Stock> comm=new CommonResult<Stock>();
		List<Stock> stocks = new ArrayList<Stock>();
		try {
			stocks = stockService.getStockAll();
			comm.setData(stocks);
			long l=200;
			comm.setCode(l);
		} catch (PharmacyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return comm;
	}
	
}
