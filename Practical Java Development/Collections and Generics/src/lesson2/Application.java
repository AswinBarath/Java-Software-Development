package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cheetah");
		animals.add("Elephant");

////		Traditional for loop
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//
////		For Each Loop
//		for (String value : animals) {
//			System.out.println(value);
//		}

		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyoto", "Etios", 15000, true);
		vehicles.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Honda", "accord", 12000, false));

//		for (Vehicle automobile : vehicles) {
//			System.out.println(automobile);
//			System.out.println("Make: " + automobile.getMake());
//			System.out.println("Model: " + automobile.getModel());
//			System.out.println("Price: " + automobile.getPrice());
//			System.out.println("fourWDrive: " + automobile.isFourWDrive());
//		}
		
		printElements(vehicles);
		printElements(animals);

//		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
//		List<Vehicle> vehicles = new ArrayList<Vehicle>();
//		List<Vehicle> vehicles = new LinkedList<Vehicle>();

	}

	@SuppressWarnings("rawtypes")
	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
