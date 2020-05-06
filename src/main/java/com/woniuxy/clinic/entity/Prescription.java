package com.woniuxy.clinic.entity;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处方
 * 	关联
 * 		药品详情信息
 * 		病历
 * 		医嘱
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {

	private Integer prescription_id;
	private String prescription_diagnose; // 诊断
	private String prescription_advice; // 医嘱
	private List<Drugmassage> Drugmassage; // 一个处方对应多个药品详情
	private Case Case; // 关联病历表
	private TRegistration registratio; // 关联挂号记录表--里面有医生
	private Date creatdate; // 创建时间
}
