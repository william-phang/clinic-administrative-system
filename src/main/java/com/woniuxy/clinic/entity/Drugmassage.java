package com.woniuxy.clinic.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	药品详情
 * 	 	关联Stock表
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drugmassage {
	private Integer drugmassage_id;
	private Stock stock; // 关联Stock表
	private Integer drugmassage_dose; // 单剂量
	private String drugmassage_use; // 用法
	private String drugmassage_fqt; // 频度
	private String drugmassage_date; // 天数
	private String drugmassage_total; // 总量
	private String drugmassage_type; // 单位
	private Double drugmassage_petty; // 零售金额
	private Double drugmassage_handling; // 处理费
	private Double drugmassage_injection; // 注射费
	private Date creatdate;  // 创建时间
	private Double drugmassage_totalprice; // 合计
}
