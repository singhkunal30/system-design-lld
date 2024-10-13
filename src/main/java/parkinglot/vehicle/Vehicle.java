package parkinglot.vehicle;

import parkinglot.utils.ParkingTicket;

public abstract class Vehicle {

	private String registrationNumber;

	public Vehicle(String registrationNumber) {
		this.setRegistrationNumber(registrationNumber);
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public abstract void assignTicket(ParkingTicket ticket);
}
