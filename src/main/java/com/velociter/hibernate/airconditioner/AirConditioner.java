package com.velociter.hibernate.airconditioner ;

public class AirConditioner {
	private long id;
	private String AcName;
	private String AcCapacity;
	private int AcEnergyStars;
	private String AcColor;
	private String warranty;
	private String specialFeature;
	private float maxTemp;
	private float minTemp;
	private float currTemp;

	public AirConditioner() {}
	
	public AirConditioner(long id, String acName, String acCapacity, int acEnergyStars, String acColor, String warranty,
			String specialFeature, float maxTemp, float minTemp, float currTemp) {
		super();
		this.id = id;
		AcName = acName;
		AcCapacity = acCapacity;
		AcEnergyStars = acEnergyStars;
		AcColor = acColor;
		this.warranty = warranty;
		this.specialFeature = specialFeature;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.currTemp = currTemp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAcName() {
		return AcName;
	}
	public void setAcName(String acName) {
		AcName = acName;
	}
	public String getAcCapacity() {
		return AcCapacity;
	}
	public void setAcCapacity(String acCapacity) {
		AcCapacity = acCapacity;
	}
	public int getAcEnergyStars() {
		return AcEnergyStars;
	}
	public void setAcEnergyStars(int acEnergyStars) {
		AcEnergyStars = acEnergyStars;
	}
	public String getAcColor() {
		return AcColor;
	}
	public void setAcColor(String acColor) {
		AcColor = acColor;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getSpecialFeature() {
		return specialFeature;
	}
	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}
	public float getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(float maxTemp) {
		this.maxTemp = maxTemp;
	}
	public float getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(float minTemp) {
		this.minTemp = minTemp;
	}
	public float getCurrTemp() {
		return currTemp;
	}
	public void setCurrTemp(float currTemp) {
		this.currTemp = currTemp;
	}
	
	
}
