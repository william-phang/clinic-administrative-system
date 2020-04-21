package com.woniuxy.clinic.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 患者信息
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	private Integer id; // 主键列
	private String patient_name; // 患者姓名
	private String patient_card; // 患者卡号
	private Integer patient_age; // 患者年龄
	private Date patient_birthday; // 出生日期
	private String patient_gender; // 性别
	private String patient_phone; // 手机号码
	private String patient_number; // 证件号码
	private String patient_type; // 接诊类型！！！有歧义
	private String patient_address; // 地址
	private String patient_AddrMasagge; // 详情地址 
}
