package tw.org.iii.jwapp;

public class JW99 {

	public static void main(String[] args) {
		for (int k=0; k<2; k++) {	
			for (int j=1; j<=9; j++) {
					for (int i =2; i<=5; i++) {
						int newi = i + k*4;
						int r = newi *j;
						System.out.printf("%d x %d = %d\t", newi, j, r);
				
					}
					System.out.println();
			}
			System.out.println("------");
		}
	}
}
	
//	public static void main(String[] args) {
//		System.out.println("2 x 1 = 2");
//		System.out.println("3 x 1 = 2");
//		System.out.println("4 x 1 = 2");
//		System.out.println("5 x 1 = 2");
//	}
//
//}
