package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("there");
		words.add("10");
		
		String item1 = (String) words.get(0);
		String item2 = (String) words.get(1);
		
		System.out.println(item1 + item2);
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		for(int number : numbers) {
			System.out.println(number);
		}
	}

}
