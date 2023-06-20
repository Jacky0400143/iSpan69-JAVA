package tw.org.iii.jwclasses;

import java.awt.BorderLayout;
//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	
	public GuessNumber() {
		super("猜數字");
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top =  new JPanel(new BorderLayout());
		add(top, BorderLayout.NORTH);
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(log, BorderLayout.CENTER);
		
//		guess = new JButton("猜"); b1 = new JButton("B1"); b2 = new JButton("B2");
//		input = new JTextField();
//		log = new JTextArea();
//		
//		
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
//		add(guess); add(b1); add(b2);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGame();
	}
	private void initGame() {
		answer = createAnswer();
	}
	public static void main(String[] args) {
		new GuessNumber();
	}

}