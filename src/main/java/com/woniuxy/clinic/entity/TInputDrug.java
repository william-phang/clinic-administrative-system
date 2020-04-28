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
public class TInputDrug {
    private String drugSn;

    private Integer inputSn;

    private Integer inputNumber;

    private Date expirationDate;

    private BigDecimal purchaseAmount;

    private BigDecimal retailAmount;
}