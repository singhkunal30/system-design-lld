package parkinglot.displayboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import parkinglot.parkingspots.ParkingSpot;

public class DisplayBoard {

	private int id;
	private Map<String, List<ParkingSpot>> parkingSpots;

	private void addParkingSpot(String spotType, List<ParkingSpot> spots) {
		parkingSpots.putIfAbsent(spotType, new ArrayList<ParkingSpot>());
		parkingSpots.get(spotType).addAll(spots);
	}

	private void showFreeSpots() {
		for (Entry<String, List<ParkingSpot>> entry : parkingSpots.entrySet()) {
			entry.getValue().stream().filter(ParkingSpot::isFree).forEach(System.out::println);
			System.out.println();
		}
	}
}
