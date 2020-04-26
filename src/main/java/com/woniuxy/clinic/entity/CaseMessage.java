package com.woniuxy.clinic.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 	体格信息
 * @author 14268
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaseMessage {
    private Integer casemessage_id;

    private Date casemessage_date;

    private String casemessage_subject;

    private String casemessage_cahistory;

    private String casemessage_previous;

    private String casemessage_allergy;

    private String casemessage_bi;

    private String casemessage_fm;

    private String casemessage_help;

    private String casemessage_idea;

    private String casemessage_ps;

}