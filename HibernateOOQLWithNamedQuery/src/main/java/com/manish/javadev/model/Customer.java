package com.manish.javadev.model;

public class Customer {
	private int cid;
	private String fname;
	private String lname;
	private String email;
	private long phone;
	private String status;

	public Customer() {
	}

	public Customer(String fname, String lname, String email, long phone,
			String status) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}

	// Generate Setter and Getter

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname
				+ ", email=" + email + ", phone=" + phone + ", status="
				+ status + "]";
	}

}