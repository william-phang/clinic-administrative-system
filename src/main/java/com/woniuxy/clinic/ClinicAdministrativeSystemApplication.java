package com.woniuxy.clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//启用事务管理
@EnableTransactionManagement
@SpringBootApplication
public class ClinicAdministrativeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicAdministrativeSystemApplication.class, args);
	}

}
 