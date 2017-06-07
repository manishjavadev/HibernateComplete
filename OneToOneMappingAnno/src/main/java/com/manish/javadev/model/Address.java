package com.manish.javadev.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADID")
	private int adid;
	@Column(name = "STREET")
	private String street;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADIDdd")
	private Student student;

	public Address() {
		super();
	}

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	// Generate Getter and setter

	public int getAdid() {
		return adid;
	}

	public void setAdid(int adid) {
		this.adid = adid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [adid=" + adid + ", street=" + street + ", city="
				+ city + ", state=" + state + "]";
	}

}