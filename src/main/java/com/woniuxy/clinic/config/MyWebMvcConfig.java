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
				registry.addViewController("/page/user_module/tableEdit/staffadd.html").setViewName("page/user_module/tableEdit/staffadd");
				registry.addViewController("/page/user_module/tableEdit/staffedit.html").setViewName("page/user_module/tableEdit/staffedit");
				registry.addViewController("/page/user_module/tableEdit/roleadd.html").setViewName("page/user_module/tableEdit/roleadd");
				registry.addViewController("/page/user_module/tableEdit/roleedit.html").setViewName("page/user_module/tableEdit/roleedit");
				registry.addViewController("/page/user_module/tableEdit/departmentadd.html").setViewName("page/user_module/tableEdit/departmentadd");
				registry.addViewController("/page/user_module/tableEdit/departmentedit.html").setViewName("page/user_module/tableEdit/departmentedit");
			}
		};
	}
}
