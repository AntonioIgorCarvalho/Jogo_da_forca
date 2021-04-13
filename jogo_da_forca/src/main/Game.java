package main;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import program_interface.Frame;

public class Game {
	/*
	 * player -> controll the number of errors and tell if the game is over or not
	 * word -> the current secret word that the player is guessing
	 * frame -> the graphic interface
	 * guessedChar ->  the string of the current secret word
	 * guessChar -> the string that the player is writting
	 * temp -> temporary auxiliar string
	 * score -> the current score of the player
	 */
	private Player player;
	private Word word;
	private Frame frame;
	public ArrayList<Character> guessedChar = new ArrayList<Character>();
	public ArrayList<Character> guessChar = new ArrayList<Character>();
	private String temp;
	private int score = 0;

	/*
	 * Init method
	 */
	public Game (Player player) {
		this.player = player;
	}
	
	/*
	 * Setup the word valeus to the new word
	 */
	public void wordSetup() {
		
		this.guessedChar.clear();
		this.guessChar.clear();
		
		for (char c : this.word.getText().toCharArray()) {
			  this.guessedChar.add(c);
			}
		for (char c : this.word.getText().toCharArray()) {
			  this.guessChar.add(c);
			}
		
	}

	/*
	 * startGame
	 * Set basic value for the player to start guessing the word
	 */
	public void startGame() {
		
		this.player.setLife(4);
		this.player.setScore(0);
		this.wordSetup();
		
	}
	
	/*
	 * updateFrame
	 * Updates the screen to a new word
	 */
	public void updateFrame(Word word) {
		
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

	/*
	 * letterChoice
	 * Check if the selected letter is or not on the current guess word and if the game is over or not
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
			Controller.data.deleteWhenWin();
		}
		
		SwingUtilities.updateComponentTreeUI(this.frame);//Updating the frame
	}

	public Word getWord() {
		return word;
	}

	public void setWord(Word word) {
		this.word = word;
	}
	
	/*
	 * setFrame
	 * pass frame as parameter to Game and define the guessed word lenght to show on the screen
	 */
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	/*
	 * attGuessWord
	 * Takes the i index of guessChar/guessedChar and att the JLabel to show the new guessed letter and add the player score
	 */
	public void attGuessWord(int i) {
		
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
	
	/*
	 * Method to show the current tip on the click of the tip button
	 */
	public void showTip() {
		this.frame.tipShow(this.word.getTip());
	}
	
	public int getScore() {
		return score;
	}
	
	/*
	 * Takes an ArrayList<Character> and coverts in a normal string
	 */
	String getStringRepresentation(ArrayList<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
	
	/*
	 * Check if the current session is out of words
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
	
}
