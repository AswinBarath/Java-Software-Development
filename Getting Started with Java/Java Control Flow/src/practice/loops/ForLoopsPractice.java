package practice.loops;

public class ForLoopsPractice {

	public static void main(String[] args) {
		
//		for(int i=0; i<100; i++) {
//			System.out.println("i: "+ i);
//		}
//
//		String name = "dsgdhfshsdfhsafgbADFBDB";
//		for(int i = 0; i < name.length(); i++) {
//			System.out.println("char: "+ name.charAt(i));
//		}
		
// 		int counter = 0;
//		
//		for(int i=0; i<100; i++) {
//		System.out.println(i);
//		int temp = counter + 1;
//		counter = temp;	
//	}
		
		for(int idx=0; idx<10; idx++) {
			for(int j=0; j<5; j++) {
				for(int i=0; i<2; i++) {
					System.out.println("the value of idx was "+ idx + "-----"+ j +"-----" + i);
				}
			}
		}
	}

}
