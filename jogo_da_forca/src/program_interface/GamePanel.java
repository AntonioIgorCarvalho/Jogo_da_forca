package program_interface;

import java.awt.Color;

import javax.swing.JPanel;

import main.Controller;

public class GamePanel extends JPanel {
	
	Frame frame;
	
	/*
	 * Configuring the game JPanel
	 */
	public GamePanel(Frame frame) {
			this.frame = frame;
			
			Color transparent = new Color(0, 0, 0, 0);
			this.setBounds(0, 0, 1200, 800);
			this.setBackground(transparent);
			this.setLayout(null);
		
	}
	
	/*
	 * Draw the buttons and the enviroment to the guess word
	 */
	public void updateGamePanel() {
		this.removeAll();
		
		Button2 buttonTip = new Button2("DICA", 75, 100, 100, 100);
		buttonTip.addActionListener(e -> Controller.game.showTip());
		this.add(buttonTip);
		
		Button2 menu = new Button2("Menu", 200, 100, 100, 100);
		menu.addActionListener(e -> this.frame.setVisibleMenu());
		this.add(menu);
		
		frame.drawButtons();
		
		//Adding labels
		this.add(frame.getWordShow());
		this.add(frame.getLifeShow());
		
		this.frame.add(this);//Adding the gameJPanel to the frame
	}

}
