package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.TOutputRecord;
import com.woniuxy.clinic.entity.TOutputRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOutputRecordMapper {
    int countByExample(TOutputRecordExample example);

    int deleteByExample(TOutputRecordExample example);

    int deleteByPrimaryKey(Integer outputId);

    int insert(TOutputRecord record);

    int insertSelective(TOutputRecord record);

    List<TOutputRecord> selectByExample(TOutputRecordExample example);

    TOutputRecord selectByPrimaryKey(Integer outputId);

    int updateByExampleSelective(@Param("record") TOutputRecord record, @Param("example") TOutputRecordExample example);

    int updateByExample(@Param("record") TOutputRecord record, @Param("example") TOutputRecordExample example);

    int updateByPrimaryKeySelective(TOutputRecord record);

    int updateByPrimaryKey(TOutputRecord record);
}