package tw.org.iii.jwapp;

public class JW07 {

	public static void main(String[] args) {
		
		double temp = Math.random(); // 產生亂數成績
		int score = (int)(temp*101); // 101為常數，為產生出101個亂數數字
		System.out.println(score);
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
				System.out.println("B");
		}else if (score >= 70) {
				System.out.println("C");
		}else if (score >= 60) {
				System.out.println("D");
		}else {
				System.out.println("E");
		}
		
		
		System.out.println("Game Over");
	}
}
//		int score = 70; //手動輸入分數
		
//		if (score >= 60) {				//顯示是否及格
//			System.out.println("Pass");
//		}else {
//			System.out.println("Fail");
//		}
//		System.out.println("Game Over");
//		double temp = Math.random();
//		int score = (int)(temp*49) + 1; // 產生0~48，"+1" 為位移，可產生 1~49
//		System.out.println(score);

