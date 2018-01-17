package com.test.Action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.test.bean.UserInfo;
import com.test.service.UserInfoService;

public class UserInfoAction {
	private UserInfo user;
	
	private UserInfoService userInfoService;
	
	public String login() {
		int result=userInfoService.login(user);
		
		ActionContext ac=ActionContext.getContext();
		Map request=(Map) ac.get("request");
		if (result>0) {
			request.put("mess", "登录成功");
			return "loginSuccess";
		}else {
			request.put("mess", "登录失败");
			return "loginError";
		}
	}

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}
	
	
}
