package com.woniuxy.clinic.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
// 配置器
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
@Configuration
public class MyWebMvcConfig{
	// 配置日期转换服务
	@Autowired
	private RequestMappingHandlerAdapter handlerAdapter;
	
	@PostConstruct
	public void initEditableValidation() {
		ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter.getWebBindingInitializer();
		if(initializer.getConversionService() != null) {
			GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
			genericConversionService.addConverter(new Dateconverter() );
		}
	}
	
	
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
//				case页面
				registry.addViewController("/page/case/case.html").setViewName("page/case/case");
				registry.addViewController("/page/drug_management/drug_info_list.html").setViewName("page/drug_management/drug_info_list");
				registry.addViewController("/page/drug_management/drug_info_add.html").setViewName("page/drug_management/drug_info_add");
				
				registry.addViewController("/page/drug_management/output_management_list.html").setViewName("page/drug_management/output_management_list");
				registry.addViewController("/page/drug_management/output_management_add.html").setViewName("page/drug_management/output_management_add");
				
				registry.addViewController("/page/drug_management/input_management_list.html").setViewName("page/drug_management/input_management_list");
				registry.addViewController("/page/drug_management/input_management_add.html").setViewName("page/drug_management/input_management_add");
				
				registry.addViewController("/page/drug_management/inventory_management_list.html").setViewName("page/drug_management/inventory_management_list");
				registry.addViewController("/page/drug_management/inventory_management_add.html").setViewName("page/drug_management/inventory_management_add");
				
				registry.addViewController("/page/drug_management/stock_check_list.html").setViewName("page/drug_management/stock_check_list");
				registry.addViewController("/page/drug_management/stock_check_add.html").setViewName("page/drug_management/stock_check_add");
				
				registry.addViewController("/page/drug_management/price_adjustment_list.html").setViewName("page/drug_management/price_adjustment_list");
				registry.addViewController("/page/drug_management/price_adjustment_add.html").setViewName("page/drug_management/price_adjustment_add");
				
			}
		};
	}
}
