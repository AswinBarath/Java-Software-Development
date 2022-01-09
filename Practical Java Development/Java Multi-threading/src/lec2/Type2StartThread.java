package lec2;

public class Type2StartThread {
	public static void main(String args[]) {
		System.out.println("Starting thread 1");
		Thread t1 = new Thread(new Task("Thread-A"));
		t1.start();

		System.out.println("Starting thread 2");
		Thread t2 = new Thread(new Task("Thread-A"));
		t2.start();
	}
}