package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TInputRecord;
import com.woniuxy.clinic.entity.TInputRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInputRecordMapper {
    int countByExample(TInputRecordExample example);

    int deleteByExample(TInputRecordExample example);

    int deleteByPrimaryKey(Integer inputId);

    int insert(TInputRecord record);

    int insertSelective(TInputRecord record);

    List<TInputRecord> selectByExample(TInputRecordExample example);

    TInputRecord selectByPrimaryKey(Integer inputId);

    int updateByExampleSelective(@Param("record") TInputRecord record, @Param("example") TInputRecordExample example);

    int updateByExample(@Param("record") TInputRecord record, @Param("example") TInputRecordExample example);

    int updateByPrimaryKeySelective(TInputRecord record);

    int updateByPrimaryKey(TInputRecord record);
}