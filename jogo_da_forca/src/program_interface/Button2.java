package program_interface;

import javax.swing.JButton;

import main.Controller;

/*
 * Class created for a generic button
 */
public class Button2 extends JButton{
	
	public Button2(String title, int x, int y, int width, int height) {
	this.setBounds(x, y, width, height);
	this.setText(title.toString());
	this.setVisible(true);
	this.setFocusable(false);
	}

}
