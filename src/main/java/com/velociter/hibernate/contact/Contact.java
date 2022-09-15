package com.velociter.hibernate.contact;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT")
public class Contact {
	@Column(name = "FIRST_NAME")
	private String firtName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAILID")
	private String email;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public Contact() {}

	public Contact(String firtName, String lastName, String email, String mobileNumber, long id) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.id = id;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
