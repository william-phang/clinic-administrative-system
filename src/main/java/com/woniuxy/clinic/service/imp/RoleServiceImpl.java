package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TRoleExample;
import com.woniuxy.clinic.entity.TRoleExample.Criteria;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.exception.RoleException;
import com.woniuxy.clinic.mapper.TRoleMapper;
import com.woniuxy.clinic.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	@Autowired
	TRoleMapper roleMapper;

	@Override
	public List<TRole> selectallTRole(Integer currentPage, Integer pageSize, TRole role) {
		TRoleExample example=new TRoleExample();
		Criteria roelcCriteria=example.createCriteria();
		if(role.getRoleName()!=null&&!"".equals(role.getRoleName())) {
			roelcCriteria.andRoleNameLike("%"+role.getRoleName()+"%");
		}
		List<TRole> selectByExample = roleMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public TRole selectTRolebyTRole_id() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTRolebyTRole_id(int role_id) {
		roleMapper.deleteByPrimaryKey(role_id);
		
	}

	@Override
	public int updateTRolebyTRole_id(TRole role) {
		return roleMapper.updateByPrimaryKeySelective(role);
		
	}

	@Override
	public int addTRole(TRole role)throws RoleException {
		
		return roleMapper.insert(role);
	}

	@Override
	public List<TRole> selectall(TRole role) {
		TRoleExample example=new TRoleExample();
		Criteria roelcCriteria=example.createCriteria();
		if(role.getRoleName()!=null&&!"".equals(role.getRoleName())) {
			roelcCriteria.andRoleNameLike("%"+role.getRoleName()+"%");
		}
		List<TRole> selectByExample = roleMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public TRole selectTRolebyTRole_name(String role_name) {
		
		return roleMapper.selectByname(role_name);
	}

}
