package main;
import program_interface.Frame;

public class Game {
	
	private Player player;
	private Word word;
	private Frame frame;
	char[] guessedChar;
	char[] guessChar;
	String temp;

	/*
	 * Init method
	 */
	public Game (Player player, Word word) {
		this.player = player;
		this.word = word;
		this.guessedChar = this.word.getText().toCharArray();
		this.guessChar = this.word.getText().toCharArray();
	}

	/*
	 * Set basic value for the player
	 */
	public void StartGame() {
		this.player.setLife(4);
		this.player.setScore(0);
	}

	/*
	 * letterChoice
	 * Check if the selected letter is or not on the current guess word
	 */
	public void letterChoice(char letter) {
		if(this.word.letterCheck(letter) == true) {//If its correct
			this.player.setScore(player.getScore() + 1);
			System.out.println("Acertou");
			attGuessWord(this.word.letterCheckIndex(letter));
		}
		else {
			System.out.println("Errou");
			this.player.setLife(this.player.getLife() - 1); //Lose 1 life point
		}
		
		// Game over
		if(this.player.getLife() <= -1) {
			System.out.println("Game over");
		}
		
		// Win!
		if(this.player.getScore() >= this.word.getLenght()) {
			System.out.println("You Win");
		}
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
		
		for(int i = 0; i < this.word.getLenght(); i++) {
			this.guessChar[i] = '?';
		}
		
		this.temp = String.valueOf(this.guessChar);
		
		this.frame.setWordShow(temp);
	}
	
	/*
	 * attGuessWord
	 * Takes the i index of guessChar/guessedChar and att the JLabel to show the new guessed letter
	 */
	public void attGuessWord(int i) {
		guessChar[i] = guessedChar[i];
		this.temp = String.valueOf(this.guessChar);
		this.frame.setWordShow(temp);
	}
	
}
