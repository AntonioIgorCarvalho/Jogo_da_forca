package program_interface;

import java.awt.Color;

import javax.swing.JPanel;

import main.Controller;

public class ScorePanel extends JPanel{
	Frame frame;
	
	/*
	 * Configuring the Score JPanel
	 */
	protected ScorePanel(Frame frame) {
		this.frame = frame;
		Color transparent = new Color(0, 0, 0, 0);
		this.setBounds(0, 0, 1200, 800);
		this.setBackground(transparent);
		this.setLayout(null);
		
	}
	
	/*
	 * Draw the buttons and the enviroment to the Score JPanel
	 */
	public void updateScorePanel() {
		this.removeAll();
		
		Label currentScore = new Label(75, 200, 1000, 200, 48);
		currentScore.setText("Your current score: " + Controller.game.getScore()); 
		currentScore.setVisible(true);
		this.add(currentScore);
		
		Button2 menu = new Button2("Menu", 75, 100, 100, 100);
		menu.addActionListener(e -> this.frame.setVisible("menu"));
		this.add(menu);
		
		this.frame.add(this);
	}

}
