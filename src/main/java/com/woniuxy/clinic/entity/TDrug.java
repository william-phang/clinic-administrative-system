package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TDrug {

	private Integer drug_sn;

    private String type;

    private Integer status;

    private String bar_code;

    private String name;

    private String phonetic_code;

    private String specification;

    private String dosage_form;

    private Integer otc;

    private String invoice;

    private String approval_number;

    private String manufacturer;

    private String packing_unit;

    private String basic_coefficient;

    private String basic_unit;

    private String dose_coefficient;

    private String dose_unit;

    private BigDecimal purchase_amount;

    private BigDecimal retail_amount;

    private Integer dismounted;

    private String drug_use;

    private String single_dosage;

    private String frequency;

    private Integer day;

    private Integer total;

    private String unit;

    private Integer minimum_inventory;

    private Integer maximum_inventory;

    private String goods_location;

    private Integer expiration_date_warning;

    private String instruction;

    private Date create_time;

    private String remarks;

}