package com.woniuxy.clinic.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woniuxy.clinic.realm.UserRealm;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;

@Configuration
public class ShiroConfig {
	//首先配置 自定义域
    @Bean
    public UserRealm userRealm(MemoryConstrainedCacheManager cacheManager){
    	UserRealm userRealm = new UserRealm();

        userRealm.setCacheManager(cacheManager);
        return userRealm;
    }
  //其次配置 安全管理器 注入。。。。
    @Bean
    public DefaultWebSecurityManager securityManager(UserRealm userRealm,CookieRememberMeManager rememberMeManager){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        securityManager.setRememberMeManager(rememberMeManager);
        return securityManager;
    }

    //第三配置shiro过滤器工厂
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();
        filterFactoryBean.setSecurityManager(securityManager);

        Map<String,String> map = new LinkedHashMap<String, String>();
        map.put("/user/login","anon");//管理员登录
        map.put("/layuimini/**", "anon");
        map.put("/img","anon");
        map.put("/**","authc");
 		map.put("/logout", "logout");// 退出系统的过滤器
        filterFactoryBean.setLoginUrl("/login.html");
        filterFactoryBean.setFilterChainDefinitionMap(map);
        return filterFactoryBean;
    }


    //配置缓存管理器
    @Bean
    public MemoryConstrainedCacheManager cacheManager(){
        return new MemoryConstrainedCacheManager();
    }

    //thymeleaf整合shiro；支持 shiro标签
    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }

    //记住我管理器其一
    @Bean
    public CookieRememberMeManager rememberMeManager(SimpleCookie cookie){
        CookieRememberMeManager rememberMeManager = new CookieRememberMeManager();
        rememberMeManager.setCookie(cookie);
        return rememberMeManager;
    }

    //记住我管理器其二
    @Bean
    public SimpleCookie simpleCookie(){
        SimpleCookie cookie = new SimpleCookie();
        cookie.setName("rememberMe");
        cookie.setMaxAge(1800);
        return cookie;
    }

}
