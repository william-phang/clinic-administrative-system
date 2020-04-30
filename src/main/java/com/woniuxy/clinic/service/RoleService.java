package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.exception.RoleException;

public interface RoleService {
	TRole selectTRolebyTRole_name(String role_name);//查询单个角色
	TRole selectTRolebyTRole_id();//查询单个角色
	void deleteTRolebyTRole_id(int role_id);//删除角色
	int updateTRolebyTRole_id(TRole role);//修改角色
	int addTRole(TRole role)throws RoleException;//添加角色
	List<TRole> selectallTRole(Integer currentPage, Integer pageSize, TRole role);//查询所有角色
	List<TRole> selectall( TRole role);
}
