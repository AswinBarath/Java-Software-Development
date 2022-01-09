package lec3;

public class SequenceNotThreadSafe {

	private int value = 0;

	public int getNext() { // This method is not Thread Safe!
		value++;
		return value;
	}
}
