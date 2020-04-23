package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TAdditionalFeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TAdditionalFeeMapper {
    int countByExample(TAdditionalFeeExample example);

    int deleteByExample(TAdditionalFeeExample example);

    int deleteByPrimaryKey(Integer additionalId);

    int insert(TAdditionalFee record);

    int insertSelective(TAdditionalFee record);

    List<TAdditionalFee> selectByExample(TAdditionalFeeExample example);

    TAdditionalFee selectByPrimaryKey(Integer additionalId);

    int updateByExampleSelective(@Param("record") TAdditionalFee record, @Param("example") TAdditionalFeeExample example);

    int updateByExample(@Param("record") TAdditionalFee record, @Param("example") TAdditionalFeeExample example);

    int updateByPrimaryKeySelective(TAdditionalFee record);

    int updateByPrimaryKey(TAdditionalFee record);
}