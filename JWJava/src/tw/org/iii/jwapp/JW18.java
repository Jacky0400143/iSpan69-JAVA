package tw.org.iii.jwapp;

import java.util.Scanner;

public class JW18 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + ... + n = ?
		System.out.print("n = ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int i = 1, sum = 0;
		while ( i<= 10) {
			sum += i++;
		}
		System.out.printf("1 + 2 + 3 + ... + %d = %d", n, sum);
	}

}
