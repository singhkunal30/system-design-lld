package com.practice.system_design_lld.parkinglot;

public class ParkingSpot {
	
	private int spotNumber;
	private VehicleType vehicleType;
	private Vehicle parkedVehicle;
	
	public ParkingSpot(int spotNumber) {
		this.spotNumber = spotNumber;
		this.vehicleType = VehicleType.CAR; //Keeping Car as default value for parking spot
	}
	
	public synchronized boolean isAvailable() {
		return parkedVehicle == null;
	}
	
	public synchronized void parkVehicle(Vehicle vehicle) {
		if(isAvailable() && vehicleType == vehicle.type) {
			parkedVehicle = vehicle;
		}
		else if(isAvailable() && vehicleType != vehicle.type) {
			vehicleType = vehicle.type;
			parkedVehicle = vehicle;
		}
		else throw new IllegalArgumentException("Vehicle not allowed or spot already occupied");
	}
	
	public synchronized void unparkVehicle() {
		parkedVehicle = null;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}	
	
}
