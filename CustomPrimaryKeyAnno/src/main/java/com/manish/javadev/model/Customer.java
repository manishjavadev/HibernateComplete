package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GenericGenerator(name = "cust_id", strategy = "com.manish.javadev.model.CIDGenerator")
	@GeneratedValue
	@Column(name="CID")
	private String cid;
	
	@Column(name = "FNAME")
	private String fname;
	
	@Column(name = "LNAME")
	private String lname;
	
	@Column(name = "AGE")
	private int age;

	public Customer() {
	}

	public Customer(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	//Generate Getter and Setter

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
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
	
}