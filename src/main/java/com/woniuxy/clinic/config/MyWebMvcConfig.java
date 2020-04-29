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
				registry.addViewController("/fpassword").setViewName("fpassword");
				registry.addViewController("/index.html").setViewName("index");
				registry.addViewController("/tAadditionalFeelist.html").setViewName("tAadditionalFeelist");
				registry.addViewController("/login.html").setViewName("login");
				registry.addViewController("/page/welcome.html").setViewName("page/welcome");
				registry.addViewController("/page/departmenttable.html").setViewName("page/departmenttable.html");
				registry.addViewController("/page/icon.html").setViewName("page/icon");
				registry.addViewController("/page/user-password.html").setViewName("page/user-password");
				registry.addViewController("/page/user-setting.html").setViewName("page/user-setting");
				registry.addViewController("/page/stafftable.html").setViewName("page/stafftable.html");
				registry.addViewController("/page/roletable.html").setViewName("page/roletable.html");
				registry.addViewController("/page/tableEdit/staffadd.html").setViewName("page/tableEdit/staffadd");
				registry.addViewController("/page/tableEdit/staffedit.html").setViewName("page/tableEdit/staffedit");
				registry.addViewController("/page/tableEdit/roleadd.html").setViewName("page/tableEdit/roleadd");
				registry.addViewController("/page/tableEdit/roleedit.html").setViewName("page/tableEdit/roleedit");
				registry.addViewController("/page/tableEdit/departmentadd.html").setViewName("page/tableEdit/departmentadd");
				registry.addViewController("/page/tableEdit/departmentedit.html").setViewName("page/tableEdit/departmentedit");
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
