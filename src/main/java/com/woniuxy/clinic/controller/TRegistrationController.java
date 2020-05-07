
package com.woniuxy.clinic.controller;

import java.util.Date;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.common.CommonResult;
import com.woniuxy.clinic.dto.TRegistrationDto;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TRegistration;
import com.woniuxy.clinic.service.TRegistrationService;

@Controller
public class TRegistrationController {

	@Autowired
	TRegistrationService tRegistrationService;

	@RequiresPermissions("registration:query")
	@ResponseBody
	@GetMapping("/tRegistajax")
	public Object selectttRegistsajax(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "2",required = false) Integer pageSize,
            TRegistrationDto dto,String patient_name) {
		System.out.println(dto.getRe_create_time());
		PageInfo info=null;
		try {
			Patient patient=new Patient();
			patient.setPatient_name(patient_name);
			dto.setPatient(patient);
			List<TRegistration> list = 
					tRegistrationService.findUsersByPage(currentPage, pageSize, dto);
			info= new PageInfo(list);
			int total=tRegistrationService.selectByPageCount(dto);
			info.setTotal(total);
			return CommonResult.success(info);
		} catch (Exception e) {
			e.printStackTrace();
            return CommonResult.failed();
		}
	}

	@RequiresPermissions("registration:query")
	@RequestMapping("/tRegist")
	public String selecttAdditionalFees(Model model) {
		return "page/workTable/workTable";
	}

}
