package program_interface;

import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel{
	
	/*
	 * Init method without the font size
	 */
	public Label(int x, int y, int width, int height) {
		
		this.setBounds(x, y, width, height);
		this.setVisible(false);
		this.setFont(new Font("Arial", Font.PLAIN, 100));
		
	}
	
	/*
	 * Init method with the font size
	 */
	public Label(int x, int y, int width, int height, int font) {
		
		this.setBounds(x, y, width, height);
		this.setVisible(false);
		this.setFont(new Font("Arial", Font.PLAIN, font));
		
	}

}
