package java_basics;

public class MyUtils {

	public static String printSomeJunkStuff(String arguement) {
		return "Bla Bla BLa " + arguement;
	}
	public static int printSomeJunkStuff(int arguement) {
		System.out.println("Integer passed:" + arguement);
		return arguement;
	}
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg+secondArg);
	}
	public int add20(int someArguement) {
		int result = someArguement + 20;
		return result;
	}
}
