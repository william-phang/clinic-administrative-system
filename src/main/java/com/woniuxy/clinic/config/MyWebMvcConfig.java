package com.woniuxy.clinic.config;

// 配置器
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyWebMvcConfig{
	@Bean
	public WebMvcConfigurer mvcConfiguration() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("login");
				registry.addViewController("/index.html").setViewName("index");
				registry.addViewController("/login.html").setViewName("login");
				registry.addViewController("/page/welcome.html").setViewName("page/welcome");
				registry.addViewController("/page/table.html").setViewName("page/table");
				registry.addViewController("/page/icon.html").setViewName("page/icon");
				registry.addViewController("/page/user-password.html").setViewName("page/user-password");
				registry.addViewController("/page/user-setting.html").setViewName("page/user-setting");
				registry.addViewController("/page/tableEdit/add.html").setViewName("page/tableEdit/add");
				registry.addViewController("/page/tableEdit/edit.html").setViewName("page/tableEdit/edit");
				registry.addViewController("/page/fee/addtadditionalfee.html").setViewName("page/fee/addtadditionalfee");
				registry.addViewController("/page/fee/edittadditionalfee.html").setViewName("page/fee/edittadditionalfee");
				registry.addViewController("/page/fee/addTMedicalfee.html").setViewName("page/fee/addTMedicalfee");
				registry.addViewController("/page/fee/editTMedicalFee.html").setViewName("page/fee/editTMedicalFee");
				registry.addViewController("/page/fee/addTRegistrationfee.html").setViewName("page/fee/addTRegistrationfee");
				registry.addViewController("/page/fee/editTRegistrationFee.html").setViewName("page/fee/editTRegistrationFee");
			}
		};
	}
}
