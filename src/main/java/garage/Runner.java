package garage;

import java.util.InputMismatchException;
import java.util.Scanner;

import xceptions.VehicleNotFoundException;

public class Runner {

	public static Garage garage = new Garage();

	private Scanner scan = new Scanner(System.in);

	public Runner() {
		Car c1 = new Car(4, 5, "Seat", "Ibiza", true);
		Car c2 = new Car(4, 5, "Citroen", "Picasso", true);
		Motorbike m2 = new Motorbike(2, 2, "Harley Davidson", "Picasso");
		Motorbike m3 = new Motorbike(1, 2, "Piaggio", "Vespa");
		Boat b1 = new Boat(0, 22, "Warship", "HMS Victory");
		garage.addVehicle(m2);
		garage.addVehicle(c2);
		garage.addVehicle(m3);
		garage.addVehicle(b1);
		garage.addVehicle(c1);
	}

//	public static void main(String[] args) {
//		Car c1 = new Car(4, 5, "Seat", "Ibiza", true);
//		Car c2 = new Car(4, 5, "Citroen", "Picasso", true);
//		Motorbike m2 = new Motorbike(2, 2, "Harley Davidson", "Picasso");
//		Motorbike m3 = new Motorbike(1, 2, "Piaggio", "Vespa");
//		// Garage garage = new Garage();
//		Boat b1 = new Boat(0, 22, "Warship", "HMS Victory");
//
//		System.out.println("Add vehicles using addVehicle() in garage-------");
//		garage.addVehicle(m2);
//		garage.addVehicle(c2);
//		garage.addVehicle(m3);
//		garage.addVehicle(b1);
//		garage.addVehicle(c1);
//		garage.showOff();
//
//		System.out.println("Test running costs-------");
//		garage.runningCosts();
//
//		System.out.println("Add vehicles using addVehicle() in garage-------");
//		garage.addVehicle(m2);
//		garage.addVehicle(c2);
//		garage.addVehicle(m3);
//		garage.addVehicle(b1);
//		garage.showOff();
//
//		System.out.println("Remove vehicles by type-------");
//		garage.removeThisType(m2);
//		garage.showOff();
//
//		System.out.println("Add vehicles using addVehicle() in garage-------");
//		garage.addVehicle(m2);
//		garage.addVehicle(c2);
//		garage.addVehicle(m3);
//		garage.addVehicle(b1);
//		garage.showOff();
//
//		System.out.println("Remove vehicles by id (2)-------");
//		garage.removeById(2);
//		garage.showOff();
//
//		System.out.println("Add vehicles using addVehicle() in garage-------");
//		garage.addVehicle(m2);
//		garage.addVehicle(c2);
//		garage.addVehicle(m3);
//		garage.addVehicle(b1);
//		garage.showOff();
//
//		System.out.println("Remove all-------");
//		garage.emptyGarage();
//		garage.showOff();

//		System.out.println("Please enter your vehicle id: ");
//		Integer id = null;
//		try (Scanner scan = new Scanner(System.in);) {
////			id = scan.nextInt();
//			Vehicle newV = garage.findByID(id);
//			System.out.println("Found vehicle with id: " + newV.getID());
//		} catch (VehicleNotFoundException vnfe) {
//			System.out.println("No vehicle with ID: " + id);
//			// vnfe.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		Scanner scan = new Scanner(System.in);
//		try {
//			Integer id = null;
//			Vehicle newV = null;
//			do {
//				System.out.println("Please enter your vehicle id (Enter 0 to stop): ");
//				id = scan.nextInt();
//				try {
//					newV = garage.findByID(id);
//					System.out.println("Found vehicle with id: " + newV.getID());
//				} catch (VehicleNotFoundException vnfe) {
//					if (id != 0)
//						System.out.println("No vehicle with ID: " + id);
//					else
//						System.out.println("Search complete");
//				} catch (InputMismatchException e) {
//					System.out.println("help");
//					e.printStackTrace();
//				}
//			} while (id != 0);
//		} finally {
//			scan.close();
//		}
//		System.out.println("EOF");
//	}

	public Vehicle testScanWithMockito() {
		try {
			Integer id = null;
			Vehicle newV = null;
			do {
				System.out.println("Please enter your vehicle id (Enter 0 to stop): ");
				id = scan.nextInt();
				try {
					newV = garage.findByID(id);
					return newV;
					// System.out.println("Found vehicle with id: " + newV.getID());
				} catch (VehicleNotFoundException vnfe) {
					if (id != 0)
						System.out.println("No vehicle with ID: " + id);
					else
						System.out.println("Search complete");
				} catch (InputMismatchException e) {
					System.out.println("help");
					e.printStackTrace();
				}
			} while (id != 0);
		} finally {
			scan.close();
		}
		System.out.println("EOF");
		return null;
	}
}
