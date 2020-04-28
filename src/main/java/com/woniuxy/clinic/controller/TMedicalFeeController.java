package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.service.TAdditionalFeeService;
import com.woniuxy.clinic.service.TMedicalFeeService;


@Controller
public class TMedicalFeeController {

	@Autowired
	TMedicalFeeService tMedicalFeeService;
	
	@ResponseBody
	@GetMapping("/tMedicalFees")
	public List<TMedicalFee> selecttMedicalFeeS(Model model) {
		List<TMedicalFee> tMedicalFees = tMedicalFeeService.selectTMedicalFees();
		return tMedicalFees;
	}
}
