package tw.org.iii.jwapp;
import tw.org.iii.jwclasses.TWID;
public class JW30 {

	public static void main(String[] args) {

		TWID id1 = new TWID();
		TWID id2 = new TWID(false);
		TWID id3 = new TWID(5);	// F
		TWID id4 = new TWID(true, 1); // B
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
	}
	
}