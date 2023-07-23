//JTextField 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame1 extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;
	MyFrame1(){
		this.setTitle("Jthis GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button =new JButton("submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(Color.CYAN);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("username");
		
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Welcome "+" "+textField.getText()); 
			button.setEnabled(false);
			textField.setEditable(false);
		}
		
	}

	
}
