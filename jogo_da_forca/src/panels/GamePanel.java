package panels;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.LetterButton;
import buttons.Button2;
import main.Controller;
import program_interface.Frame;

public class GamePanel extends JPanel {
	private Frame frame;
	
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
		menu.addActionListener(e -> this.frame.setVisible("menu"));
		this.add(menu);
		
		this.drawButtons();
		
		//Adding labels
		this.add(frame.getWordShow());
		this.add(frame.getLifeShow());
		
		this.frame.add(this);//Adding the gameJPanel to the frame
	}
	
	/*
	 * Creating button letters from A to Z and adding them on the frame
	 */
	protected void drawButtons() {
		int spaceX = 50;
		int spaceY = 500;	
		
		int aux = 1;
		for(int i = 65; i < 91; i++) {

			LetterButton button = new LetterButton((char) i, (25 + spaceX ) * aux, spaceY);
			aux++;
			if(aux == 14) {
				spaceY += 25 + 50;
				aux = 1;
			}
			this.add(button);
		}
		
	}

}
