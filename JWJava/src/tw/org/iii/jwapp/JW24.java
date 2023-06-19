package tw.org.iii.jwapp;

import javax.swing.JFrame;

public class JW24 extends JFrame{
	public JW24() {
		super("My Windows"); //視窗標題
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JW24(); //呼叫才需要宣告
	}

}
