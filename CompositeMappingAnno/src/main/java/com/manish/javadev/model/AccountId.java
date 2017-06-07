package com.manish.javadev.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountId implements Serializable {

	private static final long serialVersionUID = 1L;
	private int accno;
	private String atype;
	private int bcode;

	public AccountId() {
	}

	public AccountId(int accno, String atype, int bcode) {
		this.accno = accno;
		this.atype = atype;
		this.bcode = bcode;
	}

	// Generate getter and setter

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public int getBcode() {
		return bcode;
	}

	public void setBcode(int bcode) {
		this.bcode = bcode;
	}

}