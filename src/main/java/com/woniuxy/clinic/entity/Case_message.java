package com.woniuxy.clinic.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 体格信息
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Case_message {
	private Integer casemessage_id; // 主键
	private Date casemessage_date; // 发病日期
	private String casemessage_subject; // 主诉
	private String casemessage_cahistory; // 现病史
	private String casemessage_previous; // 既往史 
	private String casemessage_allergy; // 过敏史
	private String casemessage_bi; // 个人史
	private String casemessage_fm; // 家族史
	private String casemessage_help; // 辅助检查
	private String casemessage_idea; // 治疗意见
	private String casemessage_ps; // 备注
}
