package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TStaffExample;
import com.woniuxy.clinic.entity.TStaffExample.Criteria;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.entity.TUserExample;
import com.woniuxy.clinic.exception.StaffException;
import com.woniuxy.clinic.mapper.TDepartmentMapper;
import com.woniuxy.clinic.mapper.TRoleMapper;
import com.woniuxy.clinic.mapper.TStaffMapper;
import com.woniuxy.clinic.mapper.TUserMapper;
import com.woniuxy.clinic.service.StaffService;

@Service("staffService")
public class StaffServiceImpl implements StaffService{
	@Autowired
	TStaffMapper staffMapper;
	@Autowired
	TRoleMapper  roleMappper;
	@Autowired
	TDepartmentMapper departmentMapper;
	@Autowired
	TUserMapper userMapper;
	@Override
	public List<TStaff> selectallStaff(Integer currentPage, Integer pageSize,TStaff staff) {
		TStaffExample example=new TStaffExample();
		Criteria staffCriteria=example.createCriteria();
		if(staff.getStaffName()!=null&&!"".equals(staff.getStaffName())) {
		staffCriteria.andStaffNameLike("%"+staff.getStaffName()+"%");	
		}
		List<TStaff> selectByExample = staffMapper.selectByExample(example);
		for (TStaff TStaff : selectByExample) {
			TRole role = roleMappper.selectByPrimaryKey(TStaff.getRoleId());
			TDepartment department=departmentMapper.selectByPrimaryKey(TStaff.getDepartmentId());
			TStaff.setTRole(role);
			TStaff.setTDepartment(department);
		}
		return selectByExample;
	}



	@Override
	public void deleteStaffbystaff_id(int staff_id) {
		staffMapper.deleteByPrimaryKey(staff_id);
		
	}

	@Override
	public int updateStaffbyStaff_id(TStaff staff) {
		return staffMapper.updateByPrimaryKeySelective(staff);
		
	}

	@Override
	public int addStaff(TStaff staff) throws StaffException{
		int insert = staffMapper.insert(staff);
		TUser user=new TUser(null, staff.getStaffPhone(), "123321", null, staff.getRoleId(), staff.getStaffId(), 0, null,null);
		userMapper.insert(user);
		return insert;
	}



	@Override
	public TStaff selectStaffbyStaff_card(String staff_card) {

		return staffMapper.selectBycard(staff_card);
	}



	@Override
	public TStaff selectStaffbyStaff_id(int staff_id) {
		// TODO Auto-generated method stub
		return null;
	}



}
