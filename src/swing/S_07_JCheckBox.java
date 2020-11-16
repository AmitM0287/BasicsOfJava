package swing;

import static java.lang.System.out;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class S_07_JCheckBox {

	public static void main(String[] args) {
		new Human();
	}

}

@SuppressWarnings("serial")
class Human extends JFrame{
	private JTextField t1;
	private JLabel l1;
	private JRadioButton r1, r2;
	private JCheckBox c1, c2;
	private JButton b1;
	
	public Human() {
		t1 = new JTextField(10);
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("Singing");
		b1 = new JButton("Submit");
		l1 = new JLabel("Details");
		
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b1);
		add(l1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		c1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				out.println("Dancer");
			}
		});
		c2.addItemListener(ie -> {
			out.println("Singer");
		});
		
		b1.addActionListener(e -> {
			String name = t1.getText();
			
			if(r1.isSelected()) {
				name = "Mr. " + name;
			}else if(r2.isSelected()){
				name = "Mrs. " + name;
			}else {
				name = "" + name;
			}
			
			if(c1.isSelected()) {
				name = name +" "+ c1.getText();
			}
			if(c2.isSelected()) {
				name = name +" "+ c2.getText();
			}
			
			l1.setText(name);
		});
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
