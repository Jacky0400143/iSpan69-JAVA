package tw.org.iii.jwapp;

public class JW02 {

	public static void main(String[] args) {
		//byte var1 = 127;
		//byte var22 = var1 +1; //型態錯誤，無法轉換int和byte
		//byte var2 = 12;
		//byte var24 = var1 + var2; //+-*/也是int，運算執會先放int內引，因此會報錯
		//byte var25 = (byte)(var1 + var2); //強制轉型，有可能會失去精確度
		byte a = 127;
		//a += 1;
		a ++;
		System.out.println(a);
	}

}
