package com.test.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.UserInfo;
import com.test.dao.UserInfoDao;

public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao{

	@Override
	public int login(UserInfo user) {
		String hql="select count(id) from UserInfo where uname='"+user.getUname()+"' and password='"+user.getPassword()+"'";
		//String hql="from UserInfo";
		int result=  Integer.valueOf(super.getHibernateTemplate().find(hql).get(0).toString());
		return result;
	}

}
