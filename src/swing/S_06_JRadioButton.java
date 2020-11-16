package swing;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class S_06_JRadioButton {

	public static void main(String[] args) {
		new Person();
	}
	
}

@SuppressWarnings("serial")
class Person extends JFrame{
	private JTextField t1;
	private JLabel l1;
	private JButton b1;
	private JRadioButton r1, r2;
	
	public Person() {
		t1 = new JTextField(10);
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		b1 = new JButton("OK");
		l1 = new JLabel("Greeting");
		
		add(t1);
		add(r1);
		add(r2);
		add(b1);
		add(l1);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		b1.addActionListener(e -> {
			String name = t1.getText();
			
			if(r1.isSelected()) {
				name = "Mr. " + name;
			}else {
				name = "Mrs. " + name;
			}
			
			l1.setText(name);
		});
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
