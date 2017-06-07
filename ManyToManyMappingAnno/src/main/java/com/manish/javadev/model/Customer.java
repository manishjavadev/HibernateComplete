package com.manish.javadev.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private int cid;
	
	@Column(name = "CNAME")
	private String cname;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "PHONE")
	private Long phone;
	
	@ManyToMany
	@JoinTable(name = "cust_acc", joinColumns = @JoinColumn(name = "CID", referencedColumnName = "CID"),
		inverseJoinColumns = @JoinColumn(name = "ACCNO", referencedColumnName = "ACCNO"))
	private Set<Account> accounts;

	public Customer() {
	}

	public Customer(String cname, String email, Date dob, Long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	//Generate getter and setter

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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
	
}