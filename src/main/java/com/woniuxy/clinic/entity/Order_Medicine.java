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

	private Integer order_medicine_id;//主键
	private Integer order_medicine_number;//数量
	private Double order_medicine_total;//总额
	private Integer order_id;//订单编号
	private TDrug tDrug;//药品对象
}
