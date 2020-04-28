package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.dto.InputDto;
import com.woniuxy.clinic.entity.TInputRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInputRecordMapper {
	Integer selectInputsNumByCondition(@Param("input")InputDto inputDto);
	List<TInputRecord> selectInputsByCondition(@Param("input")InputDto inputDto, @Param("beginIndex") Integer beginIndex, @Param("pageSize") Integer pageSize);
}