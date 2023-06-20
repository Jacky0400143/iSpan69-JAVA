package tw.org.iii.jwapp;

public class JW34 {

	public static void main(String[] args) {
		JW341 obj1; // = new JW341();
	}

}
abstract class JW341 {
	void m1() {System.out.println("JW341:m1()");}
	void m2() {System.out.println("JW341:m2()");}
	abstract void m3();
}
class JW342 extends JW341 {
	void m3() {System.out.println("JW341:m3()");}
}
class JW343 extends JW341 {
	void m3() {System.out.println("JW341:m3()");}
}