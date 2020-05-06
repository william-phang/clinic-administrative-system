package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单实体
 * @author 14268
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

	private Integer order_id;//主键
	private String order_sn;//订单编号
	private String order_type;//订单类型
	private Integer patient_id;//患者编号
	private String department;//接诊科室
	private String doctor;//接诊医生
	private Date createdate;//创建时间
	private Double order_money;//金额
	private String order_statement;//订单状态
	private String pay_mode;//支付方式
	
}
