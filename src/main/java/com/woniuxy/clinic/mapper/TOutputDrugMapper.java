package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TOutputDrug;
import com.woniuxy.clinic.entity.TOutputDrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOutputDrugMapper {
    int countByExample(TOutputDrugExample example);

    int deleteByExample(TOutputDrugExample example);

    int deleteByPrimaryKey(Integer outputDrugId);

    int insert(TOutputDrug record);

    int insertSelective(TOutputDrug record);

    List<TOutputDrug> selectByExample(TOutputDrugExample example);

    TOutputDrug selectByPrimaryKey(Integer outputDrugId);

    int updateByExampleSelective(@Param("record") TOutputDrug record, @Param("example") TOutputDrugExample example);

    int updateByExample(@Param("record") TOutputDrug record, @Param("example") TOutputDrugExample example);

    int updateByPrimaryKeySelective(TOutputDrug record);

    int updateByPrimaryKey(TOutputDrug record);
}