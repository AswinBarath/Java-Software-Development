package lec2;

public class Type3StartThread {
	public static void main(String args[]) {
		System.out.println("Starting thread 1");
		Thread t1 = new Thread(new Runnable() { // Anonymous class

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("number:" + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}});
		t1.start();

		System.out.println("Starting thread 2");
		Thread t2 = new Thread(new Runnable() { // Anonymous class

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("number:" + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}});
		t2.start();
	}
}