package labels;

import java.awt.Font;

import javax.swing.JLabel;

/**
 * Class to create a generic Label
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class Label extends JLabel{
	
	/**
	 * Create a label with a fixed font size
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Label(int x, int y, int width, int height) {
		
		this.setBounds(x, y, width, height);
		this.setVisible(false);
		this.setFont(new Font("Arial", Font.PLAIN, 100));
		
	}
	
	/**
	 * Create a label with a custom font size
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param font
	 */
	public Label(int x, int y, int width, int height, int font) {
		
		this.setBounds(x, y, width, height);
		this.setVisible(false);
		this.setFont(new Font("Arial", Font.PLAIN, font));
		
	}

}
