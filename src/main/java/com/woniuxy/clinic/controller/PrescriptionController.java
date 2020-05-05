package com.woniuxy.clinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.clinic.entity.Drug;
import com.woniuxy.clinic.entity.Stock;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.service.DrugService;
import com.woniuxy.clinic.service.StockService;

@Controller
public class PrescriptionController {
	
	@Autowired
	DrugService drugService;
	@Autowired
	StockService stockService;
	
	// 接收json数据返回json数据
	@ResponseBody
	@RequestMapping("/prescription")
	public List<Drug> test(@RequestBody List<Stock> stock) {
		List<Drug> drugs = new ArrayList<Drug>();
		if(stock.size()<1) {
			return drugs;
		}
		Drug drug=new Drug();
		try {
			for(Stock s:stock) {
				// 根据药品名称查询是否存在
				String name = s.getDrug().getName();
				drug = drugService.getDrug(name);
				drugs.add(drug);
			}
		} catch (PharmacyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return drugs;
	}
}
