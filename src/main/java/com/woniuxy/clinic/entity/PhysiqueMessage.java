package com.woniuxy.clinic.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	病历详情信息
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhysiqueMessage {
    private Integer physiquemessage_id;

    private Double physiquemessage_animal;

    private Integer physiquemessage_breathe;

    private Integer physiquemessage_pulse;

    private Integer physiquemessage_BP;

    private Double physiquemessage_height;

    private Double physiquemessage_weight;

    private Double physiquemessage_bg;

    private Double physiquemessage_bf;

}