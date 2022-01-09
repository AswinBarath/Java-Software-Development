package Inheritance;

public class Zoo {

	public static void main(String[] args) {
		
		Flyable flyingBird = new Sparrow("Penny", 3, "tweet");
		flyingBird.fly();
//		Flyable flyingBird = new Bird("Penny", 3, "tweet");
		
//		Chicken chick1 = new Chicken("Dom", 5, "cock cock");
//		chick1.fly();
		
//		Animal leapord = new Animal("Richard Parker", 3, "Roars");
//		leapord.sound();
//		leapord.eat();
//		leapord.sleep();
//		
//		Bird bird1 = new Bird("John", 3, "tweets");
//		bird1.sound();
//		bird1.eat();
//		bird1.sleep();
//		bird1.fly();
		
//		Animal sparrow1 = new Sparrow("Penny", 3, "tweet");
////		sparrow1.move();
//		Animal fish1 = new Fish("Nemo", 3, "burr");
////		fish1.move();
//		
//		moveAnimal(fish1);
//		moveAnimal(sparrow1);
	}
	
//	Polymorphism
	public static void moveAnimal(Animal animal) {
			animal.move();
	}		
}

