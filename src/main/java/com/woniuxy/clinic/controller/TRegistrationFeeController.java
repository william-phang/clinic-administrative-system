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
import com.woniuxy.clinic.dto.TMedicalFeeDto;
import com.woniuxy.clinic.dto.TRegistrationFeeDto;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TRegistrationFee;
import com.woniuxy.clinic.service.TRegistrationFeeService;


@Controller
public class TRegistrationFeeController {

	@Autowired
	TRegistrationFeeService tRegistrationFeeService;
	
	//@ResponseBody
	//@GetMapping("/tRegistrationFeesajax")
//	public Object selectTRegistrationFeeAjax(TRegistrationFee tRegistrationFee) {
//		List<TRegistrationFee> tRegistrationFees = tRegistrationFeeService.selectByWhere(tRegistrationFee);
//		CommonResult<TRegistrationFee> result = new CommonResult<TRegistrationFee>(0L, "成功", tRegistrationFees);
//		return result;
//	}
	
	@ResponseBody
	@GetMapping("/tRegistrationFeesajax")
	public Object selectTRegistrationFeeAjax(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "2",required = false) Integer pageSize,
            TRegistrationFeeDto dto) {
		System.out.println(dto);
		PageInfo info=null;
		try {
			List<TRegistrationFee> list = 
					tRegistrationFeeService.findUsersByPage(currentPage, pageSize, dto);
			info= new PageInfo(list);
			int total=tRegistrationFeeService.selectByPageCount(dto);
			info.setTotal(total);
			return CommonResult.success(info);
		} catch (Exception e) {
			e.printStackTrace();
            return CommonResult.failed();
		}
		
	}
	
	//左边导航栏跳转页面
	@RequestMapping("/tRegistrationFees")
	public String selectTRegistrationFee(Model model) {
		return "page/fee/tregistrationFeelist";
	}

	// 添加
	@ResponseBody
	@PostMapping("/addRegistrationFees")
	public Object addtRegistrationFees(TRegistrationFee tRegistrationFee) {
		System.out.println(tRegistrationFee);
		tRegistrationFeeService.insertTRegistrationFee(tRegistrationFee);
		CommonResult<TRegistrationFee> result = new CommonResult<TRegistrationFee>(0L, "成功", null);
		return result;
	}

	// 批量删除(软删除:把费用状态由启用改为禁用)
	@ResponseBody
	@DeleteMapping("/updateTRegistrationFeesStateByIdsajax/{regis_ids}")
	public Object deleteByIdsajax(@PathVariable("regis_ids") List<Integer> regis_ids) {

		for (Integer regis_id : regis_ids) {
			TRegistrationFee tRegistrationFee = tRegistrationFeeService.selectTRegistrationFeeById(regis_id);
			tRegistrationFee.setRegis_state("禁用");
			tRegistrationFeeService.delectTRegistrationFeeById(tRegistrationFee);
		}
		CommonResult<TRegistrationFee> result = new CommonResult<TRegistrationFee>(0L, "成功", null);
		return result;
	}

	// 单个删除(软删除:把费用状态由启用改为禁用)
	@ResponseBody
	@DeleteMapping("/deleteTRegistrationFeeStateByIdajax/{regis_id}")
	public Object deleteByIdajax(@PathVariable("regis_id") int regis_id) {
		TRegistrationFee tRegistrationFee = tRegistrationFeeService.selectTRegistrationFeeById(regis_id);
		tRegistrationFee.setRegis_state("禁用");
		tRegistrationFeeService.delectTRegistrationFeeById(tRegistrationFee);
		CommonResult<TRegistrationFee> result = new CommonResult<TRegistrationFee>(0L, "成功", null);
		return result;
	}

	//编辑费用信息
	@RequestMapping("/editTRegistrationFees/{regis_id}")
	public ModelAndView edittMedicalFees(@PathVariable("regis_id") int regis_id) {
		System.out.println(regis_id);
		TRegistrationFee tRegistrationFee = 
				tRegistrationFeeService.selectTRegistrationFeeById(regis_id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("tRegistrationFee", tRegistrationFee);
		mv.setViewName("page/fee/editTRegistrationFee");
		return mv;
	}
	
	//通过id修改费用信息
	@ResponseBody
	@PutMapping("/updateTRegistrationFeeStateByIdajax")
	public Object updateByIdajax(TRegistrationFee tRegistrationFee) {
		tRegistrationFeeService.updateTRegistrationFeeById(tRegistrationFee);
		CommonResult<TRegistrationFee> result = new CommonResult<TRegistrationFee>(0L, "成功", null);
		return result;
	}
}
