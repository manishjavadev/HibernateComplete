package com.manish.javadev.model;

public class Customer {
	private int cid;
	private String fname;
	private String lname;
	private int age;
	private int version;
	public Customer() {	}
	public Customer(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	//Generate getter and setter
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
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}