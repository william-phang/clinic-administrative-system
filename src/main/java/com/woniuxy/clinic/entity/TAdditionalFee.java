package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TAdditionalFee {
    private Integer additionalId;

    private String additionalName;

    private BigDecimal additionalFee;

    private BigDecimal additionalCost;

    private Date additionalDate;

    private String additionalFounder;

    private String additionalState;

    
}