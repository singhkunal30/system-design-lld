package parkinglot.utils;

import java.sql.Timestamp;

import parkinglot.payment.Payment;
import parkinglot.vehicle.Vehicle;

public class ParkingTicket {

	private int ticketNo;
	private Timestamp time;
	private Timestamp exitTime;
	private double amount;
	private boolean status;

	private Vehicle vehicle;
	private Payment payment;
	private Entrance entrance;
	private Exit exitIns;
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Timestamp getExitTime() {
		return exitTime;
	}
	public void setExitTime(Timestamp exitTime) {
		this.exitTime = exitTime;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Entrance getEntrance() {
		return entrance;
	}
	public void setEntrance(Entrance entrance) {
		this.entrance = entrance;
	}
	public Exit getExitIns() {
		return exitIns;
	}
	public void setExitIns(Exit exitIns) {
		this.exitIns = exitIns;
	}
	
}
