import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

import javax.swing.*;

public class MenuBar extends JFrame implements ActionListener {
	JMenuBar menu;
	JMenu filemenu;
	JMenu editmenu;
	JMenu helpmenu;
	JMenuItem loaditem;
	JMenuItem saveitem;
	JMenuItem exititem;
	JMenuItem colorc;
	MenuBar(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		JMenuBar menu = new JMenuBar();
		
		filemenu= new JMenu("file");
		editmenu= new JMenu("edit");
		helpmenu= new JMenu("help");
		
		loaditem= new JMenuItem("LoadItem");
		saveitem= new JMenuItem("SaveItem");
		exititem= new JMenuItem("ExitItem");
		colorc= new JMenuItem("Color Chooser");
		
		loaditem.addActionListener(this);
		saveitem.addActionListener(this);
		exititem.addActionListener(this);
		colorc.addActionListener(this);
		
		filemenu.setMnemonic(KeyEvent.VK_F); //alt+f for file
		editmenu.setMnemonic(KeyEvent.VK_E); //alt+e for edit
		helpmenu.setMnemonic(KeyEvent.VK_H);//alt+h for helP
		loaditem.setMnemonic(KeyEvent.VK_L); //l for load
		saveitem.setMnemonic(KeyEvent.VK_S); //s for save
		exititem.setMnemonic(KeyEvent.VK_E);//e for exit
		
		filemenu.add(loaditem);
		filemenu.add(saveitem);
		filemenu.add(exititem);
		filemenu.add(colorc);
		
		menu.add(filemenu);
		menu.add(editmenu);
		menu.add(helpmenu);
		this.setJMenuBar(menu);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loaditem) {
			
//---------------------------File selector---------------------------------------------------------------------------
			
			JFileChooser filechooser= new JFileChooser();
			//int response= filechooser.showOpenDialog(null);  //select file to open
			int response= filechooser.showSaveDialog(null);  //select file to save
			
			if (response==JFileChooser.APPROVE_OPTION) {
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
		else if(e.getSource()==exititem) {
			System.out.println("Exitting");	
		}
		else if (e.getSource()==saveitem) {
			System.out.println("Saving");	
		}
//-------------------------------Color Chooser-------------------------------------------------------------------------
		else if(e.getSource()==colorc) {
			JColorChooser colorchooser= new JColorChooser();
			Color color = JColorChooser.showDialog(null,"pick color",Color.black);
		}
		
	}
	

}
