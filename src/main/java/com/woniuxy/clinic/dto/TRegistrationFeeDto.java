package com.woniuxy.clinic.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class TRegistrationFeeDto {
	
	private String regis_name;

    private BigDecimal regis_fee;

    private BigDecimal regis_cost;

    private Date regis_date;

    private String regis_founder;

    private String regis_state;
    
    private Date begin;
    
    private  Date end;

	@Override
	public String toString() {
		return "TRegistrationFeeDto [regis_name=" + regis_name + ", regis_fee=" + regis_fee + ", regis_cost="
				+ regis_cost + ", regis_date=" + regis_date + ", regis_founder=" + regis_founder + ", regis_state="
				+ regis_state + ", begin=" + begin + ", end=" + end + "]";
	}
    
    
}
