package com.manish.javadev.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCNO")
	private int accno;
	
	@Column(name = "ATYPE")
	private String atype;
	
	@Column(name = "BAL")
	private double bal;
	
	@ManyToMany(mappedBy="accounts")
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
	
}