package com.aswin.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2); // Recycle threads

		Runnable processor1 = new MessageProcessor(2);
		executor.execute(processor1);

		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);

		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);

		Runnable processor4 = new MessageProcessor(5);
		executor.execute(processor4);

		executor.shutdown(); // Rejects any new tasks from being submitted. Gracefully shuts down the service

//		executor.shutdownNow(); // Terminate  the executor service immediately.. Not recommended

		try {
			executor.awaitTermination(2, TimeUnit.SECONDS); // waits 2 seconds to move on to the next line of code
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		while (!executor.isTerminated()) { // Checks if the executor service is terminated
//
//		}

		System.out.println("Submitted all tasks...");
	}

}
