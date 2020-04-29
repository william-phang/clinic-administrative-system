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
			}
		};
	}
}
