package tw.org.iii.jwapp;

import tw.org.iii.jwclasses.Scooter;

public class JW27 {

	public static void main(String[] args) {
		Object obj = new Object();
		String s1 = new String("Jack");
		String s2 = new String("Jack");
		System.out.println(obj);
		System.out.println(s1);

		Scooter s3 = new Scooter();
		System.out.println(s3);
		System.out.println("------");
		System.out.println(s1 == s2);
	}

}
