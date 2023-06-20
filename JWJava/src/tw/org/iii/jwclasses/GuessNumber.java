package tw.org.iii.jwclasses;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public GuessNumber() {
		super("猜數字");
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GuessNumber();
	}

}