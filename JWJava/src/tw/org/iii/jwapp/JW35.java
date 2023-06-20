package tw.org.iii.jwapp;

public class JW35 {

	public static void main(String[] args) {
		Shape s1 = new RecShape(10 ,4);
		Shape s2 = new CircleShape(3);
		System.out.println(s1.calArea());
		System.out.println(s2.calArea());
		sumArea(s1, s2);
	}
	void
}
abstract class Shape {
	abstract double calArea();
	abstract double calLength();
}
class RecShape extends Shape {
	double w, h;
	RecShape(double w,)
}