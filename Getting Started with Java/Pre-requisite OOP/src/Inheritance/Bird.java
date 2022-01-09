package Inheritance;

public class Bird extends Animal{

	
	public Bird(String name, int age, String sound) {
		super(name, age, sound);
	}

	public void move() {
		System.out.println("Flapping wings...");
	}

}
