package com.woniuxy.clinic.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.clinic.entity.TCase;
@Mapper
public interface TCaseMapper {
	// 根据主键查询相关信息
	TCase selectTCase(int case_id);
}