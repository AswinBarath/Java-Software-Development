package com.aswin.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> questionList = new ArrayList<>();
		
		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Consumer(questionList));
		
		t1.start();
		t2.start();
	}

}
