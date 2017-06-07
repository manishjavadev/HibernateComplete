package com.manish.javadev.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate = true)
@Table(name = "Customer")
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

	@Column(name = "LAST_MODIFIED_DATE",
	insertable = false,	updatable = false,
	columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@org.hibernate.annotations.Generated
		(org.hibernate.annotations.GenerationTime.ALWAYS)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModified;

	public Customer() {

	}

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

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
	
}