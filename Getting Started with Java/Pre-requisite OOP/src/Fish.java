
public class Fish {

	String name;
	int age;
	int teeth;
	String action;
	public Fish(String name, int age, int teeth) {
		super();
		this.name = name;
		this.age = age;
		this.teeth = teeth;
		this.action = "Swimming";
	}
	public void swim() {
		System.out.println(action);
		System.out.println("I'm "+ name);
		System.out.println("I'm "+ age +" years old");
		System.out.println("I'm having "+ teeth +" teeths");
		System.out.println(action);
	}
}
