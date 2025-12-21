package com;

public class Driver {

	private String category = "CAR";
	private int driverId = 203333;
	private String driverName = "SAI";
	private double totalDistance = 20000;

	/////////////////// overrides
	Driver() {
		System.out.println("welcome to the Thomas Travels");
	}

	Driver(String category, int driverId, String driverName, double totalDistance) {

		this.category = category;
		this.driverId = driverId;
		this.driverName = driverName;
		this.totalDistance = totalDistance;

	}

	@Override
	public String toString() {
		return "category type " + " " + "CAR" + " " + "driveid " + " " + 112 + " " + "driverName" + " " + "KRISHNA"
			+ " " + "totalDistance " + " " + 120000;

	}

	///////////////// getter and setters

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = "car";
	}

	public int getDriverId() {
		return driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

}
