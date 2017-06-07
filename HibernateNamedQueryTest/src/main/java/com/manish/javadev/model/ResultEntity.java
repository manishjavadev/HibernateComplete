package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResultEntity {
	@Id
	@Column(name = "EMP_ID")
	private long id;

	@Column(name = "EMP_NAME")
	private String name;

	@Column(name = "EMP_SALARY")
	private double salary;

	@Column(name = "CITY")
	private String city;

	public ResultEntity() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ResultEntity [id=" + id + ", name=" + name + ", salary="
				+ salary + ", city=" + city + "]";
	}

}
