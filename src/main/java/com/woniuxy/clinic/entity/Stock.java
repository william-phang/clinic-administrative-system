package com.woniuxy.clinic.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	Stock表
 * 		关联药品
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
	private Integer stock_id; 
	private Drug drug; // 药品表
	private Integer stock_amount; // 库存
}
