package com.velociter.hibernate.person;

public class Name {
	private char initial;
	private String first;
	private String last;
	private String namedPerson;
	

	public String getNamedPerson() {
		return namedPerson;
	}

	public void setNamedPerson(String namedPerson) {
		this.namedPerson = namedPerson;
	}

	public Name() {}

	public Name(char initial, String first, String last) {
		this.initial = initial;
		this.first = first;
		this.last = last;
	}

	public char getInitial() {
		return initial;
	}

	public void setInitial(char initial) {
		this.initial = initial;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
}
