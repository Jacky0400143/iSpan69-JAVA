package tw.org.iii.jwapp;

import tw.org.iii.jwclasses.Bike;

public class JW21 {

	public static void main(String[] args) {
		Bike b1 = new Bike("Jack");
		System.out.println(b1.getSpeed()); 
		
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1.getSpeed());
		
//		b1.downSpeed();
//		System.out.println(b1.speed);
		
		
		

	}

}

//b1.speed = 100;
//System.out.println(b1.speed);
