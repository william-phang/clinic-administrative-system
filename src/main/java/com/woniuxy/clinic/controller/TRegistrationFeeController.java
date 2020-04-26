package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.clinic.entity.TRegistrationFee;
import com.woniuxy.clinic.service.TRegistrationFeeService;


@Controller
public class TRegistrationFeeController {

	@Autowired
	TRegistrationFeeService tRegistrationFeeService;
	
	@ResponseBody
	@GetMapping("/tRegistrationFees")
	public List<TRegistrationFee> selecttRegistrationFeeS(Model model) {
		List<TRegistrationFee> tRegistrationFees = 
				tRegistrationFeeService.selectTRegistrationFees();
		return tRegistrationFees;
	}
}
