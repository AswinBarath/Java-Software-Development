package streams.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) throws IOException {

		System.out.println("1. Integer stream with skip");
		IntStream
			.range(1, 10) 							// Source
			.skip(5)								// Intermediate operation
			.forEach((x) -> System.out.println(x)); // Terminal operation
		System.out.println();

		
		System.out.println("2. Integer stream with sum");
		int val = IntStream
				.range(1, 5)
				.sum();
		System.out.println(val);
		System.out.println();

		
		System.out.println("3. Stream.of, sorted and findFirst");
		Stream.of("Hello", "bottle", "Africa")      	// Source
			.sorted()									// Intermediate operation
			.findFirst()								// Terminal operation
			.ifPresent((x) -> System.out.println(x));	// To prevent null pointer exception
		System.out.println();

		
		System.out.println("4. Stream from Array, sort, filter and print");
		String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
		Stream.of(items)
			.filter((x) -> x.startsWith("t")) // Intermediate operation
			.sorted() // Terminal operation
			.forEach(x -> System.out.println(x + ", "));
		System.out.println();
		
		
		System.out.println("5. Average of squares of an int array");
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map((x) -> x * x) // Intermediate operation
			.average() // Terminal operation
			.ifPresent(n -> System.out.println(n)); // To prevent null pointer exception
		System.out.println();
		
		
		System.out.println("6. Stream from a list, filter and print");
		List<String> listOfItems = Arrays.asList("Car", "Computer", "Toothpaste", "Box", "Pencil", "Tent", "Door", "Toy");
		listOfItems.stream()
			.map(x -> x.toLowerCase())
			.filter(x -> x.startsWith("c"))
			.sorted()
			.forEach(x -> System.out.println(x + ", "));
		System.out.println();
		
		
		System.out.println("7. File streams");
		Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
		lines
			.filter(l -> l.length() > 6)
			.sorted()
			.forEach(x -> System.out.println(x + ", "));
		lines.close(); // To prevent memory leaks we close the stream
		System.out.println();

		
		System.out.println("8. File streams");
		List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
			.filter(l -> l.contains("th"))
			.collect(Collectors.toList());
		words.forEach(x -> System.out.println(x + ", "));
		System.out.println();

		
		System.out.println("9. File streams");
		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		int rowCount = (int) rows
			.map(r -> r.split(","))
			.filter(x -> x.length > 3)
			.count();
		System.out.println(rowCount + " good rows.");
		rows.close(); // To prevent memory leaks we close the stream
		System.out.println();

		
		System.out.println("10. File streams");
		Stream<String> rows2 = Files.lines(Paths.get("files/stockDataCsv.txt"));
		rows2.map(r -> r.split(","))
			.filter(x -> x.length > 3)
			.filter(x -> Integer.parseInt(x[1].trim()) > 15)
			.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
		rows2.close(); // To prevent memory leaks we close the stream
		System.out.println();
		
	}

}
