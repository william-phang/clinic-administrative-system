package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TInputDrug;
import com.woniuxy.clinic.entity.TInputDrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInputDrugMapper {
    int countByExample(TInputDrugExample example);

    int deleteByExample(TInputDrugExample example);

    int deleteByPrimaryKey(Integer inputDrugId);

    int insert(TInputDrug record);

    int insertSelective(TInputDrug record);

    List<TInputDrug> selectByExample(TInputDrugExample example);

    TInputDrug selectByPrimaryKey(Integer inputDrugId);

    int updateByExampleSelective(@Param("record") TInputDrug record, @Param("example") TInputDrugExample example);

    int updateByExample(@Param("record") TInputDrug record, @Param("example") TInputDrugExample example);

    int updateByPrimaryKeySelective(TInputDrug record);

    int updateByPrimaryKey(TInputDrug record);
}