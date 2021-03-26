package program_interface;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import main.Controller;

public class Frame extends JFrame{

	private Label wordShow = new Label(75, 200, 1000, 400);
	private Label lifeShow = new Label(75, 200, 1000, 200, 48);
	private JPanel game = new JPanel();
	private JPanel menu = new JPanel();
	private JPanel score = new JPanel();

	// Init
	public Frame(String title){
		
		this.setTitle(title); // Title
		this.setLayout(null);// Free layout
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(1200,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white); //Background color
		

		
		//Adding panels
		this.configureGamePanel();
		this.configureScorePanel();
		this.configureMenuPanel();
		
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
		this.updateGamePanel();
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
		this.updateScorePanel();
		SwingUtilities.updateComponentTreeUI(this);//Updating the frame
	}
	
	private void configureScorePanel() {
		Color transparent = new Color(0, 0, 0, 0);
		this.score.setBounds(0, 0, 1200, 800);
		this.score.setBackground(transparent);
		this.score.setLayout(null);
		
	}
	
	public void updateScorePanel() {
		this.score.removeAll();
		
		Label currentScore = new Label(75, 200, 1000, 200, 48);
		currentScore.setText("Your current score: " + Controller.game.getScore()); 
		currentScore.setVisible(true);
		this.score.add(currentScore);
		
		Button2 menu = new Button2("Menu", 75, 100, 100, 100);
		menu.addActionListener(e -> this.setVisibleMenu());
		this.score.add(menu);
		
		this.add(score);
	}
	
	/*
	 * Configuring the menu JPanel
	 */
	private void configureMenuPanel() {
		Color transparent = new Color(0, 0, 0, 0);
		this.menu.setBounds(0, 0, 1200, 800);
		this.menu.setVisible(true);
		this.menu.setBackground(transparent);
		this.menu.setLayout(null);
		
		this.updateMenuPanel();
	}
	
	/*
	 * Draw the buttons and the enviroment to the menu
	 */
	public void updateMenuPanel() {
		
		Button2 start = new Button2("Jogar", 500, 100, 200, 200);
		start.addActionListener(e -> this.setVisibleGame());
		start.addActionListener(e -> Controller.game.updateFrame(Controller.game.getWord()));
		this.menu.add(start);
		
		Button2 scores = new Button2("Progresso", 500, 400, 200, 200);
		scores.addActionListener(e -> this.setVisibleScore());
		this.menu.add(scores);
		
		this.add(menu);
	}
	
	/*
	 * Configuring the game JPanel
	 */
	private void configureGamePanel(){
		
		Color transparent = new Color(0, 0, 0, 0);
		this.game.setBounds(0, 0, 1200, 800);
		this.game.setBackground(transparent);
		this.game.setLayout(null);
		
		this.updateGamePanel();
		
	}
	
	/*
	 * Draw the buttons and the enviroment to the guess word
	 */
	public void updateGamePanel() {
		this.game.removeAll();
		
		Button2 buttonTip = new Button2("DICA", 75, 100, 100, 100);
		buttonTip.addActionListener(e -> Controller.game.showTip());
		this.game.add(buttonTip);
		
		Button2 menu = new Button2("Menu", 200, 100, 100, 100);
		menu.addActionListener(e -> this.setVisibleMenu());
		this.game.add(menu);
		
		drawButtons();
		
		//Adding labels
		this.game.add(wordShow);
		this.game.add(lifeShow);
		
		this.add(game);//Adding the gameJPanel to the frame
	}
	
	/*
	 * Creating button letters from A to Z and adding them on the frame
	 */
	private void drawButtons() {
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
	
	public JPanel getGame() {
		return this.game;
	}
	
}
