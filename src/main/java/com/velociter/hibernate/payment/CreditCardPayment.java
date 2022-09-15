package com.velociter.hibernate.payment;

public class CreditCardPayment extends Payment {
	private String CCType;

	public CreditCardPayment() {
		// TODO Auto-generated constructor stub
	}

	public CreditCardPayment(String cCType) {

		CCType = cCType;
	}

	public final String getCCType() {
		return CCType;
	}

	public final void setCCType(String cCType) {
		CCType = cCType;
	}

}
