package tw.org.iii.jwapp;

public class JW13 {
	
	public static void main(String[] args) {
		int i = 0;
		for	(printJacky(); i<10 ;printLine()) {
			System.out.println(i++);
		}
		System.out.println("Over:" + i);
		
	}
	static void printJacky() {
		System.out.println("JackyV3");
	}
	static void printLine() {
		System.out.println("------");
	}

}

//	public static void main(String[] args) {
//		for (int i=0; i<10 ; i++) {
//			System.out.println(i);
//		}
//		System.out.println("Over");
//	}
//
//}
