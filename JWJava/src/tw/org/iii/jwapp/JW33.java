package tw.org.iii.jwapp;

public class JW33 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.m1(); car1.m2();
		Car car2 = new Ferrari();
		car2.m1(); car2.m2();
		Ferrari car3 = (Ferrari)car2;
		car3.m3();
		System.out.println(car2 == car3);
		Audi car4 = new Audi();
		Car car5 = car4;
		car5.m1();
		//Ferrari car6 = (Ferrari)car5;
		
		System.out.println("------");
		doJob(car1);
		doJob(car2);
		doJob(car3);
		System.out.println("------");
		if (car4.instanceof )
		
		
	}
	static void doJob(Car car) {
		car.m1();
	}
}

class Car {
	void m1() {
		System.out.println("m1()");
	}
	void m2() {
		System.out.println("m2()");
	}
}

class Ferrari extends Car {
	void m1() {
		System.out.println("Ferrari:m1()");
	}
	void m3() {
		System.out.println("Ferrari:m3()");
	}
}
class Audi extends Car {
	void m1() {
		System.out.println("Audi:m1()");
	}
	void m3() {
		System.out.println("Audi:m3()");
	}
}