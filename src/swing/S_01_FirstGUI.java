package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class S_01_FirstGUI {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		GUI gui = new GUI();
		
	}
}

@SuppressWarnings("serial")
class GUI extends JFrame{
//	JFrame follows CardLayout by default.
	
	public GUI() {
		
//		To show something in your GUI you have to use JLable.
		JLabel jl1 = new JLabel("Hello Java...");
		JLabel jl2 = new JLabel("Welcome To Swing...");
		add(jl1);
		add(jl2);
		
//		setLayout is used to set the layout.
		setLayout(new FlowLayout());	// FlowLayout : Try to capture the middle position.
		
//		To make your GUI visible you have to use setVisible() method.
		setVisible(true);
		
//		To set the size your GUI you have to use setSize() method.
		setSize(700, 500);
		
//		To close the GUI we use JFrame.EXIT_ON_CLOSE.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
