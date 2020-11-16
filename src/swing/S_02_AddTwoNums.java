package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class S_02_AddTwoNums {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		AddNums addnums = new AddNums();
		
	}
}

@SuppressWarnings("serial")
class AddNums extends JFrame implements ActionListener{
	private JTextField t1, t2;
	private JLabel l1;
	private JButton b1;
	
	public AddNums() {
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		l1 = new JLabel("<---Output--->"+ "");
		b1 = new JButton("Addition");
		
		add(t1);
		add(t2);
		add(l1);
		add(b1);
		
//		Every time you click on the button it will call the method actionPerformed().
		b1.addActionListener(this);

		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
//	Implementing the actionPerformed method.
	public void actionPerformed(ActionEvent ae) {
		int num1, num2;
		
		num1 = Integer.parseInt(t1.getText());
		num2 = Integer.parseInt(t2.getText());
		
		int res = num1 + num2;
		
		l1.setText(res + "");
	}
}
