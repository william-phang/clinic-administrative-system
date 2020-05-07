package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Retail_Medicine;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RetailMapper {

	//void insertOrder(@Param("order")Order order);

	List<Integer> selectDrug_sn();

	void updateRetail_Medicine_Number(@Param("medical_id")Integer medical_id);

	void insertRetail_Medicine(@Param("medical_id")Integer medical_id);

	Integer selectRetailMedicinesNum();

	List<Retail_Medicine> selectRetailMedicines(Integer beginIndex, Integer pageSize);

	void addOne(@Param("drug_sn")Integer drug_sn);

	void delete(Integer drug_sn);

	void reduceOne(@Param("drug_sn")Integer drug_sn);

	List<Retail_Medicine> findRetailMedince();

	void saveOrderInfo(@Param("order")Order order);

	Integer selectOrderID(@Param("order")Order order);

	void saveOrderMedicineInfo(@Param("order_id")Integer order_id,@Param("retail_drug") Retail_Medicine retail_drug,@Param("stotal") Double stotal);

	void deleteAll();

	Integer selectPatientIDBySn(@Param("patient_sn")String patient_sn);

	

	

}