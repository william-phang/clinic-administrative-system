package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.DrugDto;
import com.woniuxy.clinic.dto.InputDto;
import com.woniuxy.clinic.dto.OutputDto;
import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.service.PharmacyService;
import com.woniuxy.clinic.tool.CommonResult;

//药房
@Controller
public class PharmacyController {
	@Autowired
	private PharmacyService pharmacyService;
	@ResponseBody
	@RequestMapping("/pharmacy/drugInfoList")
	public CommonResult showDrugs(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,
            DrugDto drugDto) {
		PageInfo info = null;
        try {
        	info = pharmacyService.showDrugsByCondition(drugDto,currentPage,pageSize);
            return CommonResult.success(info);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
	}
	@ResponseBody
	@RequestMapping("/pharmacy/saveDrugInfo")
	public CommonResult saveDrugInfo(TDrug tDrug) {
		try {
			pharmacyService.saveDrugInfo(tDrug);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("保存失败");
		}
		return CommonResult.success("保存成功");
	}
	
	@RequestMapping("/pharmacy/editDrugInfo/{drug_sn}")
    public ModelAndView editAdmin(@PathVariable("drug_sn")Integer drug_sn){
        TDrug tDrug = pharmacyService.findDrugInfoByDrug_sn(drug_sn);
        ModelAndView modelAndView = new ModelAndView("/page/drug_management/drug_info_edit");
        modelAndView.addObject("tDrug",tDrug);
        return modelAndView;
    }
	
	@ResponseBody
	@RequestMapping("/pharmacy/editDrugInfoStatus/{drug_sn}&{status}")
	public CommonResult editDrugInfoStatus(@PathVariable("drug_sn")Integer drug_sn,@PathVariable("status")Integer status) {
		try {
			pharmacyService.editDrugInfoStatus(drug_sn,status);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("更改失败");
		}
		return CommonResult.success("更改成功");
	}
	
	@ResponseBody
	@RequestMapping("/pharmacy/inputList")
	public CommonResult showInputs(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,
            InputDto inputDto) {
		PageInfo info = null;
        try {
        	info = pharmacyService.showInputsByCondition(inputDto,currentPage,pageSize);
            return CommonResult.success(info);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
	}
	
	@ResponseBody
	@RequestMapping("/pharmacy/outputList")
	public CommonResult showOutputs(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,
            OutputDto outputDto) {
		PageInfo info = null;
		System.out.println(outputDto);
        try {
        	info = pharmacyService.showOutputsByCondition(outputDto,currentPage,pageSize);
            return CommonResult.success(info);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
	}
}
