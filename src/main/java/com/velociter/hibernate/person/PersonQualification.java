package com.velociter.hibernate.person;

public class PersonQualification {
	private String collegeStudied;
	private String qualification;
	
	public PersonQualification() {}
	
	public PersonQualification(String collegeStudied, String qualification) {
		super();
		this.collegeStudied = collegeStudied;
		this.qualification = qualification;
	}

	public String getCollegeStudied() {
		return collegeStudied;
	}
	public void setCollegeStudied(String collegeStudied) {
		this.collegeStudied = collegeStudied;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
}
