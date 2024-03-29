package tw.org.iii.jwclasses;

public class Bike {
	
	protected double speed;
	public String owner;
	
	// 建構式/子/方法
//	public Bike() {
//		System.out.println("Bike()");
//	}
	public Bike(String name) {
		System.out.println("Bike(String)");
		owner = name;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.5;
	}
	
	public double getSpeed() {
		return speed;
	}
	
}
//public class Bike {
////	public double speed;  //避免讓使用者取得速度的直接控制權
//	public double speed;
//	
//	public void upSpeed() {
//		speed = speed < 1 ? 1 : speed * 1.2;
//	}
//	
//	public void downSpeed() {
//		speed = speed < 1 ? 0 : speed * 0.5;
//	}
//	
//	public double getSpeed() {
//		return speed;
//	}
//		
//}