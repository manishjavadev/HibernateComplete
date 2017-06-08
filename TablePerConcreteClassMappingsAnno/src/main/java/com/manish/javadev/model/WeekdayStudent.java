package com.manish.javadev.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "WEEKDAY_STUDENT")
@AttributeOverrides({
		@AttributeOverride(name = "sname", column = @Column(name = "sname")),
		@AttributeOverride(name = "city", column = @Column(name = "city"))

})
public class WeekdayStudent extends Student {
	private String qualification;
	private String percentage;
	private String timings;
	private String branch;

	public WeekdayStudent() {
		super();
	}

	public WeekdayStudent(String sname, String city, String timings,
			String branch, String qualification, String percentage) {
		super(sname, city);
		this.qualification = qualification;
		this.percentage = percentage;
		this.timings = timings;
		this.branch = branch;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
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
