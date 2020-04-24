package com.woniuxy.clinic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单内药品项实体
 * @author Administrator
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order_Medicine {

	private Integer id;//主键
	private Integer number;//数量
	private Double total;//总额
	private Integer order_id;//订单编号
	private Integer medecine_id;//药品编号
}
