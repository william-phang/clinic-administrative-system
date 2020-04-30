package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.exception.StaffException;

public interface StaffService {
	TStaff selectStaffbyStaff_card(String staff_card);//查询单个员工
	TStaff selectStaffbyStaff_id(int staff_id);//查询单个员工
	void deleteStaffbystaff_id(int staff_id);//删除员工
	int updateStaffbyStaff_id(TStaff staff);//修改员工
	int addStaff(TStaff staff)throws StaffException;//添加员工
	List<TStaff> selectallStaff(Integer currentPage, Integer pageSize ,TStaff staff);//查询所有员工
}
