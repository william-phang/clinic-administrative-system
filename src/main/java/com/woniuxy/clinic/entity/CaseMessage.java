package com.woniuxy.clinic.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

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
public class CaseMessage {
    private Integer casemessage_id;      
    
    @NotNull(message="发病日期必填项")
    @DateTimeFormat(pattern="^\\d{4}-\\d{2}-\\d{2}$")
    private Date casemessage_date; // 发病日期

    private String casemessage_subject; // 主诉
    
    private String casemessage_cahistory; // 现病史

    private String casemessage_previous; // 既往史

    private String casemessage_allergy; // 过敏史

    private String casemessage_bi; // 个人史

    private String casemessage_fm; // 家族史

    private String casemessage_help; // 辅助检查

    private String casemessage_idea; // 治疗意见

    private String casemessage_ps; // 备注

}