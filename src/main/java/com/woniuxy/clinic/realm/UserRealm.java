package com.woniuxy.clinic.realm;


import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.mapper.TRoleMapper;
import com.woniuxy.clinic.mapper.TUserMapper;


public class UserRealm extends AuthorizingRealm{
	@Autowired
	private TUserMapper userMapper;

	@Autowired
	private TRoleMapper roleMapper;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("111111111");
		//获取登录认证成功的主体
String primaryPrincipal = (String) principals.getPrimaryPrincipal();
        
        TUser user = userMapper.selectByuser_account(primaryPrincipal);
        //根据角色Id查询权限
        List<String> perms = roleMapper.findPermsByRoles(user.getUserRoleId());
        
        System.out.println(perms);
       
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        
        info.addStringPermissions(perms);
        return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//返回认证信息
		System.out.println(token.hashCode());
		//获取token中的输入账号信息
		String username =(String) token.getPrincipal();
		String password=new String((char[])token.getCredentials());
		//看账号是否存在
		
		TUser userbyaccount = userMapper.selectByuser_account(username);
	if(userbyaccount!=null){
		
		if(userbyaccount.getUserPassword().equals(password)) {
			System.out.println("成功");
			return new SimpleAuthenticationInfo(username,password,getName());
		}else {
			throw new IncorrectCredentialsException();
		}	
	}else {
		throw new UnknownAccountException();

	}
	}
}
