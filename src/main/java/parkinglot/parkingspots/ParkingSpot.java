package parkinglot.parkingspots;

import parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {

	private int id;
	private boolean isFree;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public abstract boolean assignVehicle(Vehicle vehicle);

}
