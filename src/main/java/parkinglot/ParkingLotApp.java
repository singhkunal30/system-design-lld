package parkinglot;

public class ParkingLotApp {

	public static void main(String[] args) {
		ParkingLot parkingLot = ParkingLot.getInstance();
		
		parkingLot.addLevel(new Level(1, 10));
		parkingLot.addLevel(new Level(2, 10));
		
		Vehicle car = new Car("ABCD1234");
		Vehicle truck = new Truck("TRUCK1234");
		Vehicle motorcycle = new Motorcycle("MC12432");
		
		parkingLot.parkVehicle(car);
		parkingLot.parkVehicle(truck);
		parkingLot.parkVehicle(motorcycle);
		
		parkingLot.displayAvailability();
		System.out.println();
		parkingLot.unparkVehicle(motorcycle);
		
		Vehicle truck2 = new Truck("TRUCK2144");
		parkingLot.parkVehicle(truck2);
		
		parkingLot.displayAvailability();
	}
}
