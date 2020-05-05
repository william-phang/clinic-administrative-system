package com.woniuxy.clinic.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  前端接收的对象——--药品
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugT {
	private Integer num1;
	private Integer num2;
	private String name;
	private String drugmassage_dose;
	private String drugmassage_use;
	private String drugmassage_fqt;
	private String drugmassage_date;
	private String drugmassage_type;
	
}
