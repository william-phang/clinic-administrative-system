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

				registry.addViewController("/page/user_module/fpassword.html").setViewName("/page/user_module/fpassword");

				registry.addViewController("/index.html").setViewName("index");
				registry.addViewController("/tAadditionalFeelist.html").setViewName("tAadditionalFeelist");
				registry.addViewController("/login.html").setViewName("login");
				registry.addViewController("/page/welcome.html").setViewName("page/welcome");

				registry.addViewController("/page/user_module/departmenttable.html").setViewName("page/user_module/departmenttable.html");
				registry.addViewController("/page/icon.html").setViewName("page/icon");
				registry.addViewController("/page/user_module/user-password.html").setViewName("page/user_module/user-password");
				registry.addViewController("/page/user_module/user-setting.html").setViewName("page/user_module/user-setting");
				registry.addViewController("/page/user_module/stafftable.html").setViewName("page/user_module/stafftable.html");
				registry.addViewController("/page/user_module/roletable.html").setViewName("page/user_module/roletable.html");
				registry.addViewController("/page/user_module/permissiontable.html").setViewName("page/user_module/permissiontable.html");
				registry.addViewController("/page/user_module/tableEdit/staffadd.html").setViewName("page/user_module/tableEdit/staffadd");
				registry.addViewController("/page/user_module/tableEdit/staffedit.html").setViewName("page/user_module/tableEdit/staffedit");
				registry.addViewController("/page/user_module/tableEdit/roleadd.html").setViewName("page/user_module/tableEdit/roleadd");
				registry.addViewController("/page/user_module/tableEdit/roleedit.html").setViewName("page/user_module/tableEdit/roleedit");
				registry.addViewController("/page/user_module/tableEdit/departmentadd.html").setViewName("page/user_module/tableEdit/departmentadd");
				registry.addViewController("/page/user_module/tableEdit/departmentedit.html").setViewName("page/user_module/tableEdit/departmentedit");
				registry.addViewController("/page/user_module/tableEdit/permissionadd.html").setViewName("/page/user_module/tableEdit/permissionadd.html");
				registry.addViewController("/page/user_module/tableEdit/permissionedit.html").setViewName("page/user_module/tableEdit/permissionedit");
				registry.addViewController("/page/icon.html").setViewName("page/icon");
				
				registry.addViewController("/page/welcome.html").setViewName("page/welcome");
				
				registry.addViewController("/page/icon.html").setViewName("page/icon");
				
				registry.addViewController("/page/tableEdit/add.html").setViewName("page/tableEdit/add");
				registry.addViewController("/page/tableEdit/edit.html").setViewName("page/tableEdit/edit");
				registry.addViewController("/page/fee/addtadditionalfee.html").setViewName("page/fee/addtadditionalfee");
				registry.addViewController("/page/fee/edittadditionalfee.html").setViewName("page/fee/edittadditionalfee");
				registry.addViewController("/page/fee/addTMedicalfee.html").setViewName("page/fee/addTMedicalfee");
				registry.addViewController("/page/fee/editTMedicalFee.html").setViewName("page/fee/editTMedicalFee");
				registry.addViewController("/page/fee/addTRegistrationfee.html").setViewName("page/fee/addTRegistrationfee");
				registry.addViewController("/page/fee/editTRegistrationFee.html").setViewName("page/fee/editTRegistrationFee");
				
				//工作台页面
				registry.addViewController("/page/workTable/workTable.html").setViewName("page/workTable/workTable");
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
				
				registry.addViewController("page/retail/order_list.html").setViewName("page/retail/order_list.html");
				registry.addViewController("page/retail/retail.html").setViewName("page/retail/retail.html");
				

			}
		};
	}
}
