package parkinglot.payment;

import java.sql.Timestamp;

import parkinglot.constants.PaymentStatus;

public abstract class Payment {
	
	private double amount;
	private PaymentStatus status;
	private Timestamp time;
	
	public abstract void initiateTransaction();

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
