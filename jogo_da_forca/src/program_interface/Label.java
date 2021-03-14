package program_interface;

import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel{
	
	public Label(int x, int y, int width, int height) {
		
		this.setBounds(x, y, width, height);
		this.setVisible(false);
		this.setFont(new Font("Arial", Font.PLAIN, 100));
		
	}

}
