package com.woniuxy.clinic.dto;

import java.math.BigDecimal;

import java.util.Date;

import lombok.Data;
@Data
public class TAdditionalFeeDto {
	
	private String additional_name;

    private BigDecimal additional_fee;

    private BigDecimal additional_cost;

    private Date additional_date;

    private String additional_founder;

    private String additional_state;
    
    private Date begin;
    
    private  Date end;
}
