package com.manish.javadev.model;

public class Customer {
	private int cid;
	private String fname;
	private String lname;
	private int age;
	private String city;

	public Customer() {
		super();
	}

	public Customer(String fname, String lname, int age, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.city = city;
	}

	// Generate getter and setter
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname
				+ ", age=" + age + ", city=" + city + "]";
	}

}