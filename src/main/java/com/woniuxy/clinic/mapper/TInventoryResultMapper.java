package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TInventoryResult;
import com.woniuxy.clinic.entity.TInventoryResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInventoryResultMapper {
    int countByExample(TInventoryResultExample example);

    int deleteByExample(TInventoryResultExample example);

    int deleteByPrimaryKey(Integer inventoryResultId);

    int insert(TInventoryResult record);

    int insertSelective(TInventoryResult record);

    List<TInventoryResult> selectByExample(TInventoryResultExample example);

    TInventoryResult selectByPrimaryKey(Integer inventoryResultId);

    int updateByExampleSelective(@Param("record") TInventoryResult record, @Param("example") TInventoryResultExample example);

    int updateByExample(@Param("record") TInventoryResult record, @Param("example") TInventoryResultExample example);

    int updateByPrimaryKeySelective(TInventoryResult record);

    int updateByPrimaryKey(TInventoryResult record);
}