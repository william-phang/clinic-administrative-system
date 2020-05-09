
package com.woniuxy.clinic.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.common.CommonResult;
import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.service.TAdditionalFeeService;

@Controller
public class TAdditionalFeeController {

	@Autowired
	TAdditionalFeeService tAdditionalFeeService;

	@RequiresPermissions("additionalfee:query")
	@ResponseBody
	@GetMapping("/tAdditionalFeesajax")
	public Object selecttAdditionalFeesajax(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "2",required = false) Integer pageSize,
            TAdditionalFeeDto dto) {
		PageInfo info=null;
		System.out.println(currentPage);
		System.out.println(pageSize);
		try {
			List<TAdditionalFee> list = 
					tAdditionalFeeService.findUsersByPage(currentPage, pageSize, dto);
			info= new PageInfo(list);
			int total=tAdditionalFeeService.selectByPageCount(dto);
			System.out.println(total);
			info.setTotal(total);
			return CommonResult.success(info);
		} catch (Exception e) {
			e.printStackTrace();
            return CommonResult.failed();
		}
		
	}

	@RequiresPermissions("additionalfee:query")
	@RequestMapping("/tAdditionalFees")
	public String selecttAdditionalFees(Model model) {
		return "page/fee/tadditionalFeelist";
	}

	// 添加
	@RequiresPermissions("additionalfee:add")
	@ResponseBody
	@PostMapping("/addtAdditionalFees")
	public Object addtAdditionalFees(TAdditionalFee tAdditionalFee) {
		tAdditionalFeeService.insertTAdditionalFee(tAdditionalFee);
		System.out.println(tAdditionalFee.getAdditional_date());
		CommonResult<TAdditionalFee> result = new CommonResult<TAdditionalFee>(0L, "成功", null);
		return result;
	}

	// 批量删除(软删除:把费用状态由启用改为禁用)
	@RequiresPermissions("additionalfee:delete")
	@ResponseBody
	@DeleteMapping("/updateStatetByIdsajax/{additional_ids}")
	public Object deleteByIdsajax(@PathVariable("additional_ids") List<Integer> additional_ids) {

		for (Integer additional_id : additional_ids) {
			TAdditionalFee tAdditionalFee = tAdditionalFeeService.selectTadditionalFeeById(additional_id);
			tAdditionalFee.setAdditional_state("禁用");
			tAdditionalFeeService.delectTadditionalFeeById(tAdditionalFee);
		}
		CommonResult<TAdditionalFee> result = new CommonResult<TAdditionalFee>(0L, "成功", null);
		return result;
	}

	// 单个删除(软删除:把费用状态由启用改为禁用)
	@RequiresPermissions("additionalfee:delete")
	@ResponseBody
	@DeleteMapping("/updateStatetByIdajax/{additional_id}")
	public Object deleteByIdajax(@PathVariable("additional_id") int additional_id) {

		TAdditionalFee tAdditionalFee = tAdditionalFeeService.selectTadditionalFeeById(additional_id);
		tAdditionalFee.setAdditional_state("禁用");
		tAdditionalFeeService.delectTadditionalFeeById(tAdditionalFee);
		CommonResult<TAdditionalFee> result = new CommonResult<TAdditionalFee>(0L, "成功", null);
		return result;
	}

	//编辑费用信息
	@RequiresPermissions("additionalfee:query")
	@RequestMapping("/edittAdditionalFees/{additional_id}")
	public ModelAndView edittAdditionalFees(@PathVariable("additional_id") int additional_id) {
		TAdditionalFee tAdditionalFee = 
				tAdditionalFeeService.selectTadditionalFeeById(additional_id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("tAdditionalFee", tAdditionalFee);
		mv.setViewName("page/fee/edittadditionalfee");
		return mv;
	}
	
	//通过id修改费用信息
	@RequiresPermissions("additionalfee:update")
	@ResponseBody
	@PutMapping("/updateStatetByIdajax")
	public Object updateByIdajax(TAdditionalFee tAdditionalFee) {
		tAdditionalFeeService.updateTadditionalFeeById(tAdditionalFee);
		CommonResult<TAdditionalFee> result = new CommonResult<TAdditionalFee>(0L, "成功", null);
		return result;
	}
}
