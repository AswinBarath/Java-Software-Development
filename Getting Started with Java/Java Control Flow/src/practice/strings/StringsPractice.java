package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
		// System.out.println("Hello, world!");
		
		// 1) str.length()
		String a = "ABCDEFG";
		System.out.println(a);
		System.out.println(a.length());
		
		// 2) str.substring(start, end)
		String extractedString = a.substring(1,5);
		System.out.println(extractedString);
		
		// 3) str.equals("string")
		String start = "hello";
		String end = "there";
		//if(start == "hello") {
		//THIS IS A TRAP. DON'T DO THIS.
		//}
		if(start.equals("hello") || end.equals("there")) {
			System.out.println("Hello there");
		}
		
		// 4) str.equalsIgnoreCase("string")
		if(end.equalsIgnoreCase("There")) {
			System.out.println("Found the word there!");
		}
		
		// 5) str.charAt(index)
		System.out.println(a.charAt(3));
		
		// 6) str.indexOf("string")
		String word	= "Hello there, Aswin ! Hello";
		System.out.println(word.indexOf("Hello"));
		System.out.println(word.indexOf("Hello", 15));
		
		// 7) str.lastIndexOf("string")
		System.out.println(word.lastIndexOf("Hello"));
	}

}
