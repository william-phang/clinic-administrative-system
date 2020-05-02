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
import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.service.DepartmentService;
import com.woniuxy.clinic.service.RoleService;
import com.woniuxy.clinic.service.StaffService;
import com.woniuxy.clinic.tool.CommonResult;

@Controller
public class RoleController {
	@Autowired
	RoleService roleService;
	
	
	@RequiresPermissions("role:query")
	@ResponseBody
	@GetMapping("/rolelist")
	public Object selectall(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,TRole role,String rolename) {
		 PageInfo info = null;
		 System.out.println(rolename);
		 role.setRoleName(rolename);
	        try {    	
		List<TRole> selectall = roleService.selectallTRole(currentPage, pageSize, role);
		info = new PageInfo(selectall);
        return CommonResult.success(info);
    } catch (Exception e) {
        e.printStackTrace();
        return CommonResult.failed();
    }
	}
	
	@ResponseBody
    @RequestMapping("/selectAllrole")
    public List<TRole> selectass(Model model,TRole role) {   		
    	  List<TRole> selectall = roleService.selectall(role);
		return selectall;

    	}
	@RequiresPermissions("role:add")
	@ResponseBody
    @RequestMapping("/addRole")
    public int addDepartment(String roleName,String roleStatus,int roleId,
    		String roleDescribe,HttpSession session){ 
		TRole role_name = roleService.selectTRolebyTRole_name(roleName);
		if(role_name==null) {
			TRole role=new TRole();
			role.setRoleCreationtime(new Date());
			role.setRoleDescribe(roleDescribe);
			role.setRoleId(roleId);
			role.setRoleName(roleName);
			role.setRoleStatus(roleStatus);
            return roleService.addTRole(role);
		}else {
			return 404;
		}
}
	@RequiresPermissions("role:update")
	@ResponseBody
    @RequestMapping("/updateRole")
    public int updateDepartment(String roleName,String roleStatus,int roleId,
    		String roleDescribe,HttpSession session){     
		TRole role=new TRole();
		role.setRoleCreationtime(new Date());
		role.setRoleDescribe(roleDescribe);
		role.setRoleId(roleId);
		role.setRoleName(roleName);
		role.setRoleStatus(roleStatus);
            return roleService.updateTRolebyTRole_id(role);
        
}
}
