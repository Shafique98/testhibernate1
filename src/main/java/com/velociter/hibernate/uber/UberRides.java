package com.velociter.hibernate.uber;

public class UberRides {
	private long rideID;
	private float rideFare;
	private double rideDistance;
	private String rideStartTime;
	private String rideEndTime;
	private String riderName;
	private String captainName;
	private String vehicalType;
	private String pickUpLocation;
	private String dropOffLocation;
	private String paymentMethod;

	public UberRides() {
	}

	public UberRides(long rideID, float rideFare, double rideDistance, String rideStartTime, String rideEndTime,
			String riderName, String captainName, String vehicalType, String pickUpLocation, String dropOffLocation,
			String paymentMethod) {
		this.rideID = rideID;
		this.rideFare = rideFare;
		this.rideDistance = rideDistance;
		this.rideStartTime = rideStartTime;
		this.rideEndTime = rideEndTime;
		this.riderName = riderName;
		this.captainName = captainName;
		this.vehicalType = vehicalType;
		this.pickUpLocation = pickUpLocation;
		this.dropOffLocation = dropOffLocation;
		this.paymentMethod = paymentMethod;
	}

	public long getRideID() {
		return rideID;
	}

	public void setRideID(long rideID) {
		this.rideID = rideID;
	}

	public float getRideFare() {
		return rideFare;
	}

	public void setRideFare(float rideFare) {
		this.rideFare = rideFare;
	}

	public double getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(double rideDistance) {
		this.rideDistance = rideDistance;
	}

	public String getRideStartTime() {
		return rideStartTime;
	}

	public void setRideStartTime(String rideStartTime) {
		this.rideStartTime = rideStartTime;
	}

	public String getRideEndTime() {
		return rideEndTime;
	}

	public void setRideEndTime(String rideEndTime) {
		this.rideEndTime = rideEndTime;
	}

	public String getRiderName() {
		return riderName;
	}

	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
