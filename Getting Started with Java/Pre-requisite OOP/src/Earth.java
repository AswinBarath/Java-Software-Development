
public class Earth {

	public static void main(String[] args) {
		
		Human human1 = new Human("John", 42, 75, "Black");
		Human human2 = new Human("Finch", 45, 68, "Brown");
		Human human3 = new Human("Carter", 40, 68, "Blue");
		
		human1.speak();
		human2.speak();
		human3.speak();
	}
}
