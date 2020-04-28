package com.woniuxy.clinic.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.clinic.entity.PhysiqueMessage;
@Mapper
public interface PhysiqueMessageMapper {
	// 插入对应的数据
	void insertPhysiqueMessage(PhysiqueMessage physiqueMessage);
	
	// 根据数据查询对应的主键
	int selectPhysiqueMessageOther(Double physiquemessage_animal,Integer physiquemessage_breathe,Integer physiquemessage_pulse,Double physiquemessage_bg,Double physiquemessage_bf);
}