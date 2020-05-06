package com.woniuxy.clinic.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  药品
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drug {
	private Integer drug_sn; 
	private String type; // 药品类型
	private String name; // 药品名字
	private String specification; // 药品规格
	private Double retail_amount; // 售价
}
