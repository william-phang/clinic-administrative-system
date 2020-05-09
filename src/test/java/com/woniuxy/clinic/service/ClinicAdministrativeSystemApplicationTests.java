package com.woniuxy.clinic.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TPermission;
import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.mapper.TDepartmentMapper;
import com.woniuxy.clinic.mapper.TPermissionMapper;
import com.woniuxy.clinic.mapper.TRoleMapper;
import com.woniuxy.clinic.mapper.TStaffMapper;
import com.woniuxy.clinic.mapper.TUserMapper;
import com.woniuxy.clinic.tool.CommonResult;



@SpringBootTest
class ClinicAdministrativeSystemApplicationTests {
	@Autowired
	StaffService staffService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	RoleService roleService;
	@Autowired
	UserService userService;
	@Autowired
	PermissionService permissionService;

	
	@Test
	void contextLoads() {
		TStaff staff=new TStaff();
		staff.setStaffName("阿达");
		 PageInfo info = null;
		Integer currentPage=1;
		Integer pageSize=5;
		List<TStaff> selectallStaff = staffService.selectallStaff(currentPage, pageSize, staff);
		info = new PageInfo(selectallStaff);
	    System.out.println(selectallStaff);

	}
	
	@Test
	void contextLoad01() {
		TPermission permission=new TPermission();
		List<TPermission> selectall = permissionService.selectall(permission);
		System.out.println(selectall);
	
	}
	
	@Test
	void contextLoad02() {
		
		
	}
	
	@Test
	void contextLoad03() {
		
		
	}

}
