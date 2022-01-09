
public class Animal {

	String name;
	int age;
	String sound;
	public Animal(String name, int age, String sound) {
		super();
		this.name = name;
		this.age = age;
		this.sound = sound;
	}
	public void sound() {
		System.out.println(sound);
		System.out.println("I'm "+ name);
		System.out.println("I'm "+ age +" years old");
		System.out.println(sound);
	}
}
