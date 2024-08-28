package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	
	//Singleton Pattern for parkinglot
	private static ParkingLot instance;
	private final List<Level> levels;
	
	private ParkingLot() {
		this.levels = new ArrayList<Level>();
	}
	
	public static synchronized ParkingLot getInstance() {
		if(instance == null)instance = new ParkingLot();
		return instance;
	}
	
	public void addLevel(Level level) {
		levels.add(level);
	}
	
	public boolean parkVehicle(Vehicle vehicle) {
		for(Level level: levels) {
			if(level.parkVehicle(vehicle)) return true;
		}
		return false;
	}
	
	public boolean unparkVehicle(Vehicle vehicle) {
		for(Level level: levels) {
			if(level.unparkVehicle(vehicle)) return true;
		}
		return false;
	}
	
	public void displayAvailability() {
		for(Level level: levels) {
			level.displayAvailability();
		}
	}

}
