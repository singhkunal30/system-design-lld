package parkinglot;

import java.util.HashMap;

import parkinglot.model.Address;
import parkinglot.parkingspots.ParkingSpot;
import parkinglot.utils.Entrance;
import parkinglot.utils.Exit;
import parkinglot.utils.ParkingRate;
import parkinglot.utils.ParkingTicket;
import parkinglot.vehicle.Vehicle;

public class ParkingLot {
	private int id;
	private String name;
	private Address address;
	private ParkingRate parkingRate;

	private HashMap<String, Entrance> entrance;
	private HashMap<String, Exit> exit;

	// Create a hashmap that identifies all currently generated tickets using their
	// ticket number
	private HashMap<String, ParkingTicket> tickets;

	// The ParkingLot is a singleton class that ensures it will have only one active
	// instance at a time
	// Both the Entrance and Exit classes use this class to create and close parking
	// tickets
	private static ParkingLot parkingLot = null;

	// Created a private constructor to add a restriction (due to Singleton)
	private ParkingLot() {
		// Call the name, address and parking_rate
		// Create initial entrance and exit hashmaps respectively
	}

	// Created a static method to access the singleton instance of ParkingLot
	public static ParkingLot getInstance() {
		if (parkingLot == null) {
			parkingLot = new ParkingLot();
		}
		return parkingLot;
	}

	public boolean addEntrance(Entrance entrance) {
		return false;
	}

	public boolean addExit(Exit exit) {
		return false;
	}

	// This function allows parking tickets to be available at multiple entrances
	public ParkingTicket getParkingTicket(Vehicle vehicle) {
		return new ParkingTicket();
	}

	public boolean isFull(ParkingSpot type) {
		return false;
	}
}