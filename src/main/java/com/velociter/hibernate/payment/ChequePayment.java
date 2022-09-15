package com.velociter.hibernate.payment;

public class ChequePayment extends Payment {
	private long chequeNumber;

	public ChequePayment() {
		// TODO Auto-generated constructor stub
	}

	public ChequePayment(long chequeNumber) {

		this.chequeNumber = chequeNumber;
	}

	public final long getChequeNumber() {
		return chequeNumber;
	}

	public final void setChequeNumber(long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

}
