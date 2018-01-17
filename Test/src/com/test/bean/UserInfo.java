package com.test.bean;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String uname;
	private String password;
	private String sex;

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(String uname, String password, String sex) {
		this.uname = uname;
		this.password = password;
		this.sex = sex;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}