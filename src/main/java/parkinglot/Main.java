package parkinglot;

import parkinglot.vehicle.Car;
import parkinglot.vehicle.Motorcycle;
import parkinglot.vehicle.Truck;
import parkinglot.vehicle.Vehicle;

public class Main {

	public static void main(String[] args) {
		ParkingLot parkingLot = ParkingLot.getInstance();
		Vehicle car = new Car("ABCD1234");
		Vehicle truck = new Truck("TRUCK1234");
		Vehicle motorcycle = new Motorcycle("MC12432");
	}
}
