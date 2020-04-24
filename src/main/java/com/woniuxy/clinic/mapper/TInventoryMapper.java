package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TInventory;
import com.woniuxy.clinic.entity.TInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInventoryMapper {
    int countByExample(TInventoryExample example);

    int deleteByExample(TInventoryExample example);

    int deleteByPrimaryKey(Integer inventoryId);

    int insert(TInventory record);

    int insertSelective(TInventory record);

    List<TInventory> selectByExample(TInventoryExample example);

    TInventory selectByPrimaryKey(Integer inventoryId);

    int updateByExampleSelective(@Param("record") TInventory record, @Param("example") TInventoryExample example);

    int updateByExample(@Param("record") TInventory record, @Param("example") TInventoryExample example);

    int updateByPrimaryKeySelective(TInventory record);

    int updateByPrimaryKey(TInventory record);
}