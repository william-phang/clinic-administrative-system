package com.woniuxy.clinic.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.service.DepartmentService;
import com.woniuxy.clinic.service.StaffService;
import com.woniuxy.clinic.tool.CommonResult;

@Controller
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	
	@RequiresPermissions("department:query")
	@ResponseBody
	@GetMapping("/departmentlist")
	public Object selectall(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,TDepartment department,String departmentname) {
		 PageInfo info = null;
		 System.out.println(departmentname);
		 department.setDepartmentName(departmentname);
	        try {    	
		List<TDepartment> selectall = departmentService.selectallTDepartment(currentPage, pageSize, department);
		info = new PageInfo(selectall);
        return CommonResult.success(info);
    } catch (Exception e) {
        e.printStackTrace();
        return CommonResult.failed();
    }
	}
	
	@ResponseBody
    @RequestMapping("/selectAlldepartment")
    public List<TDepartment> selectass(Model model,TDepartment department) {   		
    	  List<TDepartment> selectall = departmentService.selectallDepartment(department);
		return selectall;

    	}
	
	@RequiresPermissions("department:add")
	@ResponseBody
    @RequestMapping("/addDepartment")
    public int addDepartment(String departmentName,String departmentStatus,Integer departmentId,
    		String departmentDescribe,HttpSession session){ 
		TDepartment department_name = departmentService.selectTDepartmentbyTDepartment_name(departmentName);
		if(department_name==null) {
			TDepartment department=new TDepartment();
			department.setDepartmentId(departmentId);
			department.setDepartmentDescribe(departmentDescribe);
            department.setDepartmentStatus(departmentStatus);
            department.setDepartmentDescribe(departmentDescribe);
            department.setDepartmentCreationtime(new Date());
            return departmentService.addTDepartment(department);
		}else {
			return 404;
		}
}
	@RequiresPermissions("department:update")
	@ResponseBody
    @RequestMapping("/updateDepartment")
    public int updateDepartment(String departmentName,
    		String departmentStatus,int departmentId,String departmentDescribe,HttpSession session){     
		    TDepartment department=new TDepartment();
		    department.setDepartmentId(departmentId);
		    department.setDepartmentDescribe(departmentDescribe);
		    department.setDepartmentName(departmentName);
		    department.setDepartmentStatus(departmentStatus);
            return departmentService.updateTDepartmentbyTDepartment_id(department);
        
}
}
