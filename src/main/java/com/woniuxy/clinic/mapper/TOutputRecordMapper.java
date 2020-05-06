package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.dto.OutputDto;
import com.woniuxy.clinic.entity.TOutputRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOutputRecordMapper {

	Integer selectOutputsNumByCondition(@Param("output")OutputDto outputDto);

	List<TOutputRecord> selectOutputsByCondition(@Param("output")OutputDto outputDto, @Param("beginIndex")Integer beginIndex, @Param("pageSize")Integer pageSize);
}