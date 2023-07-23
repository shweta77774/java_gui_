import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyRadio extends JFrame implements ActionListener{
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	MyRadio(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaButton= new JRadioButton("pizza");
		hamburgerButton= new JRadioButton("hamberger");
		hotdogButton= new JRadioButton("hotdog");
	
		
		ButtonGroup group= new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.add(pizzaButton);
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()==pizzaButton) {
			System.out.println("Pizza choosen");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("hamberger choosen");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("hotdog choosen");
		}
		
	}

}
