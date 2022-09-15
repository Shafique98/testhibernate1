package com.velociter.hibernate.payment;

public class CashPayment extends Payment {
	private String currencyType;

	public CashPayment() {
		// TODO Auto-generated constructor stub
	}

	public CashPayment(String currencyType) {

		this.currencyType = currencyType;
	}

	public final String getCurrencyType() {
		return currencyType;
	}

	public final void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

}
