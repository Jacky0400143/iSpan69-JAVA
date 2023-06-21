package tw.org.iii.jwapp;

public class JW40 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		b1.setLeg(2);
	}
}

class Bird {
	int leg;
	void setLeg(int n) throws Exception {
		if (n >= 0 && n <= 2) {
			leg = n;
		}else {
			throw new Exception();
		}
	}
}