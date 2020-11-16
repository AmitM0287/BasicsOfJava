package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class S_05_BasicCalculator {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Calculator cal = new Calculator();
	}
}

@SuppressWarnings("serial")
class Calculator extends JFrame{
	private JTextField t1, t2;
	private JButton b1, b2, b3, b4;
	private JLabel l1;
	private int num1, num2;
	
	public Calculator() {
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		
		l1 = new JLabel("<---Output--->");
		
		b1 = new JButton("ADD");
		b2 = new JButton("SUB");
		b3 = new JButton("MUL");
		b4 = new JButton("DIV");
		
		add(t1);
		add(t2);
		
		add(l1);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		b1.addActionListener(ae -> {
			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			
			int res = num1 + num2;
			l1.setText(res + "");
		});
		b2.addActionListener(ae -> {
			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			
			int res = num1 - num2;
			l1.setText(res + "");
		});
		b3.addActionListener(ae -> {
			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			
			int res = num1 * num2;
			l1.setText(res + "");
		});
		b4.addActionListener(ae -> {
			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			
			double res = (double) num1/num2;
			l1.setText(res + "");
		});
				
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}