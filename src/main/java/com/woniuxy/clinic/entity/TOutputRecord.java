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
public class TOutputRecord {
	private Integer output_id;

    private String output_sn;

    private Date output_date;

    private String output_person;

    private String output_type;

    private Date tabulation_date;

    private String tabulation_person;
    
    private BigDecimal purchase_amount;

    private BigDecimal retail_amount;

    private String remarks;

    private String status;
}