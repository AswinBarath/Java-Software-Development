package lec2;

public class Type1StartThread {
	public static void main(String args[]) {
		System.out.println("Starting thread 1");
		Task taskRunner = new Task("Thread-A");
		taskRunner.start();

		System.out.println("Starting thread 2");
		Task taskRunner2 = new Task("Thread-B");
		taskRunner2.start();
	}
}

class Task extends Thread {

	String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 1000; i++) {
			System.out.println("number:" + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
