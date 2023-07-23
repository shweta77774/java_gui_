import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Listener extends JFrame implements KeyListener,MouseListener {
	
	JLabel label;
	JLabel label2;
	ImageIcon icon;
	Listener(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setBackground(Color.gray);
		
		this.addMouseListener(this);
		icon = new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\rocket.jpg");
		
		label = new JLabel();
		label2 = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBounds(120,120,200,200);
		label2.setForeground(Color.red);
		label2.setOpaque(true);
		
		
		label.setIcon(icon);
		label2.addKeyListener(this);
		this.add(label);
		this.add(label2);
		this.getContentPane().setBackground(Color.black);
		this.setVisible(true);
		
		
		
	}
//----------------------------------KeyListener--------------------------------------------
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'l': label.setLocation(label.getX()-1,label.getY());
		break;
		case 'u': label.setLocation(label.getX(),label.getY()-1);
		break;
		case 'r': label.setLocation(label.getX()+1,label.getY());
		break;
		case 'd':label.setLocation(label.getX(),label.getY()+1);
		break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 16: label.setLocation(label.getX()-10,label.getY());
		break;
		case 54: label.setLocation(label.getX(),label.getY()-10);
		break;
		case 46: label.setLocation(label.getX()+10,label.getY());
		break;
		case 49:label.setLocation(label.getX(),label.getY()+10);
		break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You released key"+e.getKeyChar());
		//System.out.println("You released code"+e.getKeyCode());
		
		
	}
//-------------------------------------MouseListener----------------------------------------------------------------
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label2.setBackground(Color.red);
		System.out.println("Mouseclicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label2.setBackground(Color.orange);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label2.setBackground(Color.yellow);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label2.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label2.setBackground(Color.green);
		
	}

}
