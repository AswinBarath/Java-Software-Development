package lec8;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		/*
		** Polymorphism 
		*/
		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		

		/*
		** Polymorphism 
		*/
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		

		/*
		** X - Polymorphism is Not Applicable in Generics - X
		*/
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
		// employees = accountants; // error
		
		
		ArrayList<?> employees2 = new ArrayList<>(); // Similar to raw type
		ArrayList<String> accountants2 = new ArrayList<>();
		employees2 = accountants2; // Wildcards
		

		// Upper bound (Hierarchy) - All sub classes of Employee is allowed because of the extends syntax
		ArrayList<? extends Employee> employees3 = new ArrayList<>(); 
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		// ArrayList<Object> accountants3 = new ArrayList<>(); // not allowed because of upper bound -- error
		employees3 = accountants3;
		

		// Lower bound (Hierarchy) - All parent classes of Employee is allowed because of the super syntax
		ArrayList<? super Employee> employees4 = new ArrayList<>(); 
		ArrayList<Object> accountants4 = new ArrayList<>();
		employees4 = accountants4; // Wildcards
		
		delegateEmployeeWork(employees);
		delegateEmployeeWork(accountants);
		
	}
	
	public static void delegateEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp: employees) {
			emp.work();
		}
		// Avoid type casting - due to unpredictable input types
		for(Accountant emp: (ArrayList<Accountant>) employees) {
			emp.work();
		}
	}

}
