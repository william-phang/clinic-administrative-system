package com.woniuxy.clinic.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TPermission;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.service.PermissionService;
import com.woniuxy.clinic.service.StaffService;
import com.woniuxy.clinic.service.UserService;
import com.woniuxy.clinic.tool.CommonResult;

@Controller
public class PermissionController {
	@Autowired
	PermissionService permissionService;
	@Autowired
	UserService userService;
	
	
	@RequiresPermissions("permission:query")
	@ResponseBody
	@GetMapping("/permissionlist")
	public Object selectallstaff(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,TPermission permission,String permissionname) {
		 
		 permission.setPermissionName(permissionname);
	        try {    	
		 PageInfo<TPermission> pageInfo = permissionService.selectallTPermission(currentPage, pageSize, permission);
		
        return CommonResult.success(pageInfo);
    } catch (Exception e) {
        e.printStackTrace();
        return CommonResult.failed();
    }
	}
	
	@RequiresPermissions("permission:add")
	@ResponseBody
    @RequestMapping("/addPermission")
    public int addFinances(Integer permissionId,String permissionName,int roleId,
    		HttpSession session){ 
		TPermission permission_name = permissionService.selectTRolebyTPermission_name(permissionName);
		if(permission_name==null) {
           TPermission permission=new TPermission();
           permission.setPermissionId(permissionId);
           permission.setPermissionName(permissionName);
           permission.setRoleId(roleId);
            
            return permissionService.addTPermission(permission);
		}else {
			return 404;
		}
}

	/**
     * 根据id修改状态信息
     * @param userId
     * @param code
     * @param userPassword
     * @param session
     * @return
     */
    @RequiresPermissions("permission:update")
    @ResponseBody
    @RequestMapping("/updatepermission")
    public int updateFinances(int permissionId,String permissionName,String status,HttpSession session){     
            TPermission tPermission=new TPermission();
            tPermission.setPermissionId(permissionId);
            tPermission.setPermissionName(permissionName);
            tPermission.setStatus(status);
            return permissionService.updateTPermissionbyTPermission_id(tPermission);
        
}
}
