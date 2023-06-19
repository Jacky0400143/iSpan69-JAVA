package tw.org.iii.jwapp;

import tw.org.iii.jwclasses.TWID;

public class JW28 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(TWID.isRightId("abc"));
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(letters.indexOf('7'));
		
		String id = "Y123456789";
		if (id.matches("[A-Z][12][0-9]{8}")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("------");
		if (TWID.isRightId("")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}
}
