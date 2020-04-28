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
				
				registry.addViewController("/page/drug_management/drug_info_list.html").setViewName("page/drug_management/drug_info_list");
				registry.addViewController("/page/drug_management/drug_info_add.html").setViewName("page/drug_management/drug_info_add");
			}
		};
	}
}
