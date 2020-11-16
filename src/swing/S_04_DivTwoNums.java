package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class S_04_DivTwoNums {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		DivNums divnums = new DivNums();
	}
}

@SuppressWarnings("serial")
class DivNums extends JFrame{
	private JTextField t1, t2;
	private JLabel l1;
	private JButton b1;
	
	public DivNums() {
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		l1 = new JLabel("<---Output--->");
		
		b1 = new JButton("Division");
		
		add(t1);
		add(t2);
		add(l1);
		add(b1);

//		Lambda Expression...		
		b1.addActionListener(ae -> {
			int num1, num2;
			double res;
			
			num1 = Integer.parseInt(t1.getText());
			num2 = Integer.parseInt(t2.getText());
			
			res = (double) num1/num2;
			
			l1.setText(res + "");
		});
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
