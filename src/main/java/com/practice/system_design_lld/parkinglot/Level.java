package com.practice.system_design_lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Level {
	
	private int floor;
	private List<ParkingSpot> parkingSpots;
	
	public Level(int floor, int numberOfSpots) {
		super();
		this.floor = floor;
		this.parkingSpots = new ArrayList<ParkingSpot>(numberOfSpots);
		for(int i=0; i<numberOfSpots; i++) {
			this.parkingSpots.add(new ParkingSpot(i+1));
		}
	}
	
	public synchronized boolean parkVehicle(Vehicle vehicle) {
		for(ParkingSpot spot: parkingSpots) {
			if(spot.isAvailable() && spot.getVehicleType() == vehicle.type) {
				spot.parkVehicle(vehicle);
				return true;
			}
			else if(spot.isAvailable() && spot.getVehicleType() != vehicle.type) {
				spot.parkVehicle(vehicle);
				return true;
			}
		}
		return false;
	}
	
	public synchronized boolean unparkVehicle(Vehicle vehicle) {
		for(ParkingSpot spot: parkingSpots) {
			if(!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)) {
				spot.unparkVehicle();
				return true;
			}
		}
		return false;
	}
	
	public void displayAvailability() {
		System.out.println();
		System.out.println("Level " + floor +" Availability");
		for(ParkingSpot spot: parkingSpots) {
			System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable()?"Available":"Occupied"));
		}
	}
	
}
