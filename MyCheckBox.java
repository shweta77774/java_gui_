import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyCheckBox extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkbox;
	MyCheckBox(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		checkbox = new JCheckBox();
		checkbox.setText("I'M NOT ROBOT");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Consolas",Font.PLAIN,35));
		
		this.add(checkbox);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(checkbox.isSelected());
			
		}
		
	}

}
