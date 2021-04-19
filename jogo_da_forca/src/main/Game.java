package main;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import program_interface.Frame;
	/**
	 * Game class is used to manage the information between the program data and the interface
	 * player -> controll the number of errors and tell if the game is over or not
	 * word -> the current secret word that the player is guessing
	 * frame -> the graphic interface
	 * guessedChar ->  the string of the current secret word
	 * guessChar -> the string that the player is writting
	 * temp -> temporary auxiliar string
	 * score -> the current score of the player
	 * @author Antonio Igor Carvalho
	 * @version 1.0 (April 2021)
	 */

public class Game {
	
	private Player player;
	private Word word;
	private Frame frame;
	private ArrayList<Character> guessedChar = new ArrayList<Character>();
	private ArrayList<Character> guessChar = new ArrayList<Character>();
	private String temp;
	private int score = 0;

	/**
	 * Constructor
	 * @param player
	 */
	protected Game (Player player) {
		this.player = player;
	}
	
	/**
	 * Setup the current guessedChar and guessChar values to the word
	 */
	private void wordSetup() {
		this.guessedChar.clear();
		this.guessChar.clear();
		
		for (char c : this.word.getText().toCharArray()) {
			  this.guessedChar.add(c);
			}
		for (char c : this.word.getText().toCharArray()) {
			  this.guessChar.add(c);
			}
	}

	/**
	 * Set basic value for the player to start guessing the word
	 */
	private void startGame() {
		this.player.setLife(4);
		this.player.setScore(0);
		this.wordSetup();
	}
	
	/**
	 * Updates the screen to a new word
	 * @param word the new word
	 */
	private void updateFrame(Word word) {
		
		this.setWord(word);
		
		this.startGame();//New secret word
		this.frame.getGame().updateGamePanel();//Updating the buttons
		
		for(int i = 0; i < this.word.getLenght(); i++) {
			this.guessChar.set(i, '?');
		}
		
		attGuessWord(this.word.letterCheckIndex('_'));//Checking '_' in the word

		this.temp = getStringRepresentation(guessChar);//Pass the current secret word
		this.frame.setWordShow(temp);
		this.frame.setLifeShow(4);
		
		SwingUtilities.updateComponentTreeUI(this.frame);//Updating the frame
	}

	/**
	 * Check if the selected letter is or not on the current guess word and if the game is over or not
	 * @param letter
	 */
	public void letterChoice(char letter) {
		if(this.word.letterCheck(letter) == true) {//If letter that the player chose is correct
			attGuessWord(this.word.letterCheckIndex(letter));
		}
		else {
			this.player.setLife(this.player.getLife() - 1); //Lose 1 life point
			this.frame.setLifeShow(this.player.getLife());//Att the interface life
		}
		
		// Game over
		if(this.player.getLife() <= -1) {
			this.frame.loseShow();
		}
		
		// Win!
		if(this.player.getScore() >= this.word.getLenght()) {
			score = score += 1;
			this.frame.winShow();
			Controller.data.deleteWhenWin();// If the player win the current word is deleted
		}
		
		SwingUtilities.updateComponentTreeUI(this.frame);//Updating the frame
	}

	/**
	 * Takes the i index of guessChar/guessedChar and att the JLabel to show the new guessed letter and add the player score
	 * The score is the Player.score, refer to see if the player has already guessed the word
	 * @param i
	 */
	private void attGuessWord(int i) {
		if(i == -1) {
			return;
		}
		
		for(int j = 0; j < guessChar.size(); j++) {//See if the word contains more than one unique letter, ex: BRAASIL, contais two 'A'
			if(guessedChar.get(j) == guessedChar.get(i)) {
				this.player.setScore(player.getScore() + 1);
				guessChar.set(j, guessedChar.get(i));
			}
		}
	    temp = getStringRepresentation(guessChar);
		this.frame.setWordShow(temp);
	}
	
	/**
	 * Show the current tip on the click of the tip button
	 */
	public void showTip() {
		this.frame.tipShow(this.word.getTip());
	}
	
	/**
	 * Takes an ArrayList<Character> and coverts in a normal string
	 * @param list
	 * @return normalString
	 */
	private String getStringRepresentation(ArrayList<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
	
	/**
	 * Check if the current session is out of words,
	 * Ex: if "Music" or "Art" has words that the user has not solved yet
	 * @param type
	 */
	public void checkCurrentArray(String type) {
		if(type == "music") {
			if(Controller.data.music.size() == 0) {
				this.frame.setVisible("menu");
				this.frame.completeShow();
				return;
			}
			this.updateFrame(Controller.data.randomChoice(Controller.data.music));
			return;
		}
		if(type == "countries") {
			if(Controller.data.countries.size() == 0) {
				this.frame.setVisible("menu");
				this.frame.completeShow();
				return;
			}
			this.updateFrame(Controller.data.randomChoice(Controller.data.countries));
			return;
		}
		if(type == "animals") {
			if(Controller.data.animals.size() == 0) {
				this.frame.setVisible("menu");
				this.frame.completeShow();		
				return;
				}
			this.updateFrame(Controller.data.randomChoice(Controller.data.animals));
			return;
		}
		if(type == "foods") {
			if(Controller.data.foods.size() == 0) {
				this.frame.setVisible("menu");
				this.frame.completeShow();		
				return;
				}
			this.updateFrame(Controller.data.randomChoice(Controller.data.foods));
			return;
		}
		if(type == "objects") {
			if(Controller.data.objects.size() == 0) {
				this.frame.setVisible("menu");
				this.frame.completeShow();	
				return;
				}
			this.updateFrame(Controller.data.randomChoice(Controller.data.objects));
			return;
		}
		if(type == "sports") {
			if(Controller.data.sports.size() == 0) {
				this.frame.setVisible("menu");
				this.frame.completeShow();	
				return;
				}
			this.updateFrame(Controller.data.randomChoice(Controller.data.sports));
			return;
		}
		if(type == "art") {
			if(Controller.data.art.size() == 0) {
				this.frame.setVisible("menu");
				this.frame.completeShow();	
				return;
				}
			this.updateFrame(Controller.data.randomChoice(Controller.data.art));
			return;
		}
	}

	
	/**
	 * word setter
	 * @param word
	 */
	public void setWord(Word word) {
		this.word = word;
	}
	
	/**
	 * score getter
	 * @return
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * frame setter
	 * @param frame
	 */
	protected void setFrame(Frame frame) {
		this.frame = frame;
	}
	
}
