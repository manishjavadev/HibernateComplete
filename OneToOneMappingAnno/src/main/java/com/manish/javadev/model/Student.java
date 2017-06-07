package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SID")
	private int sid;
	@Column(name = "SNAME")
	private String sname;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE")
	private String phone;
	@OneToOne
	@JoinColumn(name = "ADIDsed")
	private Address address;

	public Student() {

	}

	public Student(String sname, String email, String phone) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	// Generate getter and setter

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}