package com.woniuxy.clinic.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.clinic.entity.Case;
@Mapper
public interface CaseMapper {
	// 根据主键查询相关信息
	Case selectTCase(int case_id);
	
	// 关联外键
	void insertID(int physiquemessage_id,int casemessage_id,int case_id );
	void insertId(int casemessage_id,int case_id);
}