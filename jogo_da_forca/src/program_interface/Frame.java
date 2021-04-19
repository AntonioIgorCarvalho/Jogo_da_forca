package program_interface;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import labels.Label;
import panels.ChoicePanel;
import panels.GamePanel;
import panels.MenuPanel;
import panels.NewWordPanel;
import panels.ScorePanel;
import panels.WritePanel;
/**
 * Class created for the frame of the application
 * wordShow -> the current guess word on the screen
 * lifeShow -> the current life on the screen
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class Frame extends JFrame{

	private Label wordShow = new Label(75, 200, 1000, 400);
	private Label lifeShow = new Label(75, 200, 1000, 200, 48);
	private GamePanel game = new GamePanel(this);
	private MenuPanel menu = new MenuPanel(this);
	private ScorePanel score = new ScorePanel(this);
	private ChoicePanel choice = new ChoicePanel(this);
	private WritePanel write = new WritePanel(this);
	private NewWordPanel newWord = new NewWordPanel(this);

	/**
	 * Constructor of the frame
	 * @param title
	 */
	public Frame(String title){
		
		this.setTitle(title); // Title
		this.setLayout(null);// Free layout
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(1200,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white); //Background color
		
		this.setVisible("menu");
	}
	
	/**
	 * Choose which JPanel to be the one visible based on the choice string
	 * @param choice
	 */
	public void setVisible(String choice) {
		this.menu.setVisible(false);
		this.score.setVisible(false);
		this.newWord.setVisible(false);
		this.choice.setVisible(false);
		this.game.setVisible(false);
		this.write.setVisible(false);
		
		if(choice == "menu") {
			this.menu.setVisible(true);
		} 
		else if(choice == "score") {
			this.score.setVisible(true);
			this.score.updateScorePanel();
		} 
		else if(choice == "newWord") {
			this.newWord.setVisible(true);
			this.newWord.updateNewWordPanel();
		} 
		else if(choice == "choice") {
			this.choice.setVisible(true);
		} 
		else if (choice == "game") {
			this.game.setVisible(true);
		} else if (choice == "write") {
			this.write.setVisible(true);
		}
		SwingUtilities.updateComponentTreeUI(this);//Updating the frame
	}

	/**
	 * setter of the wordShow
	 * @param text
	 */
	public void setWordShow(String text) {
		this.wordShow.setText(text);
		this.wordShow.setVisible(true);
	}
	
	/**
	 * setter of the lifeShow
	 * @param life
	 */
	public void setLifeShow(int life) {
		this.lifeShow.setText("Vidas restantes: " + life);
		this.lifeShow.setVisible(true);
	}
	
	/**
	 * Show the current tip for the player in a message dialog
	 * @param tip
	 */
	public void tipShow(String tip) {
		JOptionPane.showMessageDialog(this, tip);
	}
	
	/**
	 * Show a message dialog when the player is trying to acess an session without words
	 */
	public void completeShow() {
		JOptionPane.showMessageDialog(this, "Voce ja completou todas as palavras dessa sessao, escolha outra ou adicione mais palavras");
	}
	
	/**
	 * Show a message dialog when the player is guess a word correctly
	 */
	public void winShow() {
		this.setVisible("menu");
		JOptionPane.showMessageDialog(this, "Parabens, voce acertou a palavra! Sua pontuacao recebeu +1!");
	}
	
	/**
	 * Show a message dialog when the player fail to guess a word
	 */
	public void loseShow() {
		this.setVisible("menu");
		JOptionPane.showMessageDialog(this, "Voce perdeu :(");
	}
	
	
	/**
	 * game getter
	 * @return game
	 */
	public GamePanel getGame() {
		return this.game;
	}
	
	/**
	 * wordShow getter
	 * @return wordShow
	 */
	public Label getWordShow() {
		return this.wordShow;
	}
	
	/**
	 * lifeShow getter
	 * @return lifeShow
	 */
	public Label getLifeShow() {
		return this.lifeShow;
	}
	
	/**
	 * write getter
	 * @return write
	 */
	public WritePanel getWrite() {
		return this.write;
	}
	
}
