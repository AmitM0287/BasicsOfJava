package swing;

import static java.lang.System.out;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class S_08_MouseListener {

	public static void main(String[] args) {
		new Listener();
	}

}

@SuppressWarnings("serial")
class Listener extends JFrame{
	
	public Listener() {
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				int x = me.getX();
				int y = me.getY();
				
				out.println(x + "," + y);
			}
		});	
		
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
