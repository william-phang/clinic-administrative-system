package com.woniuxy.clinic.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.clinic.entity.CaseMessage;
@Mapper
public interface CaseMessageMapper {
    
	// 插入体格信息
	void insertCaseMessage(CaseMessage caseMessage);
	
	// 根据数据查询对应的主键
	int selectCaseMessageByOther(String casemessage_cahistory,String casemessage_help,String casemessage_idea );
}