import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	MyFrame(){
	    button = new JButton();
		button.setBounds(100, 100, 100, 50);
		button.setText("I am a button");
		button.setFocusable(false);
		button.addActionListener(this);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		label = new JLabel();
		label.setText("Bro Do you even Code");
		label.setBounds(0, 0, 150, 150);
		label.setVisible(false);
		label.setHorizontalTextPosition(JLabel.RIGHT);
		
		
		this.setTitle("Jthis GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		//this.getContentPane().setBackground(new Color(120,50,100));
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			label.setVisible(true);
		}
	}
	
	
	

}
