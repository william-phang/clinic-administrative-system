package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.service.PharmacyService;
import com.woniuxy.clinic.util.CommonResult;

//药房
@Controller
public class PharmacyController {
	@Autowired
	PharmacyService pharmacyService;
	@RequestMapping("/pharmacy/drug_info.do")
	public String showDrugList() {
		System.out.println(111);
		return "drug_info_list";
	}
	@ResponseBody
	@RequestMapping("/pharmacy/drugInfoList")
	public CommonResult showDrugs(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,
            TDrug drug) {
		PageInfo info = null;
        try {
        	List<TDrug> drugs = pharmacyService.showDrugs(drug,currentPage,pageSize);
            info = new PageInfo(drugs);
            return CommonResult.success(info);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
	}
	
	
}
