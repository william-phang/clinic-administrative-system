package com.woniuxy.clinic.service.imp;

import java.util.List;


import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.entity.TUserExample;
import com.woniuxy.clinic.entity.TUserExample.Criteria;
import com.woniuxy.clinic.exception.UserException;
import com.woniuxy.clinic.mapper.TDepartmentMapper;
import com.woniuxy.clinic.mapper.TRoleMapper;
import com.woniuxy.clinic.mapper.TStaffMapper;
import com.woniuxy.clinic.mapper.TUserMapper;
import com.woniuxy.clinic.service.UserService;

@Service("userService")
public class UserserviceImpl implements UserService{
	@Autowired
	TUserMapper userMapper;
	@Autowired
	TStaffMapper staffMapper;
	@Autowired
	TRoleMapper roleMapper;
	@Autowired
	TDepartmentMapper departmentMapper;
	

	@Override
	public List<TUser> selectallUser(TUser user) {
		TUserExample example=new TUserExample();
		Criteria userCriteria=example.createCriteria();
		if(user.getUserAccount()!=null&&!"".equals(user.getUserAccount())) {
		userCriteria.andUserAccountLike("%"+user.getUserAccount()+"%");	
		}
		List<TUser> selectByExample = userMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public TUser selectUserbyid(int userId) {
		TUser selectByPrimaryKey = userMapper.selectByPrimaryKey(userId);
		TStaff select = staffMapper.selectByPrimaryKey(selectByPrimaryKey.getUserStaffId());
		TRole role = roleMapper.selectByPrimaryKey(selectByPrimaryKey.getUserRoleId());
		selectByPrimaryKey.setTstaff(select);
		selectByPrimaryKey.setTrole(role);
		return selectByPrimaryKey;
	}



	

	@Override
	public void addUser(TUser user) throws UserException{
		TUser byPrimaryKey = userMapper.selectByuser_account(user.getUserAccount());
		if(byPrimaryKey!=null) {
			throw new UserException("用户已存在");
		}
		userMapper.insert(user);
		
	}



	@Override
	public void deleteUserbyid(int user_id) {
		
		
	}

	@Override
	public TUser login(UsernamePasswordToken token) throws UserException {
		TUser selectByuser_account = userMapper.selectByuser_account(token.getUsername());	
		TRole role = roleMapper.selectByPrimaryKey(selectByuser_account.getUserRoleId());
		TStaff selectByPrimaryKey = staffMapper.selectByPrimaryKey(selectByuser_account.getUserStaffId());
		TDepartment selectByPrimaryKey2 = departmentMapper.selectByPrimaryKey(selectByPrimaryKey.getDepartmentId());
		selectByPrimaryKey.setTDepartment(selectByPrimaryKey2);
		selectByuser_account.setTstaff(selectByPrimaryKey);
		selectByuser_account.setTrole(role);
		return selectByuser_account;	
	}

	@Override
	public TUser selectUserbyaccount(String userAccount) {
		
		return userMapper.selectByuser_account(userAccount);
	}


	@Override
	public int updateByPrimaryKeySelective(TUser user) {

		return userMapper.updateByPrimaryKeySelective(user);
	}
}
