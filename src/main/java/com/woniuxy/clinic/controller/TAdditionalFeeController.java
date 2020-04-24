package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.service.TAdditionalFeeService;


@Controller
public class TAdditionalFeeController {

	@Autowired
	TAdditionalFeeService tAdditionalFeeService;
	
	@GetMapping("/tAdditionalFees")
	public String selecttAdditionalFeeS(Model model) {
		List<TAdditionalFee> tAadditionalFees = 
				tAdditionalFeeService.selectTadditionalFees();
		model.addAttribute("tAadditionalFees", tAadditionalFees);
		return "tAadditionalFeelist";
	}
}
