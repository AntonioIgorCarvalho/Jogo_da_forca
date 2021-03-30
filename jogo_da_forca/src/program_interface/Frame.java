package program_interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import main.Controller;

public class Frame extends JFrame{

	private Label wordShow = new Label(75, 200, 1000, 400);
	private Label lifeShow = new Label(75, 200, 1000, 200, 48);
	private GamePanel game = new GamePanel(this);
	private MenuPanel menu = new MenuPanel(this);
	private ScorePanel score = new ScorePanel(this);
	private ChoicePanel choice = new ChoicePanel(this);

	// Init
	public Frame(String title){
		
		this.setTitle(title); // Title
		this.setLayout(null);// Free layout
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(1200,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white); //Background color
		
		this.setVisibleMenu();
	}
	
	/*
	 * setVisibleGame
	 * Choose the Game JPanel to be the one seeing
	 */
	public void setVisibleGame() {
		this.game.setVisible(true);
		this.menu.setVisible(false);
		this.score.setVisible(false);
		this.choice.setVisible(false);
		this.game.updateGamePanel();
		SwingUtilities.updateComponentTreeUI(this);//Updating the frame
	}
	
	/*
	 * setVisibleGame
	 * Choose the Menu JPanel to be the one seeing
	 */
	public void setVisibleMenu() {
		this.game.setVisible(false);
		this.menu.setVisible(true);
		this.score.setVisible(false);
		this.choice.setVisible(false);
		SwingUtilities.updateComponentTreeUI(this);//Updating the frame
	}
	
	/*
	 * setVisibleScore
	 * Choose the Score JPanel to be the one seeing
	 */
	public void setVisibleScore() {
		this.game.setVisible(false);
		this.menu.setVisible(false);
		this.score.setVisible(true);
		this.choice.setVisible(false);
		this.score.updateScorePanel();
		SwingUtilities.updateComponentTreeUI(this);//Updating the frame
	}
	
	/*
	 * setVisibleScore
	 * Choose the Score JPanel to be the one seeing
	 */
	public void setVisibleChoice() {
		this.game.setVisible(false);
		this.menu.setVisible(false);
		this.score.setVisible(false);
		this.choice.setVisible(true);
		SwingUtilities.updateComponentTreeUI(this);//Updating the frame
	}
	
	/*
	 * Creating button letters from A to Z and adding them on the frame
	 */
	protected void drawButtons() {
		int spaceX = 50;
		int spaceY = 500;	
		
		int aux = 1;
		for(int i = 65; i < 91; i++) {

			Button button = new Button((char) i, (25 + spaceX ) * aux, spaceY);
			aux++;
			if(aux == 14) {
				spaceY += 25 + 50;
				aux = 1;
			}
			this.game.add(button);
		}
		
	}

	/*
	 * setter of the wordshow
	 */
	public void setWordShow(String text) {
		this.wordShow.setText(text);
		this.wordShow.setVisible(true);
	}
	
	public void setLifeShow(int life) {
		this.lifeShow.setText("Vidas restantes: " + life);
		this.lifeShow.setVisible(true);
	}
	
	/*
	 * Show the current tip for the player
	 */
	public void tipShow(String tip) {
		JOptionPane.showMessageDialog(this, tip);
	}
	
	public GamePanel getGame() {
		return this.game;
	}
	
	public Label getWordShow() {
		return this.wordShow;
	}
	
	public Label getLifeShow() {
		return this.lifeShow;
	}
	
}
