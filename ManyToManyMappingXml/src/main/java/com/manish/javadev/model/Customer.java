package com.manish.javadev.model;

import java.util.Date;
import java.util.Set;

public class Customer {
	int cid;
	private String cname;
	private String email;
	private Date dateOfBirth;
	private Long phone;
	private Set<Account> accounts;

	public Customer() {

	}

	public Customer(String cname, String email, Date dateOfBirth, Long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
	}

	// Generate getter and setter

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + "]";
	}

}