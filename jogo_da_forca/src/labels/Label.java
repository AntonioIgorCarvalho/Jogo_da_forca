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
	 * @param x horizontal position
	 * @param y vertical position
	 * @param width width of the button
	 * @param height height of the button
	 */
	public Label(int x, int y, int width, int height) {
		
		this.setBounds(x, y, width, height);
		this.setVisible(false);
		this.setFont(new Font("Arial", Font.PLAIN, 100));
		
	}
	
	/**
	 * Create a label with a custom font size
	 * @param x horizontal position
	 * @param y vertical position
	 * @param width width of the button
	 * @param height height of the button
	 * @param font font size of the title
	 */
	public Label(int x, int y, int width, int height, int font) {
		
		this.setBounds(x, y, width, height);
		this.setVisible(false);
		this.setFont(new Font("Arial", Font.PLAIN, font));
		
	}

}
