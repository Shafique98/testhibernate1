package com.velociter.hibernate.atm;

public class ATM {
	private long id;
	private long costAccNum;
	private int costBankBalance;
	private int costAtmPin;
	private String costBankStatement;
	
	public ATM() {
		// TODO Auto-generated constructor stub
	}

	public ATM(long id, long costAccNum, int costBankBalance, int costAtmPin, String costBankStatement) {
		super();
		this.id = id;
		this.costAccNum = costAccNum;
		this.costBankBalance = costBankBalance;
		this.costAtmPin = costAtmPin;
		this.costBankStatement = costBankStatement;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCostAccNum() {
		return costAccNum;
	}

	public void setCostAccNum(long costAccNum) {
		this.costAccNum = costAccNum;
	}

	public int getCostBankBalance() {
		return costBankBalance;
	}

	public void setCostBankBalance(int costBankBalance) {
		this.costBankBalance = costBankBalance;
	}

	public int getCostAtmPin() {
		return costAtmPin;
	}

	public void setCostAtmPin(int costAtmPin) {
		this.costAtmPin = costAtmPin;
	}

	public String getCostBankStatement() {
		return costBankStatement;
	}

	public void setCostBankStatement(String costBankStatement) {
		this.costBankStatement = costBankStatement;
	}
	
}
