package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.common.CommonResult;
import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TMedicalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.service.TAdditionalFeeService;
import com.woniuxy.clinic.service.TMedicalFeeService;


@Controller
public class TMedicalFeeController {

	@Autowired
	TMedicalFeeService tMedicalFeeService;
	
//	@ResponseBody
//	@GetMapping("/tMedicalFeesajax")
//	public Object selectTMedicalFeeAjax(TMedicalFee tMedicalFee) {
//		List<TMedicalFee> tMedicalFees = tMedicalFeeService.selectByWhere(tMedicalFee);
//		CommonResult<TMedicalFee> result = new CommonResult<TMedicalFee>(0L, "成功", tMedicalFees);
//		return result;
//	}
	
	@ResponseBody
	@GetMapping("/tMedicalFeesajax")
	public Object selectTMedicalFeeAjax(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "2",required = false) Integer pageSize,
            TMedicalFeeDto dto) {
		PageInfo info=null;
		System.out.println(currentPage);
		System.out.println(pageSize);
		try {
			List<TMedicalFee> list = 
					tMedicalFeeService.findUsersByPage(currentPage, pageSize, dto);
			info= new PageInfo(list);
			int total=tMedicalFeeService.selectByPageCount(dto);
			System.out.println(total);
			info.setTotal(total);
			return CommonResult.success(info);
		} catch (Exception e) {
			e.printStackTrace();
            return CommonResult.failed();
		}
		
	}
	
	//左边导航栏跳转页面
	@RequestMapping("/tMedicalFees")
	public String selectTMedicalFee(Model model) {
		return "page/fee/tmedicalFeelist";
	}

	// 添加
	@ResponseBody
	@PostMapping("/addTMedicalFees")
	public Object addtTMedicalFees(TMedicalFee tMedicalFee) {
		tMedicalFeeService.insertTMedicalFee(tMedicalFee);
		System.out.println(tMedicalFee.getMedical_date());
		CommonResult<TMedicalFee> result = new CommonResult<TMedicalFee>(0L, "成功", null);
		return result;
	}

	// 批量删除(软删除:把费用状态由启用改为禁用)
	@ResponseBody
	@DeleteMapping("/updateTMedicalFeesStateByIdsajax/{medical_ids}")
	public Object deleteByIdsajax(@PathVariable("medical_ids") List<Integer> medical_ids) {

		for (Integer medical_id : medical_ids) {
			TMedicalFee tMedicalFee = tMedicalFeeService.selectTMedicalFeeById(medical_id);
			tMedicalFee.setMedical_state("禁用");
			tMedicalFeeService.delectTMedicalFeeById(tMedicalFee);
		}
		CommonResult<TMedicalFee> result = new CommonResult<TMedicalFee>(0L, "成功", null);
		return result;
	}

	// 单个删除(软删除:把费用状态由启用改为禁用)
	@ResponseBody
	@DeleteMapping("/deleteTMedicalFeeStateByIdajax/{medical_id}")
	public Object deleteByIdajax(@PathVariable("medical_id") int medical_id) {
		TMedicalFee tMedicalFee = tMedicalFeeService.selectTMedicalFeeById(medical_id);
		tMedicalFee.setMedical_state("禁用");
		tMedicalFeeService.delectTMedicalFeeById(tMedicalFee);
		CommonResult<TMedicalFee> result = new CommonResult<TMedicalFee>(0L, "成功", null);
		return result;
	}

	//编辑费用信息
	@RequestMapping("/editTMedicalFees/{medical_id}")
	public ModelAndView edittMedicalFees(@PathVariable("medical_id") int medical_id) {
		TMedicalFee tMedicalFee = 
				tMedicalFeeService.selectTMedicalFeeById(medical_id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("tMedicalFee", tMedicalFee);
		mv.setViewName("page/fee/editTMedicalFee");
		return mv;
	}
	
	//通过id修改费用信息
	@ResponseBody
	@PutMapping("/updateTMedicalFeeStateByIdajax")
	public Object updateByIdajax(TMedicalFee tMedicalFee) {
		tMedicalFeeService.updateTMedicalFeeById(tMedicalFee);
		CommonResult<TMedicalFee> result = new CommonResult<TMedicalFee>(0L, "成功", null);
		return result;
	}
}
