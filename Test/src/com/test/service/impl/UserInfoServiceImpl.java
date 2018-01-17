package com.test.service.impl;

import com.test.bean.UserInfo;
import com.test.dao.UserInfoDao;
import com.test.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService{
	private UserInfoDao userInfoDao;

	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public int login(UserInfo user) {
		// TODO Auto-generated method stub
		return userInfoDao.login(user);
	}
	
	
}
