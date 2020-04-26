package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

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
public class Registration {
    private Long registration_id;

    private String registration_sn;

    private String department;

    private String reception_type;

    private String reception_doctor;

    private BigDecimal registration_amount;

    private BigDecimal reception_amount;

    private Date create_time;

    private Integer staff_id;
    
    private Patient tPatient; // 一对一关系：关联患者表

}