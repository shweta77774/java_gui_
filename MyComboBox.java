import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyComboBox extends JFrame implements ActionListener {
	JComboBox combobox;
	MyComboBox(){
	this.setTitle("Jthis GUI");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	String[] animals = {"dog", "cat","bird"};
	combobox =new JComboBox(animals);
	combobox.addActionListener(this);
	
	this.add(combobox);
	this.pack();
	this.setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combobox) {
			System.out.println(combobox.getSelectedItem());
		}
		
	}

}
