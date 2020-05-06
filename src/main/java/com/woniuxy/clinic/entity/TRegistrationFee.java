
package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TRegistrationFee {
    private Integer regis_id;

    private String regis_name;

    private BigDecimal regis_fee;

    private BigDecimal regis_cost;

    private Date regis_date;

    private String regis_founder;

    private String regis_state;

}