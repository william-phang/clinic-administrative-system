package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单实体
 * @author chy
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

	private Integer id;//主键
	private String order_id;//订单编号
	private String type;//订单类型
	private String patient_name;//患者姓名
	private String patient_gender;//患者性别
	private Integer patient_age;//患者年龄
	private String patient_tel;//患者手机号
	private Integer patient_id;//患者编号
	private String department;//接诊科室
	private String doctor;//接诊医生
	private Date createdate;//创建时间
	private BigDecimal money;//金额
	private String statement;//订单状态
	private String pay_mode;//支付方式
	
}
