package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.exception.DepartmentException;

public interface DepartmentService {

	TDepartment selectTDepartmentbyTDepartment_id(int department_id);//查询单个科室
	TDepartment selectTDepartmentbyTDepartment_name(String department_name);//查询单个科室
	void deleteTDepartmentbyTDepartment_id(int department_id);//删除科室
	int updateTDepartmentbyTDepartment_id(TDepartment department);//修改科室
	int addTDepartment(TDepartment department);//添加科室
	List<TDepartment> selectallDepartment(TDepartment department);
	List<TDepartment> selectallTDepartment(Integer currentPage, Integer pageSize ,TDepartment department)throws DepartmentException;//查询所有科室
}
