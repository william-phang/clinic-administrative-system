package com.woniuxy.clinic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.transaction.annotation.EnableTransactionManagement;
//开启事务
@EnableTransactionManagement
//自动扫描mapper下的接口生成实现类
@SpringBootApplication
@MapperScan("com.woniuxy.clinic.mapper")
public class ClinicAdministrativeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicAdministrativeSystemApplication.class, args);
	}

}
 