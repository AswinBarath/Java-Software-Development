package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		int values[] = new int[100];
		values[0] = 1000;
		values[99] = 93432;
		System.out.println(values[99]);
		
		double []valuesd = new double[100];
		valuesd[0] = 360.00;
		System.out.println(valuesd[0]);
		
		
		String [] words = new String[] {"My", "Name", "is"};
		System.out.println(words[2]);
		
	}

}