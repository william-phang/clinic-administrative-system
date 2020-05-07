package com.woniuxy.clinic.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 零售药品项实体
 * 
 * @author Administrator
 *
 */
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Retail_Medicine {

	private Integer retail_medicine_id;// 主键
	private Integer drug_sn;// 药品编号
	private String name;// 名称
	private Double retail_amount;// 单价
	private Integer retail_medicine_number;// 数量

	public Retail_Medicine() {
		super();
	}

	public Retail_Medicine(Integer retail_medicine_id, Integer drug_sn, String name, Double retail_amount,
			Integer retail_medicine_number) {
		super();
		this.retail_medicine_id = retail_medicine_id;
		this.drug_sn = drug_sn;
		this.name = name;
		this.retail_amount = retail_amount;
		this.retail_medicine_number = retail_medicine_number;
	}

	public Integer getRetail_medicine_id() {
		return retail_medicine_id;
	}

	public void setRetail_medicine_id(Integer retail_medicine_id) {
		this.retail_medicine_id = retail_medicine_id;
	}

	public Integer getDrug_sn() {
		return drug_sn;
	}

	public void setDrug_sn(Integer drug_sn) {
		this.drug_sn = drug_sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRetail_amount() {
		return retail_amount;
	}

	public void setRetail_amount(Double retail_amount) {
		this.retail_amount = retail_amount;
	}

	public Integer getRetail_medicine_number() {
		return retail_medicine_number;
	}

	public void setRetail_medicine_number(Integer retail_medicine_number) {
		this.retail_medicine_number = retail_medicine_number;
	}


	@Override
	public String toString() {
		return "{\"retail_medicine_id\":\"" + retail_medicine_id + "\",\"drug_sn\":\"" + drug_sn + "\",\"name\":\""
				+ name + "\",\"retail_amount\":\"" + retail_amount + "\",\"retail_medicine_number\":\""
				+ retail_medicine_number + "\"}";
	}

}
