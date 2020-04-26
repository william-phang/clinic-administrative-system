package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TRegistrationFee;
import com.woniuxy.clinic.entity.TRegistrationFeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TRegistrationFeeMapper {
    int countByExample(TRegistrationFeeExample example);

    int deleteByExample(TRegistrationFeeExample example);

    int deleteByPrimaryKey(Integer regis_id);

    int insert(TRegistrationFee record);

    int insertSelective(TRegistrationFee record);

    List<TRegistrationFee> selectByExample(TRegistrationFeeExample example);

    TRegistrationFee selectByPrimaryKey(Integer regis_id);

    int updateByExampleSelective(@Param("record") TRegistrationFee record, @Param("example") TRegistrationFeeExample example);

    int updateByExample(@Param("record") TRegistrationFee record, @Param("example") TRegistrationFeeExample example);

    int updateByPrimaryKeySelective(TRegistrationFee record);

    int updateByPrimaryKey(TRegistrationFee record);
}