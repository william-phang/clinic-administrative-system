package com.woniuxy.clinic.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.entity.TPermission;



public interface PermissionService {

	TPermission selectTRolebyTPermission_id(int permission_id);
	TPermission selectTRolebyTPerms(String perms);//查询单个角色
	void deleteTPermissionbyTPermission_id(int permission_id);//删除角色
	int updateTPermissionbyTPermission_id(TPermission permission);//修改角色
	int addTPermission(TPermission permission);//添加角色
	PageInfo<TPermission> selectallTPermission(Integer currentPage, Integer pageSize, TPermission permission);//查询所有角色
	List<TPermission> selectall( TPermission permission);
}
