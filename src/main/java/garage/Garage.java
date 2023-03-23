package garage;

import java.util.ArrayList;
import java.util.List;

import xceptions.VehicleNotFoundException;

public class Garage {

	public List<Vehicle> garage = new ArrayList<>();

	public Vehicle find(String make, String model) {
		for (Vehicle vehicle : this.garage) {
			if (vehicle.getMake().equals(make)) {
				if (vehicle.getModel().equals(model)) {
					return vehicle;
				}
			}
		}
		return null;
	}

	public Vehicle findByID(int id) throws VehicleNotFoundException {
		for (Vehicle vehicle : this.garage) {
			if (vehicle.getID() == id) {
				return vehicle;
			}
		}
		throw new VehicleNotFoundException("No vehicle with id: " + id);
	}

	public void showOff() {
		for (Vehicle vehicle : this.garage) {
			vehicle.printInfo();
		}
	}

	public void runningCosts() {
		double bill = 0;
		for (Vehicle vehicle : this.garage) {
			if (vehicle instanceof Car) {
				bill = 5000 / vehicle.getRiders();
				System.out.printf("This car costs %.2f to run%n", bill);
			} else if (vehicle instanceof Motorbike) {
				bill = 1000 / (0.75 * vehicle.getRiders());
				System.out.printf("This motorbike costs %.2f to run%n", bill);
			} else if (vehicle instanceof Boat) {
				bill = 15000 * vehicle.getRiders() * 0.4;
				System.out.printf("This boat costs %.2f to run%n", bill);

			}
		}
	}

	public void addVehicle(Vehicle newVehicle) {
		this.garage.add(newVehicle);
		newVehicle.setID(this.garage.size());
	}

	// What is the best parameter to pass in this instance? String makes more sense
	// but more problematic
	// Using basic for loop as modifying the arrayList
	public void removeThisType(Vehicle vehicleToRemove) {
		String vehicleClass = vehicleToRemove.getClass().toString();
		List<Vehicle> clone = new ArrayList<>(this.garage);
		for (int i = 0; i < this.garage.size(); i++) {
			Vehicle v = clone.get(i);
			if (vehicleClass.equals(v.getClass().toString())) {
				this.garage.remove(v);
			}
		}

		// Clone the list within the for-each statement then remove from the main list
		// using reference, so you can iterate through the list making sure not to skip
		// elements as you would when iterating through a list you are currently working
		// on
		for (Vehicle v : new ArrayList<>(this.garage)) {
			if (vehicleClass.equals(v.getClass().toString())) {
				this.garage.remove(v);
			}
		}
	}

	public void removeById(int id) {
		for (int i = 0; i < this.garage.size(); i++) {
			if (this.garage.get(i).getID() == id) {
				this.garage.remove(i);
			}
		}

	}

	// Clear the entire garage
	public void emptyGarage() {
		this.garage.clear();
	}
}