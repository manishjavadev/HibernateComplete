package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private int cid;
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

	// Generate Getter and Setter

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

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname
				+ ", age=" + age + "]";
	}
	
}