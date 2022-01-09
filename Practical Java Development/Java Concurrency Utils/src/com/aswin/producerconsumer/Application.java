package com.aswin.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<>(5);
		Thread t1 = new Thread(new Producer(questionQueue));
		Thread t2 = new Thread(new Consumer(questionQueue));
		
		t1.start();
		t2.start();

	}

}
