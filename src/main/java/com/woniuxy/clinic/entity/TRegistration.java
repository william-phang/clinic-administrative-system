package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	挂号记录表	
 * 	一张挂号记录对应一位患者
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TRegistration {
    private Long registration_id;

    private String registration_sn;

    private Integer department_id;

    private String reception_type;

    private String reception_doctor;

    private BigDecimal registration_amount;

    private BigDecimal reception_amount;
    
    private String reception_status;

    private Date re_create_time;

    private Integer staff_id;
    
    private Integer patient_id; // 一对一关系：关联患者表

    //一张表对应一个科室
    private TDepartment tDepartment;
    
    //一张表对应一个医生
    private TStaff tStaff;
    
    //一张表对应一个患者
    private Patient patient;

	@Override
	public String toString() {
		return "TRegistration [registration_id=" + registration_id + ", reception_type=" + reception_type
				+ ", reception_status=" + reception_status + ", re_create_time=" + re_create_time + ", tDepartment="
				+ tDepartment + ", tStaff=" + tStaff + ", patient=" + patient + "]";
	}
    
    
}