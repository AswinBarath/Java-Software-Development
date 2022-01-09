package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {

		String str = "We have a large inventory	of things in our warehouse falling in "
		+ "the category:apperal and the slightly "
		+ "more in demand category:makeup along with category:furniture and ....";
		
		printCategories(str);
	}
	
	/**
	 * 
	 * extract all categories from the string argument
	 * @param str
	 */
	public static void printCategories(String str) {
		int i = 0;
		while(true) {
			int found = str.indexOf("category:", i);
			if(found == -1) break;
			int start = found + 9; // start of actual category
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end + 1;
		}
		
		// print all categories -- My Solution
//		int status = 0;
//		int index = str.indexOf(":", status);
//		status = index + 1;
//		while(status != 0) {
//			int start = status;
//			int end = str.indexOf(" ", start);
//			
//			String result = str.substring(start, end);
//			System.out.println(result);
//			
//			index = end + 1;
//			status = (str.indexOf(":", index)) + 1;
//		}
	}

}
