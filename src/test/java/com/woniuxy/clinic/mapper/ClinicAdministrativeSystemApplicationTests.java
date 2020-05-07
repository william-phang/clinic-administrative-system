package com.woniuxy.clinic.mapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
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
	@Autowired
	TAdditionalFeeMapper tAdditionalFeeMapper;

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
		
		Integer currentPage=1;
		Integer pageSize=2;
		TAdditionalFeeDto dto=new TAdditionalFeeDto();
		List<TAdditionalFee> tAdditionalFees = 
				tAdditionalFeeMapper.selectByPage(currentPage, pageSize, dto);
		System.out.println(tAdditionalFees);
	}
	
}
