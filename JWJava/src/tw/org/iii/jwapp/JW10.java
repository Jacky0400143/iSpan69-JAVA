package tw.org.iii.jwapp;

public class JW10 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		if ( ++a <= 10 & --b >= 3) {
			System.out.printf("OK: a = %d, b = %d", a, b);
		}else {
			System.out.printf("XX: a = %d, b = %d", a, b);
		}
		System.out.println();
		System.out.println(3 & 2);
		System.out.println(3 | 2);
	}

}
