package com.test.bean;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer stuNo;
	private String password;
	private String stuName;
	private String sex;
	private Integer age;
	private String address;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String password, String stuName, String sex, Integer age) {
		this.password = password;
		this.stuName = stuName;
		this.sex = sex;
		this.age = age;
	}

	/** full constructor */
	public Student(String password, String stuName, String sex, Integer age, String address) {
		this.password = password;
		this.stuName = stuName;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}

	// Property accessors

	public Integer getStuNo() {
		return this.stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}