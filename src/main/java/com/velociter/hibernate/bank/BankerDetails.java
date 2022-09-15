package com.velociter.hibernate.bank;

public class BankerDetails {
	
	private long bankerID;
	private String bankerName;
	private String bankerContact;
	private String bankerOccupation;
	private String bankerAddress;
	private int bankerAccountNumber;
	private String bankerAccountType;
	private float bankerAccountBalance;
	private int bankerAtmNumber;
	private String bankerBranchName;
	private String bankerBranchIfscCode;
	private String bankerBranchAddress;
	private String bankerBranchContactNumber;
	
	public BankerDetails() {}

	public BankerDetails(long bankerID, String bankerName, String bankerContact, String bankerOccupation,
			String bankerAddress, int bankerAccountNumber, String bankerAccountType, float bankerAccountBalance,
			int bankerAtmNumber, String bankerBranchName, String bankerBranchIfscCode, String bankerBranchAddress,
			String bankerBranchContactNumber) {
		
		this.bankerID = bankerID;
		this.bankerName = bankerName;
		this.bankerContact = bankerContact;
		this.bankerOccupation = bankerOccupation;
		this.bankerAddress = bankerAddress;
		this.bankerAccountNumber = bankerAccountNumber;
		this.bankerAccountType = bankerAccountType;
		this.bankerAccountBalance = bankerAccountBalance;
		this.bankerAtmNumber = bankerAtmNumber;
		this.bankerBranchName = bankerBranchName;
		this.bankerBranchIfscCode = bankerBranchIfscCode;
		this.bankerBranchAddress = bankerBranchAddress;
		this.bankerBranchContactNumber = bankerBranchContactNumber;
	}

	public long getBankerID() {
		return bankerID;
	}

	public void setBankerID(long bankerID) {
		this.bankerID = bankerID;
	}

	public String getBankerName() {
		return bankerName;
	}

	public void setBankerName(String bankerName) {
		this.bankerName = bankerName;
	}

	public String getBankerContact() {
		return bankerContact;
	}

	public void setBankerContact(String bankerContact) {
		this.bankerContact = bankerContact;
	}

	public String getBankerOccupation() {
		return bankerOccupation;
	}

	public void setBankerOccupation(String bankerOccupation) {
		this.bankerOccupation = bankerOccupation;
	}

	public String getBankerAddress() {
		return bankerAddress;
	}

	public void setBankerAddress(String bankerAddress) {
		this.bankerAddress = bankerAddress;
	}

	public int getBankerAccountNumber() {
		return bankerAccountNumber;
	}

	public void setBankerAccountNumber(int bankerAccountNumber) {
		this.bankerAccountNumber = bankerAccountNumber;
	}

	public String getBankerAccountType() {
		return bankerAccountType;
	}

	public void setBankerAccountType(String bankerAccountType) {
		this.bankerAccountType = bankerAccountType;
	}

	public float getBankerAccountBalance() {
		return bankerAccountBalance;
	}

	public void setBankerAccountBalance(float bankerAccountBalance) {
		this.bankerAccountBalance = bankerAccountBalance;
	}

	public int getBankerAtmNumber() {
		return bankerAtmNumber;
	}

	public void setBankerAtmNumber(int bankerAtmNumber) {
		this.bankerAtmNumber = bankerAtmNumber;
	}

	public String getBankerBranchName() {
		return bankerBranchName;
	}

	public void setBankerBranchName(String bankerBranchName) {
		this.bankerBranchName = bankerBranchName;
	}

	public String getBankerBranchIfscCode() {
		return bankerBranchIfscCode;
	}

	public void setBankerBranchIfscCode(String bankerBranchIfscCode) {
		this.bankerBranchIfscCode = bankerBranchIfscCode;
	}

	public String getBankerBranchAddress() {
		return bankerBranchAddress;
	}

	public void setBankerBranchAddress(String bankerBranchAddress) {
		this.bankerBranchAddress = bankerBranchAddress;
	}

	public String getBankerBranchContactNumber() {
		return bankerBranchContactNumber;
	}

	public void setBankerBranchContactNumber(String bankerBranchContactNumber) {
		this.bankerBranchContactNumber = bankerBranchContactNumber;
	}

	
	
}
