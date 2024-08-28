package parkinglot;

public abstract class Vehicle {
	
	protected String registrationNumber;
	
	protected VehicleType type;
	
	public Vehicle(String registrationNumber, VehicleType type) {
		this.registrationNumber = registrationNumber;
		this.type = type;
	}
	
	public VehicleType getType() {
		return type;
	}

}
