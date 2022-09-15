package com.velociter.hibernate.person;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Person {
	private java.util.Date birthdate;
	private Name name;
	private PersonQualification pq;
	private Set email = new HashSet();
	private int id;

	public Person() {
	}

	public Person(Date birthdate, Name name, PersonQualification pq) {
		super();
		this.birthdate = birthdate;
		this.name = name;
		this.pq = pq;
	}

	public java.util.Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate = birthdate;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PersonQualification getPq() {
		return pq;
	}

	public void setPq(PersonQualification pq) {
		this.pq = pq;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
