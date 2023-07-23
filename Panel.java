import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class Panel {

	public static void main(String[] args) {
		JLabel label = new JLabel();
		label.setText("Hiii");
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		
		JPanel rpanel = new JPanel();
		rpanel.setBackground(Color.red);
		rpanel.setBounds(0, 0, 250 ,250);
		rpanel.setLayout(null);
		
		JPanel bpanel = new JPanel();
		bpanel.setBackground(Color.blue);
		bpanel.setBounds(250, 0, 250 ,250);
		
		JPanel gpanel = new JPanel();
		gpanel.setBackground(Color.green);
		gpanel.setBounds(0, 250, 500 ,250);
		gpanel.setLayout(new BorderLayout());
		
		
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(rpanel);
		frame.add(bpanel);
		frame.add(gpanel);
		gpanel.add(label);
		
		
	}

}
