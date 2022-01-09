package lec3;

public class SequenceThreadSafe2 {
	private int value = 0;

	public synchronized int getNext() { // This method is now Thread Safe!
		value++;
		return value;
	}
}
