package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S_09_CallJFrameToAnother {

	public static void main(String[] args) {
		new Caller();
	}

}

@SuppressWarnings("serial")
class Caller extends JFrame{
	
	public Caller() {
		JButton b1 = new JButton("Calculator");
		
		add(b1);
		
		b1.addActionListener(ae -> {
			new Calculator();
			
//			dispose() method is closed the current frame.
			dispose();
		});
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
