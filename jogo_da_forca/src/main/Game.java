package main;
import program_interface.Frame;

public class Game {
	/*
	 * player -> controll the number of errors and tell if the game is over or not
	 * word -> the current secret word that the player is guessing
	 * frame -> the graphic interface
	 * guessedChar ->  the string of the current secret word
	 * guessChar -> the string that the player is writting
	 * temp -> temporary auxiliar string
	 */
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
	 * Check if the selected letter is or not on the current guess word and if the game is over or not
	 */
	public void letterChoice(char letter) {
		if(this.word.letterCheck(letter) == true) {//If its correct
			System.out.println("Acertou");
			attGuessWord(this.word.letterCheckIndex(letter));
		}
		else {
			System.out.println("Errou");
			this.player.setLife(this.player.getLife() - 1); //Lose 1 life point
			this.frame.setLifeShow(this.player.getLife());//Att the interface life
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
		
		//Pass the current secret word
		this.temp = String.valueOf(this.guessChar);

		this.frame.setWordShow(temp);
		this.frame.setLifeShow(4);
		
		
	}
	
	/*
	 * attGuessWord
	 * Takes the i index of guessChar/guessedChar and att the JLabel to show the new guessed letter and add the player score
	 */
	public void attGuessWord(int i) {
		for(int j = 0; j < guessChar.length; j++) {
			if(guessedChar[j] == guessedChar[i]) {
				this.player.setScore(player.getScore() + 1);
				guessChar[j] = guessedChar[i];
			}
		}
		this.temp = String.valueOf(this.guessChar);
		this.frame.setWordShow(temp);
	}
	
	public void showTip() {
		this.frame.tipShow(this.word.getTip());
	}

	
}
