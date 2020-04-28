package com.woniuxy.clinic.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	体格信息
 * 		使用自带后端验证
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhysiqueMessage {
    private Integer physiquemessage_id;

    @Min(value=37,message="体温不能小于{value}")
    @Max(value=40,message="体温不能大于{value}")
    private Double physiquemessage_animal;

    @Min(value=10,message="呼吸不能小于{value}")
    @Max(value=30,message="呼吸不能大于{value}")
    private Integer physiquemessage_breathe;
    
    @Min(value=50,message="脉搏不能小于{value}")
    @Max(value=110,message="脉搏不能大于{value}")
    private Integer physiquemessage_pulse;

    @Min(value=90,message="血压不能小于{value}")
    @Max(value=140,message="血压不能大于{value}")
    private Integer physiquemessage_BP;

    @Min(value=120,message="身高不能小于{value}")
    @Max(value=210,message="身高不能大于{value}")
    private Double physiquemessage_height;

    @Min(value=30,message="体重不能小于{value}")
    @Max(value=150,message="体重不能大{value}")
    private Double physiquemessage_weight;

    @Min(value=2,message="血糖不能小于{value}")
    @Max(value=12,message="血糖不能大{value}")
    private Double physiquemessage_bg;

    @Min(value=2,message="血脂不能小于{value}")
    @Max(value=7,message="血脂不能大{value}")
    private Double physiquemessage_bf;

}