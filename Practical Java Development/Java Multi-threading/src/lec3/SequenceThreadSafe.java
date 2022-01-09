package lec3;

public class SequenceThreadSafe {

	private int value = 0;

	public int getNext() { // This method is now Thread Safe!
		synchronized (this) {
			value++;
			return value;
		}
	}
}
