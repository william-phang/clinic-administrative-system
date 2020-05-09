package com.woniuxy.clinic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.jacoco.agent.rt.internal_1f1cc91.asm.tree.TryCatchBlockNode;

import com.woniuxy.clinic.dto.TRegistrationDto;
import com.woniuxy.clinic.entity.TRegistration;
import com.woniuxy.clinic.entity.TRegistrationExample;

@Mapper
public interface TRegistrationMapper {
    int countByExample(TRegistrationExample example);

    int deleteByExample(TRegistrationExample example);

    int deleteByPrimaryKey(Long registration_id);

    int insert(TRegistration record);

    int insertSelective(TRegistration record);

    List<TRegistration> selectByExample(TRegistrationExample example);

    TRegistration selectByPrimaryKey(Long registration_id);

    int updateByExampleSelective(@Param("record") TRegistration record, @Param("example") TRegistrationExample example);

    int updateByExample(@Param("record") TRegistration record, @Param("example") TRegistrationExample example);

    int updateByPrimaryKeySelective(TRegistration record);

    int updateByPrimaryKey(TRegistration record);
    
    //分页查询
    List<TRegistration> selectByPage(@Param("currentPage")Integer currentPage, @Param("pageSize")Integer pageSize,@Param("dto") TRegistrationDto dto);
    
    //总条数
    int selectByPageCount(@Param("dto")TRegistrationDto dto);
}