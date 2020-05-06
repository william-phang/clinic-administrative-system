package com.woniuxy.clinic.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.clinic.entity.Drug;

@Mapper
public interface DrugMapper {
	// 通过药物名称查询对应的数据
	Drug selectByname(String name);
	
}
