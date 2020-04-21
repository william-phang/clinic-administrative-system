package com.woniuxy.clinic.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 病历信息
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Physique_message {
	private Integer physiquemessage_id; // 主键
	private Double physiquemessage_animal; // 体温
	private Integer physiquemessage_breathe; // 呼吸
	private Integer physiquemessage_pulse; // 脉搏
	private Integer physiquemessage_BP; // 血压
	private Double physiquemessage_height; // 身高
	private Double physiquemessage_weight; // 体重
	private Double physiquemessage_bg; // 血糖
	private Double physiquemessage_bf; // 血脂
}
