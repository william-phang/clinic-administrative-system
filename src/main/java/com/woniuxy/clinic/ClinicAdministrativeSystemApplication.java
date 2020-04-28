package com.woniuxy.clinic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//启用事务管理
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.woniuxy.clinic.mapper")
public class ClinicAdministrativeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicAdministrativeSystemApplication.class, args);
	}

}
 