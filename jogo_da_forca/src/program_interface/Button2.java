package program_interface;

import javax.swing.JButton;

import main.Controller;

public class Button2 extends JButton{
	
	public Button2(String title, int x, int y) {
	this.setBounds(x, y, 100, 100);
	this.setText(title.toString());
	this.setVisible(true);
	this.setFocusable(false);
	this.addActionListener(e -> Controller.game.showTip());//Action when the button is clicked
	}

}
