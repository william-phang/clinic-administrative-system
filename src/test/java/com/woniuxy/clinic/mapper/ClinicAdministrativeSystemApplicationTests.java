package com.woniuxy.clinic.mapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TPermission;
import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TStaffExample;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.entity.TUserExample;
import com.woniuxy.clinic.entity.TUserExample.Criteria;

/**
 * @author Administrator
 *
 */
@SpringBootTest
class ClinicAdministrativeSystemApplicationTests {
	//null,"注射费",20.00,10.00,new Date(),"章三","启用"
	@Autowired
	TStaffMapper staffMapper;
	@Autowired
	TDepartmentMapper departmentMapper;
	@Autowired
	TRoleMapper roleMappper;
	@Autowired
	TPermissionMapper permissionMapper;
	@Autowired
	TUserMapper userMapper;

	@Test
	void contextLoads() {
		TStaff staff=new TStaff(4, "张燕", "女", 42, "18888888888", "110004",new Date(), 103, 4, "在职", null, null);
		staffMapper.insert(staff);
	}

	@Test
	void contextLoads01() {
		TUser selectByuser_account = userMapper.selectByuser_account("18888888888");
		System.out.println(selectByuser_account);
	}
	
	@Test
	void contextLoads02() {
		System.out.println(userMapper.selectidByuser_account("18888888888"));

	}
	
	@Test
	void contextLoads03() {
		PageHelper.startPage(1, 5);
		TStaffExample example=new TStaffExample();
		List<TStaff> list = staffMapper.selectByExample(example);
		for (TStaff staff : list) {
			TRole role = roleMappper.selectByPrimaryKey(staff.getRoleId());
			TDepartment department=departmentMapper.selectByPrimaryKey(staff.getDepartmentId());
			staff.setTRole(role);
			staff.setTDepartment(department);
		}
		PageInfo<TStaff> staffpage=new PageInfo<>(list);
		for (TStaff staff : staffpage.getList()) {
			System.out.println(staff);
		}
	}
}
