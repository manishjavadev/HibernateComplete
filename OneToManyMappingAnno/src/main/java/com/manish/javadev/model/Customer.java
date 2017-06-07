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
	
	@Column(name = "PHONE")
	private Long phone;
	
	@OneToMany(mappedBy = "customer")
	private Set<Order> orders;

	public Customer() {

	}

	public Customer(String cname, String email, Long phone) {
		super();
		this.cname = cname;
		this.email = email;		
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Set<Order> getOrders() {
		if (orders == null) {
			orders = new HashSet<Order>();
		}
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
}