package com.woniuxy.clinic.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class TMedicalFeeDto {
	
	private String medical_name;

    private BigDecimal medical_fee;

    private BigDecimal medical_cost;

    private Date medical_date;

    private String medical_founder;

    private String medical_state;
    
    private Date begin;
    
    private  Date end;
}
