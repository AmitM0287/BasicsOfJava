package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class S_03_MulTwoNums {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MulNums mulnums = new MulNums();
	}
}

@SuppressWarnings("serial")
class MulNums extends JFrame{
	private JTextField t1, t2;
	private JLabel l1;
	private JButton b1;
	
	public MulNums() {
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		l1 = new JLabel("<---Output--->");
		
		b1 = new JButton("Multiplication");
		
		add(t1);
		add(t2);
		add(l1);
		add(b1);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1, num2, res;
				
				num1 = Integer.parseInt(t1.getText());
				num2 = Integer.parseInt(t2.getText());
				
				res = num1 * num2;
				
				l1.setText(res + "");
			}
		});
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
