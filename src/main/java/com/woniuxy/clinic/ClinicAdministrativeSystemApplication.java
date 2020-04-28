package com.woniuxy.clinic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.woniuxy.clinic.mapper")
@SpringBootApplication
public class ClinicAdministrativeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicAdministrativeSystemApplication.class, args);
	}

}
 