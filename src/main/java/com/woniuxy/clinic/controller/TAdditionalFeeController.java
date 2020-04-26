package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.clinic.common.CommonResult;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.service.TAdditionalFeeService;


@Controller
public class TAdditionalFeeController {

	@Autowired
	TAdditionalFeeService tAdditionalFeeService;
	
	@ResponseBody
	@GetMapping("/tAdditionalFeesajax")
	public Object selecttAdditionalFeesajax(Model model) {
		List<TAdditionalFee> tAadditionalFees = 
				tAdditionalFeeService.selectTadditionalFees();
		CommonResult<TAdditionalFee> result=
				new CommonResult<TAdditionalFee>(0L, "成功", tAadditionalFees);
		return result;
	}
	
	@RequestMapping("/tAdditionalFees")
	public String selecttAdditionalFees(Model model) {
		return "page/fee/tadditionalFeelist";
	}
}
