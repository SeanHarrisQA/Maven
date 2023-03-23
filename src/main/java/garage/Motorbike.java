package garage;

public class Motorbike extends Vehicle {

	public Motorbike(int id, int riders, String make, String model) {
		super(id, riders, make, model);
	}

	public Motorbike() {
		super();
	}

	public void popAWheely() {
		System.out.println("Woooo");
	}

//	@Override
//	public boolean equals(Motorbike vehicle) {
//		if (this.id == vehicle.id && this.make == vehicle.make && this.model == vehicle.model
//				&& this.riders == vehicle.riders) {
//			return true;
//		} else
//			return false;
//	}
}
