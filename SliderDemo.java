import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame = new JFrame("Slider Demo");
		panel= new JPanel();
		label = new JLabel();
		slider= new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		label.setText("^O C"+slider.getValue());
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method ^
		label.setText("^o C"+slider.getValue());
		
	}

}
