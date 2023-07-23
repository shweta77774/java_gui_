import javax.swing.*;
public class MainJOption {
	MainJOption(int num){
		switch(num) {
		case(1): JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
		break;
		case(2):
			JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.INFORMATION_MESSAGE);
		break;
		case(3):
			JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.QUESTION_MESSAGE);
		break;
		case(4):
			JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.WARNING_MESSAGE);
		break;
		case(5):
			JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.ERROR_MESSAGE);
		break;
		case(6):
			JOptionPane.showConfirmDialog(null, "Bro do you even code?","title",JOptionPane.YES_NO_CANCEL_OPTION);
		break;
		
			
		
			
		}
	}
}
