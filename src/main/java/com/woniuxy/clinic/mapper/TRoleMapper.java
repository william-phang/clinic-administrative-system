package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TRole;
import com.woniuxy.clinic.entity.TRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TRoleMapper {
    int countByExample(TRoleExample example);

    int deleteByExample(TRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByExample(TRoleExample example);

    TRole selectByPrimaryKey(Integer roleId);
    
    TRole selectByname(String role_name);
    
    @Select("select permission_name from t_role r,t_permission p WHERE r.role_id = p.role_id \r\n" + 
    		"    		and r.role_id = #{value} AND status=\"启用\"")
    List<String> findPermsByRoles(Integer roleId);

    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}