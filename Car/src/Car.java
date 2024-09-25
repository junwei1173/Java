public class Car {
	String make;
	String model;
	int year;
	double MPG;
	double milesDriven;
	double fuelCapacity;
	double fuelRemaining;
	
	public Car(String make,String model,int year,double MPG,double milesDriven,double fuelCapacity,double fuelRemaining) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.MPG = MPG;
		this.milesDriven = milesDriven;
		this.fuelCapacity = fuelCapacity;
		this.fuelRemaining = fuelRemaining;
	}
	public void fillTank(double g) {
		double fuelNeeded = fuelCapacity - fuelRemaining;
		if ((fuelRemaining < fuelCapacity) && g <= fuelNeeded) {
			fuelRemaining += g; 
		} else {
			fuelRemaining += fuelNeeded;
		}
	}
	public void drive(double m) {
		milesDriven += m;
		double fuelUsed = m / MPG;
		if (fuelRemaining - fuelUsed <= 0) {
			fuelRemaining = 0;
		} else {
			fuelRemaining -= fuelUsed;
		}
	}
	public String toString() {
		return "Make: "+make+", Model: "+model+", Year: "+year+", MPG: "+MPG+", Miles Driven: "+milesDriven+", Fuel Capacity: "
				+fuelCapacity+", Fuel Remaining: "+Math.round(fuelRemaining * 100.0) / 100.0;
	}
	public String getMake() {
		return make;
	}
	public double getFuelRemaining() {
		return Math.round(fuelRemaining * 100.0) / 100.0;
	}

}
