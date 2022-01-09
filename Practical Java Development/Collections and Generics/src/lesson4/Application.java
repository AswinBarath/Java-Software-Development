package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		// User defined type sorting
		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("Aswin", 100000, "IT"));
		employees.add(new Employee("Sriram", 200000, "Sports"));
		employees.add(new Employee("Ramesh", 80000, "Mechanical"));
		employees.add(new Employee("Suresh", 1000000, "Civil"));

		ArrayList<Employee> empList = new ArrayList<Employee>(employees);

		Collections.sort(empList); // Gives an error based on class implementation

		System.out.println("Employee sorting " + empList);
		
		HashSet<String> words = new HashSet<String>();
		words.add("Random");
		words.add("Piece");
		words.add("of advice");
		words.add("Not the stuff u expected");

		ArrayList<String> myWords = new ArrayList<String>(words);

		Collections.sort(myWords);

		System.out.println("String sorting " + myWords);

		// Convert HashSet to List
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		hashSet.add(10);

		List<Integer> myList = new ArrayList<Integer>(hashSet);

		Collections.sort(myList);

		System.out.println("Integer Sorting " + myList);

		// Collections Methods

//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		list1.add(12);
//		list1.add(43);
//		list1.add(15);
//		list1.add(67);
//		list1.add(43);
//		list1.add(10);
//		list1.add(10);
//		list1.add(10);
//		list1.add(10);
//
//		ArrayList<Integer> newList = new ArrayList<Integer>();
//		newList.add(10);
//		newList.add(67);
//		newList.add(15);

		// Merge the data
//		list1.addAll(newList);

		// Remove the date
//		list1.removeAll(newList); 

		// clear
//		list1.clear();

//		System.out.println(list1);

		// To check existing value
//		boolean hasValue = list1.contains(67); 
//		boolean hasValue = list1.contains(48); 

		// To check emptiness
//		list1.clear();
//		boolean hasValue = list1.isEmpty(); 
//
//		System.out.println(hasValue);

		// To delete all except retain newList
//		list1.retainAll(newList);
//		System.out.println(list1);

	}

}
