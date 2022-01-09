package lec3;

public class Application {

	public static void main(String args[]) {

		SequenceThreadSafe sequence = new SequenceThreadSafe();
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.start();
	}
}

class Worker extends Thread {
	SequenceThreadSafe sequence = null;

	public Worker(SequenceThreadSafe sequence) {
		this.sequence = sequence;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " got value: " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}