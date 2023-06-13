package tw.org.iii.jwapp;

import java.util.Scanner;

public class JW03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X = ");
		int x = scanner.nextInt();
		System.out.print("Y = ");
		int y = scanner.nextInt();
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;
		//System.out.println(x + " + " + y + " = " + r);
		System.out.printf("%d + %d = %d\n", x, y ,r1);
		System.out.printf("%d - %d = %d\n", x, y ,r2);
		System.out.printf("%d * %d = %d\n", x, y ,r3);
		//System.out.printf("%d / %d = %d\n", x, y ,r4);
		System.out.printf("%d / %d = %d ... %d\n", x, y , r4, r5);
	}

}
