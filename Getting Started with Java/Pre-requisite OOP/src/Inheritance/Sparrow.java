package Inheritance;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String name, int age, String sound) {
		super(name, age, sound);
	}

	public void fly() {
		System.out.println("Sparrow flying high...");
		
	}

}
