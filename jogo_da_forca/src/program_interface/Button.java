package program_interface;

import java.awt.Color;

import javax.swing.JButton;

public class Button extends JButton {

	public Button(String title, int x, int y){
	
	this.setBounds(x, y, 50, 50);
	this.setText(title);
	this.setVisible(true);
	this.setFocusable(false);

	}
}
