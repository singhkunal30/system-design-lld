package parkinglot.utils;

public class Entrance {

	private int id;

	public ParkingTicket getTicket() {
		return new ParkingTicket();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
