package com.manish.javadev.model;

public class Customer {
	private AccountId accountId;
	private String fname;
	private String lname;
	private int age;

	public Customer() {
	}

	public Customer(String fname, String lname, int age, AccountId accountId) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.accountId = accountId;
		}
	// Generate getter and setter

	public AccountId getAccountId() {
		return accountId;
	}

	public void setAccountId(AccountId accountId) {
		this.accountId = accountId;
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
	
}