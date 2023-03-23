package garage;

public class Car extends Vehicle {

	private boolean hasBoot = false;

	public Car(int id, int riders, String make, String model, boolean hasBoot) {
		super(id, riders, make, model);
		setHasBoot(hasBoot);
	}

	public Car() {
		super();
	}

	public boolean doesHaveBoot() {
		return hasBoot;
	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

}