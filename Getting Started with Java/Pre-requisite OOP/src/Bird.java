
public class Bird {

	String color;
	int wings;
	int tail;
	String action;
	public Bird(String color, int wings, int tail) {
		super();
		this.color = color;
		this.wings = wings;
		this.tail = tail;
		this.action = "Flying";
	}
	public void fly() {
		System.out.println(action+"...");
		System.out.println("I'm "+ color+" in color");
		System.out.println("I'm having "+ wings +" wings");
		System.out.println("I'm having "+ tail +" tail");
		System.out.println(action);
		System.out.println("Who am I?");
	}
}
