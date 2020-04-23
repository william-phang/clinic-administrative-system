package com.woniuxy.clinic.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.Case_message;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.Physique_message;

@Controller
public class CaseController {
	
//	@ResponseBody
//	@RequestMapping("/case")
//	public Case test1() {
//		Integer case_id=1;
//		Date date = new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		Patient patient=new Patient(1, "王蒙", "028100159", 25, new Date(), 
//				"男", "18854134566", "1234567891234567891", "初诊", "广东省深圳市", "幸福街");
//		
//		Physique_message physique_message=new Physique_message(1, 37.0, 120, 110, 75, 180.7, 140.0, 60.0, 70.0);
//		Date parse=null;
//		try {
//			parse = sdf.parse("2017-8-9");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		Case_message case_message=new Case_message(1 , parse, 
//				"头疼", "脚疼", "哪里都疼", "无", 
//				"疼死了", "无", "无", "建议当场去世" , "假病");
//		Case case1 = new Case(case_id, patient, case_message, physique_message);
//		return case1;
//	}
}
