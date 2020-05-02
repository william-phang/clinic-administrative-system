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
public class TInputRecord {
	private Integer input_id;

    private String input_sn;

    private Date input_date;

    private String input_person;

    private String input_type;

    private String supplier;

    private Date tabulation_date;

    private String tabulation_person;

    private BigDecimal purchase_amount;

    private BigDecimal retail_amount;
    
    private String remarks;

    private String status;
}