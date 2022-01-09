package com.aswin.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	int questionNo;
	BlockingQueue<Integer> questionQueue;

	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {

		while (true) {
			try {
				synchronized (this) { // 100% Thread safe
					int nextQuestion = questionNo++;
					System.out.println("Got new Question: " + nextQuestion);
					questionQueue.put(nextQuestion);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
