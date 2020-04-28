package com.woniuxy.clinic.service;

import java.util.List;

import com.woniuxy.clinic.entity.TStaff;
import com.woniuxy.clinic.entity.TUser;
import com.woniuxy.clinic.exception.UserException;

public interface UserService {

	TUser selectUserbyid(int userId);//查询单个用户
	void deleteUserbyid(int user_id);//删除用户
	void addUser(TUser user)throws UserException;//添加用户
	List<TUser> selectallUser(TUser user);//查询所有 用户
	TUser selectUserbyaccount(String userAccount);//根据账号查用户
	TUser login(String username, String password) throws UserException;//用户登录
	int updateByPrimaryKeySelective(TUser user);//修改用户
}
