package garage;

public class Boat extends Vehicle {

	public Boat(int id, int riders, String make, String model) {
		super(id, riders, make, model);
	}

	public Boat() {
		super();
	}

	public void sendSOS() {
		System.out.println("Mayday mayday");
	}

}