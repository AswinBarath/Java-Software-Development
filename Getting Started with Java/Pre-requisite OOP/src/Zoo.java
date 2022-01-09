
public class Zoo {

	public static void main(String[] args) {

		Animal leapord = new Animal("Richard Parker", 3, "Roars");
		leapord.sound();
		
		Fish shark = new Fish("Nemo", 1, 42);
		shark.swim();
		
		Bird parrot = new Bird("Green", 2, 1);
		parrot.fly();
	}

}
