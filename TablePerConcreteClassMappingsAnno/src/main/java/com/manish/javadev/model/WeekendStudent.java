package com.manish.javadev.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "WEEKEND_STUDENT")
@AttributeOverrides({
		@AttributeOverride(name = "sname", column = @Column(name = "sname")),
		@AttributeOverride(name = "city", column = @Column(name = "city")) })
public class WeekendStudent extends Student {
	private String company;
	private String email;
	private String timings;
	private String branch;

	public WeekendStudent() {
		super();
	}

	public WeekendStudent(String sname, String city, String timings,
			String branch, String company, String email) {
		super(sname, city);
		this.company = company;
		this.email = email;
		this.timings = timings;
		this.branch = branch;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
