package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TPriceAdjustment;
import com.woniuxy.clinic.entity.TPriceAdjustmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPriceAdjustmentMapper {
    int countByExample(TPriceAdjustmentExample example);

    int deleteByExample(TPriceAdjustmentExample example);

    int deleteByPrimaryKey(Integer priceAdjustmentId);

    int insert(TPriceAdjustment record);

    int insertSelective(TPriceAdjustment record);

    List<TPriceAdjustment> selectByExample(TPriceAdjustmentExample example);

    TPriceAdjustment selectByPrimaryKey(Integer priceAdjustmentId);

    int updateByExampleSelective(@Param("record") TPriceAdjustment record, @Param("example") TPriceAdjustmentExample example);

    int updateByExample(@Param("record") TPriceAdjustment record, @Param("example") TPriceAdjustmentExample example);

    int updateByPrimaryKeySelective(TPriceAdjustment record);

    int updateByPrimaryKey(TPriceAdjustment record);
}