import javax.swing.*;
import java.awt.*;
public class MainLayeredPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150, 150, 200, 200);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		layeredPane.add(label1,Integer.valueOf(0));
		layeredPane.add(label2,Integer.valueOf(2));
		layeredPane.add(label3,Integer.valueOf(1));
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.add(layeredPane);
		frame.setVisible(true);
		

	}

}
