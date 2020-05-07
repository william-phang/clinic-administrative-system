package com.woniuxy.clinic.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.clinic.entity.TPermission;
import com.woniuxy.clinic.entity.TPermissionExample;

public interface TPermissionMapper {
    int countByExample(TPermissionExample example);

    int deleteByExample(TPermissionExample example);

    int deleteByPrimaryKey(Integer permissionId);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    List<TPermission> selectByExample(TPermissionExample example);

    TPermission selectByPrimaryKey(Integer permissionId);
    
    TPermission selectByname(String permission_name);

    int updateByExampleSelective(@Param("record") TPermission record, @Param("example") TPermissionExample example);

    int updateByExample(@Param("record") TPermission record, @Param("example") TPermissionExample example);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);
}