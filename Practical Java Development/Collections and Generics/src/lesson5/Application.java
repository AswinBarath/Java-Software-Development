package lesson5;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// Unordered
//		HashMap<String, String> dictionary = new HashMap<String, String>();

		// Ordered
//		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();

		// Natural order -> Alphabetical, Numerical
		TreeMap<String, String> dictionary = new TreeMap<String, String>();

		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness");
		dictionary.put("Confidence",
				"the feeling or belief that one can have faith in or rely on someone or something");

		// Iterating through keys
//		for(String word: dictionary.keySet()) {
//			System.out.println(word);
//			System.out.println(dictionary.get(word));
//		}

		// Iterating through values
//		for(String word: dictionary.values()) {
//		System.out.println(word);
//	}
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
