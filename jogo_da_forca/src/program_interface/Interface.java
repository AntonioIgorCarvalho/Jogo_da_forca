package program_interface;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Interface {
	
public static void main(String args[]) {
	
	JLabel label = new JLabel();
	
	ImageIcon image = new ImageIcon("forca.png");
	label.setText("Hey hey");
	label.setIcon(image);
	
	
	Frame frame = new Frame("Menu"); 
	frame.add(label);
		
	}

}
