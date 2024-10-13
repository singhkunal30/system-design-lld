package parkinglot.utils;

public class ParkingRate {

	private double hours;
	private double rate;

	public void calculate() {
		rate = 5 * hours;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
