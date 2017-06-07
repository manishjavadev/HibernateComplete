package com.manish.javadev.model;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "accno", column = @Column(name = "ACCNO")),
			@AttributeOverride(name = "atype", column = @Column(name = "ATYPE")),
			@AttributeOverride(name = "bcode", column = @Column(name = "BCODE")) })
	private AccountId accountId;
	@Column(name = "FNAME")
	private String fname;
	@Column(name = "LNAME")
	private String lname;
	@Column(name = "AGE")
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