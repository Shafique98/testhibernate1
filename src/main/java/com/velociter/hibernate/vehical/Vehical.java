package com.velociter.hibernate.vehical;

public class Vehical {
	private long vehicalId;
	private String vehicalType;
	private long chasisNumber;
	private String companyName;
	private String vehicalNumber;
	private String modelType;
	private String color;
	private String fuelType;
	private long numberOfTyres;
	
	public Vehical() {
		// TODO Auto-generated constructor stub
	}

	

	public Vehical(long vehicalId, String vehicalType, long chasisNumber, String companyName, String vehicalNumber,
			String modelType, String color, String fuelType, long numberOfTyres) {
		super();
		this.vehicalId = vehicalId;
		this.vehicalType = vehicalType;
		this.chasisNumber = chasisNumber;
		this.companyName = companyName;
		this.vehicalNumber = vehicalNumber;
		this.modelType = modelType;
		this.color = color;
		this.fuelType = fuelType;
		this.numberOfTyres = numberOfTyres;
	}



	public long getVehicalId() {
		return vehicalId;
	}

	public void setVehicalId(long vehicalId) {
		this.vehicalId = vehicalId;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	public long getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(long chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}



	public long getNumberOfTyres() {
		return numberOfTyres;
	}



	public void setNumberOfTyres(long numberOfTyres) {
		this.numberOfTyres = numberOfTyres;
	}

	
	
}
