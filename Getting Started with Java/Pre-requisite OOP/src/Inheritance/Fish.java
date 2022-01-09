package Inheritance;

public class Fish extends Animal{

	public Fish(String name, int age, String sound) {
		super(name, age, sound);
	}

	public void swim() {
		System.out.println("Swimming...");
	}

	public void move() {
		System.out.println("Fish is swimming...");
	}
}
