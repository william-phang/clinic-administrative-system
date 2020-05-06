package com.woniuxy.clinic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.clinic.entity.Stock;
@Mapper
public interface StockMapper {
	// 根据药品主键查询Stock表
	Stock selelctBydrug_sn(int drug_sn); 
	
	// 查询所有Stock
	List<Stock> selectByAll();
}
