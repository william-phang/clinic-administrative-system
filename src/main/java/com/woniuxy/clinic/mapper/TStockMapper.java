package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TStock;
import com.woniuxy.clinic.entity.TStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStockMapper {
    int countByExample(TStockExample example);

    int deleteByExample(TStockExample example);

    int deleteByPrimaryKey(Integer stockId);

    int insert(TStock record);

    int insertSelective(TStock record);

    List<TStock> selectByExample(TStockExample example);

    TStock selectByPrimaryKey(Integer stockId);

    int updateByExampleSelective(@Param("record") TStock record, @Param("example") TStockExample example);

    int updateByExample(@Param("record") TStock record, @Param("example") TStockExample example);

    int updateByPrimaryKeySelective(TStock record);

    int updateByPrimaryKey(TStock record);
}