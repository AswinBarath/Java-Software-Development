
public class App {

	public static void main(String[] args) {

		// Classic object invocation
		Human tom = new Human();
		tom.walk();

		Robot wale = new Robot();
		wale.walk();

		// Anonymous class
		walker(new Walkable() {

			@Override
			public void walk() {
				System.out.println("Custom object walking... ");
			}
		});

		// Lambda expression
		walker(() -> System.out.println("Custom object walking... "));

		/*
		 * The argument we pass to the walker method is treated as an implementation of
		 * Walkable interface
		 */

		// Lambda expression with multiple lines of code
		walker(() -> {
			System.out.println("Custom object walking... ");
			System.out.println("Custom object walking again... ");
		});

		// Lambda expression assigned to a variable
		Walkable aBlockOfCode = () -> {
			System.out.println("Custom object walking... ");
			System.out.println("Custom object walking again... ");
		};
		walker(aBlockOfCode);

		/*
		 * Lambda Expressions practice
		 */

		// 1
		ALambdaInterface helloVar = () -> System.out.println("Hello everyone");
		helloVar.someMethod();

		// 2
		Calculate sum2 = (arg1, arg2) -> arg1 + arg2;
		System.out.println(sum2.compute(2, 3));

		// 3
		Calculate nonZeroDivideVar = (a, b) -> {
			if (a == 0 || b == 0)
				return 0;
			return a / b;
		};
		System.out.println(nonZeroDivideVar.compute(30, 10));

		// 4
		Stringify myStr = (s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result = result + s.charAt(i);
			}
			return result;
		};
		System.out.println(myStr.manipulate("Aswin Barath"));

		// 5
		Calculate2 factorialVar = (num) -> {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			return fact;
		};

		System.out.println(factorialVar.apply(5));

		// 4 with generic
		MyGenericInterface<String> myStr2 = (s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result = result + s.charAt(i);
			}
			return result;
		};
		System.out.println(myStr2.work("Aswin Barath"));

		// 5 with generic
		MyGenericInterface<Integer> factorialVar1 = (num) -> {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			return fact;
		};

		System.out.println(factorialVar1.work(5));
	}

	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

	/*
	 * Lambda Expressions practice
	 */

	// 1
	public void sayHello() {
		System.out.println("Hello everyone");
	}

	// 2
	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	// 3
	public int nonZeroDivide(int arg1, int arg2) {
		if (arg1 == 0 || arg2 == 0) {
			return 0;
		}
		return arg1 / arg2;
	}

	// 4
	public String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	// 5
	public int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
