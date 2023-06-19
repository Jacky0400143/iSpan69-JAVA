package tw.org.iii.jwapp;

import tw.org.iii.jwclasses.Bike;

public class JW26 {

	public static void main(String[] args) {
		Bike b1 = new Bike("Jack");
		Bike b2 = new Bike("Jack");
		Bike b3 = b1;
		int[] a1 = new int [3];
		double[] a2 = new double[3];
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(b1 == b2);
		System.out.println(b1 == b3); //記憶體位址一樣
	}

}
