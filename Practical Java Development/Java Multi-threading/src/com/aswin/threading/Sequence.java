package com.aswin.threading;

public class Sequence {

	private int value = 0;

	public synchronized int getNext() { // This method is now Thread Safe!
			value++;
			return value;
	}
}
