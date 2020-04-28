package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TStaffExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface TStaffMapper {
    int countByExample(TStaffExample example);

    int deleteByExample(TStaffExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(TStaff record);

    int insertSelective(TStaff record);

    List<TStaff> selectByExample(TStaffExample example);

    TStaff selectByPrimaryKey(Integer staffId);
    
    TStaff selectByname(String staff_name);

    int updateByExampleSelective(@Param("record") TStaff record, @Param("example") TStaffExample example);

    int updateByExample(@Param("record") TStaff record, @Param("example") TStaffExample example);

    int updateByPrimaryKeySelective(TStaff record);

    int updateByPrimaryKey(TStaff record);
}