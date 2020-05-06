package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentMapper {
    int countByExample(TDepartmentExample example);

    int deleteByExample(TDepartmentExample example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(TDepartment record);

    int insertSelective(TDepartment record);

    List<TDepartment> selectByExample(TDepartmentExample example);

    TDepartment selectByPrimaryKey(Integer departmentId);

    TDepartment selectByname(String department_name);
    int updateByExampleSelective(@Param("record") TDepartment record, @Param("example") TDepartmentExample example);

    int updateByExample(@Param("record") TDepartment record, @Param("example") TDepartmentExample example);

    int updateByPrimaryKeySelective(TDepartment record);

    int updateByPrimaryKey(TDepartment record);
}