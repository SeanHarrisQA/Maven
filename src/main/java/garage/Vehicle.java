package garage;

public class Vehicle {

	protected int id = 0;

	protected int riders = 0;

	protected String make = null;

	protected String model = null;

	public Vehicle() {

	}

	public Vehicle(int id, int riders, String make, String model) {
		setID(id);
		setRiders(riders);
		setMake(make);
		setModel(model);
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getRiders() {
		return riders;
	}

	public void setRiders(int riders) {
		this.riders = riders;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void printInfo() {
		System.out.printf("Vehicle #%d: A %s %s can carry %d people%n", this.id, this.make, this.model, this.riders);
	}

	public boolean equals(Vehicle vehicle) {
		if (this.id == vehicle.id && this.make == vehicle.make && this.model == vehicle.model
				&& this.riders == vehicle.riders) {
			return true;
		} else
			return false;
	}

}
