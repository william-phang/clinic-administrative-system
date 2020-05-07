package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TPermission;
import com.woniuxy.clinic.entity.TPermissionExample;
import com.woniuxy.clinic.entity.TPermissionExample.Criteria;
import com.woniuxy.clinic.mapper.TPermissionMapper;
import com.woniuxy.clinic.mapper.TRoleMapper;
import com.woniuxy.clinic.service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	TPermissionMapper permissionMapper;
	@Autowired
	TRoleMapper roleMappper;
	
	@Override
	public TPermission selectTRolebyTPermission_id(int permission_id) {
		
		return permissionMapper.selectByPrimaryKey(permission_id);
	}

	@Override
	public TPermission selectTRolebyTPermission_name(String permission_name) {
		
		return permissionMapper.selectByname(permission_name);
	}

	@Override
	public void deleteTPermissionbyTPermission_id(int permission_id) {
		permissionMapper.deleteByPrimaryKey(permission_id);
		
	}

	@Override
	public int updateTPermissionbyTPermission_id(TPermission permission) {
		
		return permissionMapper.updateByPrimaryKeySelective(permission);
	}

	@Override
	public int addTPermission(TPermission permission) {
		
		return permissionMapper.insert(permission);
	}

	@Override
	public PageInfo<TPermission> selectallTPermission(Integer currentPage, Integer pageSize, TPermission permission) {
		PageHelper.startPage(currentPage, pageSize);
		TPermissionExample example=new TPermissionExample();
		Criteria createCriteria = example.createCriteria();
		if(permission.getPermissionName()!=null&&!"".equals(permission.getPermissionName())) {
		createCriteria.andPermissionNameLike("%"+permission.getPermissionName()+"%");	
		}
		if(permission.getRoleId()!=null) {
			
			createCriteria.andRoleIdEqualTo(permission.getRoleId());
			}
		List<TPermission> selectByExample = permissionMapper.selectByExample(example);
		PageInfo<TPermission> info = new PageInfo<>(selectByExample);
		return info;
	}

	@Override
	public List<TPermission> selectall(TPermission permission) {
		TPermissionExample example=new TPermissionExample();
		return permissionMapper.selectByExample(example);
	}

}
