package tw.org.iii.jwapp;

public class JW09 {

	public static void main(String[] args) {
		int year = 2023;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 366
				}else {
					//365
				}
			}else {
				//365
			}
		}else {
			//365
		}
	}

}
