package com.woniuxy.clinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.clinic.entity.TCase;
import com.woniuxy.clinic.service.CaseService;

@Controller
public class CaseController {
	
	@Autowired
	CaseService caseService;
	
	@ResponseBody
	@RequestMapping("/case")
	public TCase test1() {
		return caseService.getTCase(1);
	}
}
