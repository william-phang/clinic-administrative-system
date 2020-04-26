package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TMedicalFeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMedicalFeeMapper {
    int countByExample(TMedicalFeeExample example);

    int deleteByExample(TMedicalFeeExample example);

    int deleteByPrimaryKey(Integer medical_id);

    int insert(TMedicalFee record);

    int insertSelective(TMedicalFee record);

    List<TMedicalFee> selectByExample(TMedicalFeeExample example);

    TMedicalFee selectByPrimaryKey(Integer medical_id);

    int updateByExampleSelective(@Param("record") TMedicalFee record, @Param("example") TMedicalFeeExample example);

    int updateByExample(@Param("record") TMedicalFee record, @Param("example") TMedicalFeeExample example);

    int updateByPrimaryKeySelective(TMedicalFee record);

    int updateByPrimaryKey(TMedicalFee record);
}