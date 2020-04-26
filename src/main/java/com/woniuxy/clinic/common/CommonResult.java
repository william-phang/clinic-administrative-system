package com.woniuxy.clinic.common;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.woniuxy.clinic.entity.TAdditionalFee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonResult<T> implements Serializable{
	
	//状态码
	private Long code;
	//提示信息
	private String message;
	//响应数据
	private List<T> data;
	
}


