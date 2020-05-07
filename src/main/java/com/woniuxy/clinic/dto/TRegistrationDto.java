package com.woniuxy.clinic.dto;

import java.math.BigDecimal;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TDepartment;
import com.woniuxy.clinic.entity.TStaff;

import lombok.Data;
@Data
public class TRegistrationDto {
	
	private Long registration_id;

    private String registration_sn;

    private Integer department_id;

    private String reception_type;

    private String reception_doctor;

    private BigDecimal registration_amount;

    private BigDecimal reception_amount;

    private Date re_create_time;

    private Integer staff_id;
    
    private Integer patient_id; // 一对一关系：关联患者表
    
    private String reception_status;

    //一张表对应一个科室
    private TDepartment tDepartment;
    
    //一张表对应一个医生
    private TStaff tStaff;
    
    //一张表对应一个患者
    private Patient patient;
    
    private Date begin;
    private  Date end;
}
