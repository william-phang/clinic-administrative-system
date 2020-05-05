package com.woniuxy.clinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.clinic.entity.CaseMessage;
import com.woniuxy.clinic.entity.PhysiqueMessage;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.service.PhysiqueMessageService;
import com.woniuxy.clinic.service.imp.CaseServiceImpl;

// 体格信息/病历详情录入数据库操作
@Controller
public class PhysiqueMessageController {
	@Autowired
	PhysiqueMessageService physiqueMessageService;		
	
//	@Transactional(isolation= Isolation.DEFAULT,propagation= Propagation.REQUIRED,rollbackFor = Exception.class)
	@RequestMapping("/test")
	public String validate(Model model,@Validated PhysiqueMessage physiqueMessage,@Validated CaseMessage CaseMessage,BindingResult br) {				
//		System.out.println("CaseMessage: "+CaseMessage);
		// 后端效验信息
		int count = br.getErrorCount();
		model.addAttribute("physiqueMessage", physiqueMessage);
		if(count>0) {
			FieldError physiquemessage_animalError = br.getFieldError("physiquemessage_animal");
			FieldError physiquemessage_breatheError = br.getFieldError("physiquemessage_breathe");
			FieldError physiquemessage_pulseError = br.getFieldError("physiquemessage_pulse");
			FieldError physiquemessage_BPError = br.getFieldError("physiquemessage_BP");		
			FieldError physiquemessage_heightError = br.getFieldError("physiquemessage_height");		
			FieldError physiquemessage_weightError = br.getFieldError("physiquemessage_weight");		
			FieldError physiquemessage_bgError = br.getFieldError("physiquemessage_bg");		
			FieldError physiquemessage_bfError = br.getFieldError("physiquemessage_bf");		
			FieldError casemessage_dateError = br.getFieldError("casemessage_date");		
			if(physiquemessage_animalError!=null) {
				model.addAttribute("physiquemessage_animalError", physiquemessage_animalError.getDefaultMessage());
			}
			if(physiquemessage_breatheError!=null) {
				model.addAttribute("physiquemessage_breatheError", physiquemessage_breatheError.getDefaultMessage());
			}
			if(physiquemessage_pulseError!=null) {
				model.addAttribute("physiquemessage_pulseError", physiquemessage_pulseError.getDefaultMessage());
			}
			if(physiquemessage_BPError!=null) {
				model.addAttribute("physiquemessage_BPError", physiquemessage_BPError.getDefaultMessage());
			}
			if(physiquemessage_heightError!=null) {
				model.addAttribute("physiquemessage_heightError", physiquemessage_heightError.getDefaultMessage());
			}
			if(physiquemessage_weightError!=null) {
				model.addAttribute("physiquemessage_weightError", physiquemessage_weightError.getDefaultMessage());
			}
			if(physiquemessage_bgError!=null) {
				model.addAttribute("physiquemessage_bgError", physiquemessage_bgError.getDefaultMessage());
			}
			if(physiquemessage_bfError!=null) {
				model.addAttribute("physiquemessage_bfError", physiquemessage_bfError.getDefaultMessage());
			}
			if(casemessage_dateError!=null) {
				model.addAttribute("casemessage_dateError", casemessage_dateError.getDefaultMessage());
			}
			return "/page/case/case.html";
		}
		int casemessage_id = 0;
		int physiquemessage_id = 0;
		
		// 根据体温+呼吸+血脂+血糖+脉搏查询对应主键
		Double physiquemessage_animal = physiqueMessage.getPhysiquemessage_animal();
		Integer physiquemessage_breathe = physiqueMessage.getPhysiquemessage_breathe();
		Integer physiquemessage_pulse = physiqueMessage.getPhysiquemessage_pulse();
		Double physiquemessage_bg = physiqueMessage.getPhysiquemessage_bg();
		Double physiquemessage_bf = physiqueMessage.getPhysiquemessage_bf();
		// 录入体格信息
		if(physiqueMessage!=null) {
			try {
//				physiquemessage_id = physiqueMessageService.getPhysiqueMessageId(physiquemessage_animal, physiquemessage_breathe, physiquemessage_pulse, physiquemessage_bg, physiquemessage_bf);
//				if(physiquemessage_id == 0) {
					physiqueMessageService.addPhysiqueMessage(physiqueMessage);
//				}
			} catch (PharmacyException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 根据两者插入的主键列关联病历表中的属性值
		// 根据现病史+辅助检查+治疗意见查询相关主键---查询病历详情信息
		// 根据这些消息可能说是病情一样所以可以根据这个逻辑关联;
		String casemessage_cahistory = CaseMessage.getCasemessage_cahistory();
		String casemessage_help = CaseMessage.getCasemessage_help();
		String casemessage_idea = CaseMessage.getCasemessage_idea();		
		// 录入病历详情信息				
		try {
			// 判断是否有类似病情
//			casemessage_id = physiqueMessageService.getCaseMessageId( casemessage_cahistory, casemessage_help, casemessage_idea);
			// 倘若有非常类似的病情
//			if(casemessage_id == 0) {
				physiqueMessageService.addCaseMessage(CaseMessage);
//			}
		} catch (PharmacyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		int case_id=CaseServiceImpl.id;
		
		
		// 取对应的主键值		
		physiquemessage_id = physiqueMessageService.getPhysiqueMessageId(physiquemessage_animal, physiquemessage_breathe, physiquemessage_pulse, physiquemessage_bg, physiquemessage_bf);
		casemessage_id = physiqueMessageService.getCaseMessageId( casemessage_cahistory, casemessage_help, casemessage_idea);
		
		System.out.println("physiquemessage_id="+physiquemessage_id+"\t"+"casemessage_id="+casemessage_id);
		// 根据对应主键关联
		// 若不是流感病毒
		if(physiquemessage_id == 0) {			
			physiqueMessageService.addCaseOtherId(casemessage_id,case_id);
		}else{
			physiqueMessageService.addCaseOtherId(physiquemessage_id, casemessage_id,case_id);
		}
		return "/page/case/table.html";
	}
}
