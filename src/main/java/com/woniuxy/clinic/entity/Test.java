package com.woniuxy.clinic.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  前端接收的数据
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
	private Integer stock_amount; // 库存
	private String name; // 药品名称
	private String type; // 类型
	private String retail_amount; // 价格
	private String specification; // 规格
}
