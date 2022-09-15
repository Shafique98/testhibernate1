package com.velociter.hibernate.payment;

public class Payment {
	private long paymentID;
	private float amount;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(long paymentID) {
		super();
		this.paymentID = paymentID;
	}

	public final long getPaymentID() {
		return paymentID;
	}

	public final void setPaymentID(long paymentID) {
		this.paymentID = paymentID;
	}

	public final float getAmount() {
		return amount;
	}

	public final void setAmount(float amount) {
		this.amount = amount;
	}



	
}
