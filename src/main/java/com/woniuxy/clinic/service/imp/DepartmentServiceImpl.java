package com.woniuxy.clinic.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TDepartmentExample;
import com.woniuxy.clinic.entity.TDepartmentExample.Criteria;
import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.exception.DepartmentException;
import com.woniuxy.clinic.mapper.TDepartmentMapper;
import com.woniuxy.clinic.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	TDepartmentMapper departmentMapper;

	@Override
	public List<TDepartment> selectallTDepartment(Integer currentPage, Integer pageSize,TDepartment department) {
		TDepartmentExample example=new TDepartmentExample();
		Criteria departmentCriteria=example.createCriteria();
		if(department.getDepartmentName()!=null&&!"".equals(department.getDepartmentName())) {
		departmentCriteria.andDepartmentNameLike("%"+department.getDepartmentName()+"%");	
		}
		List<TDepartment> selectByExample = departmentMapper.selectByExample(example);
		
		return selectByExample;
	}

	@Override
	public TDepartment selectTDepartmentbyTDepartment_id(int department_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTDepartmentbyTDepartment_id(int department_id) {
		departmentMapper.deleteByPrimaryKey(department_id);
		
	}

	@Override
	public int updateTDepartmentbyTDepartment_id(TDepartment department) {
		return departmentMapper.updateByPrimaryKeySelective(department);
		
	}

	@Override
	public int addTDepartment(TDepartment department)throws DepartmentException {
		TDepartment selectByname = departmentMapper.selectByname(department.getDepartmentName());
		if(selectByname!=null) {
			throw new DepartmentException("科室已存在");
		}
		return departmentMapper.insert(department);
	}

	@Override
	public List<TDepartment> selectallDepartment(TDepartment department) {
		TDepartmentExample example=new TDepartmentExample();
		Criteria departmentCriteria=example.createCriteria();
		if(department.getDepartmentName()!=null&&!"".equals(department.getDepartmentName())) {
		departmentCriteria.andDepartmentNameLike("%"+department.getDepartmentName()+"%");	
		}
		List<TDepartment> selectByExample = departmentMapper.selectByExample(example);
		
		return selectByExample;
	}

	@Override
	public TDepartment selectTDepartmentbyTDepartment_name(String department_name) {
		
		return selectTDepartmentbyTDepartment_name(department_name);
	}
	}

	


