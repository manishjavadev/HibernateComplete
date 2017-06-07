package com.manish.javadev.model;

import java.util.Set;

public class Account {
	private int accno;
	private String atype;
	private double bal;
	private Set<Customer> customers;

	public Account() {
	}

	public Account(String atype, double bal) {
		super();
		this.atype = atype;
		this.bal = bal;
	}
	//Generate Getter and setter

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

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", bal=" + bal
				+ "]";
	}
	
}