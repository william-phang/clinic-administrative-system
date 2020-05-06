package com.woniuxy.clinic.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class OrderDto {
	private String type;
	private Integer statement;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date begin;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date end;
}
