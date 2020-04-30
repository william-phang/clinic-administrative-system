
package com.woniuxy.clinic.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  患者表
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Integer patient_id;

    private String patient_sn;

    private String patient_name;

    private Integer patient_gender;

    private Integer patient_age;

    private String patient_phone;

    private Integer grade;

    private Integer staff_id;

    private String patient_card;

    private Date patient_birthday;

    private String patient_number;

    private String patient_address;

    private String patient_remark;

    private Date create_time;

    private Integer patient_from;

    private String patient_folk;

    private Integer patient_marital;

    private String patient_work;

    private String patient_work_place;

    private String patient_education;

    private Integer flag;

}