package com.woniuxy.clinic.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  病历表
 *  	关联
 *  		体格信息
 *  		病历详情信息
 *  		挂号记录
 * @author 14268
 *
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCase {
    private Integer case_id;

    private TCaseMessage tCaseMessage; // 一张病历对应以为患者的体格信息

    private TPhysiqueMessage tPhysiqueMessage; // 一张病历对应以为患者的病历详情信息

    private TRegistration tRegistration; // 一张病历对应以为患者的挂号信息

}