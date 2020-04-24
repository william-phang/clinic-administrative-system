package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.entity.TDrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDrugMapper {
    int countByExample(TDrugExample example);

    int deleteByExample(TDrugExample example);

    int deleteByPrimaryKey(Integer drugId);

    int insert(TDrug record);

    int insertSelective(TDrug record);

    List<TDrug> selectByExample(TDrugExample example);

    TDrug selectByPrimaryKey(Integer drugId);

    int updateByExampleSelective(@Param("record") TDrug record, @Param("example") TDrugExample example);

    int updateByExample(@Param("record") TDrug record, @Param("example") TDrugExample example);

    int updateByPrimaryKeySelective(TDrug record);

    int updateByPrimaryKey(TDrug record);
}