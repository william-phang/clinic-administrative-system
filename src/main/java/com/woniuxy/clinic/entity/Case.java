package com.woniuxy.clinic.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//病历
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Case {
	private Integer case_id; // 主键
	private Patient patient; // 一个病历对应一个患者信息
	private Case_message case_message; // 一个病历对应一个患者体格信息
	private Physique_message physique_message; // 一个病历对应一个患者病历信息
	
}
