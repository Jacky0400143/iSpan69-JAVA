package tw.org.iii.jwapp;

public class JW11 {

	public static void main(String[] args) {
		int a = 10;
		switch (a) {
			case 1:
				System.out.println("A");
				break;
			case 10:
				System.out.println("B");
//				break;	//break拿掉 如果case在之前驗證，那沒有break就會連同下一個break之前結果同時輸出
			default:
				System.out.println("X");
				break;
			case 100:
				System.out.println("C");
				break;
		}
		System.out.println("Game Clear");
	}

}
