package tw.org.iii.jwclasses;

public class TWID {
	private String id;
	
	public TWID(String id) {
		this.id = id;
	}
	
	public static boolean isRightId(String id) {
		boolean isRight = false;
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println("isRightId(String id)");
		if (id.length() == 10) {
			if (letters.indexOf(id.charAt(0)) >= 0) {
				if (id.charAt(0))
		}
		
		return true;
		}
	
	}
}
