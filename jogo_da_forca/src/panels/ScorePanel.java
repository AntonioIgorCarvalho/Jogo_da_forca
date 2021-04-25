package panels;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.Button2;
import labels.Label;
import main.Controller;
import program_interface.Frame;

/**
 * JPanel for the current session score (how many words the user guessed)
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class ScorePanel extends JPanel{
	private Frame frame;
	
	/**
	 * Constructor
	 * @param frame the main frame of the program
	 */
	public ScorePanel(Frame frame) {
		this.frame = frame;
		Color transparent = new Color(0, 0, 0, 0);
		this.setBounds(0, 0, 1200, 800);
		this.setBackground(transparent);
		this.setLayout(null);
		
	}
	
	/**
	 * Draw and configure the buttons and the enviroment to the Score JPanel
	 */
	public void updateScorePanel() {
		this.removeAll();
		
		Label currentScore = new Label(75, 200, 1000, 200, 48);
		currentScore.setText("Sua pontuacao atual: " + Controller.game.getScore()); 
		currentScore.setVisible(true);
		this.add(currentScore);
		
		Button2 menu = new Button2("Menu", 75, 100, 100, 100);
		menu.addActionListener(e -> this.frame.setVisible("menu"));
		this.add(menu);
		
		this.frame.add(this);
	}

}
