package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class S_10_JProgressBar {

	public static void main(String[] args) {
		new ProgressBar();
	}

}

@SuppressWarnings("serial")
class ProgressBar extends JFrame implements ActionListener{
	private JProgressBar p;
	private JButton b;
	private int i=0;
	
	public ProgressBar() {
		b = new JButton("Greeting");
		p = new JProgressBar(0, 20);
		
		add(b);
		add(p);
		
		Timer t = new Timer(100, this);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t.start();
			}
		});
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(i == 20) {
			new Human();
			dispose();
		}
		i++;
		p.setValue(i);
	}
	
}