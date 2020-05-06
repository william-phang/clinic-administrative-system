package com.woniuxy.clinic.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.clinic.entity.Drug;
import com.woniuxy.clinic.entity.DrugT;
import com.woniuxy.clinic.entity.Stock;
import com.woniuxy.clinic.service.DrugMassageService;
import com.woniuxy.clinic.service.DrugService;
import com.woniuxy.clinic.service.StockService;

@Controller
public class DrugmassageController {
	
	@Autowired
	DrugService drugService;
	@Autowired
	StockService stockService;
	@Autowired
	DrugMassageService drugMassageService;
	
	@ResponseBody
	@RequestMapping("/drugmassage")
	public String test(@RequestBody List<DrugT> drugT) {
		for (DrugT drugT2 : drugT) {
			System.out.println("drugT2="+drugT2);
			// 根据药品名称查询id根据id查询stockid
			String name = drugT2.getName();
			Drug drug = drugService.getDrug(name);
			Integer drug_sn = drug.getDrug_sn();
			Stock stock = stockService.getstock_amount(drug_sn);
			Integer stock_id = stock.getStock_id();
			String drugmassage_dose = drugT2.getDrugmassage_dose();
			String drugmassage_use = drugT2.getDrugmassage_use();
			String drugmassage_fqt = drugT2.getDrugmassage_fqt();
			String drugmassage_date = drugT2.getDrugmassage_date();
			String drugmassage_type = drugT2.getDrugmassage_type();
			// 将数据插入Drugmassage
			drugMassageService.add(stock_id, drugmassage_dose, drugmassage_use, drugmassage_fqt, drugmassage_date, drugmassage_type);
			// 将信息插入到病历表中
			
		}
		return "OK";
	}
}
