package parkinglot.Accounts;

import parkinglot.displayboard.DisplayBoard;
import parkinglot.parkingspots.ParkingSpot;
import parkinglot.utils.Entrance;
import parkinglot.utils.Exit;

public class Admin extends Account {

	public boolean addParkingSpot(ParkingSpot spot) {
		return true;
	}

	public boolean addDisplayBoard(DisplayBoard displayBoard) {
		return true;
	}

	public boolean addEntrance(Entrance entrance) {
		return true;
	}

	public boolean addExit(Exit exit) {
		return true;
	}

	@Override
	public boolean resetPassword() {
		// TODO Auto-generated method stub
		return false;
	}
}
