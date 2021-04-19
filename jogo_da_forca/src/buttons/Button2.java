package buttons;

import javax.swing.JButton;

import main.Controller;

/**
 * Class created for a generic button
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class Button2 extends JButton{
	
	/**
	 * Receive the params to create a button with title, position on the screen and size
	 * @param title
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Button2(String title, int x, int y, int width, int height) {
	this.setBounds(x, y, width, height);
	this.setText(title.toString());
	this.setVisible(true);
	this.setFocusable(false);
	}

}
