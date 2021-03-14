package main;
import program_interface.Frame;

public class Game {
	
	private Player player;
	private Word word;
	private Frame frame;
	char[] guessedChar;
	char[] guessChar;
	String temp;

	// Init
	public Game (Player player, Word word) {
		this.player = player;
		this.word = word;
		this.guessedChar = this.word.getText().toCharArray();
		this.guessChar = this.word.getText().toCharArray();
	}

	//When round starts
	public void StartGame() {
		this.player.setLife(4);
		this.player.setScore(0);
	}

	//When the player pick a letter
	public void LetterChoice(char letter) {
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

	public void setFrame(Frame frame) {//Set the word guess
		this.frame = frame;
		
		for(int i = 0; i < this.word.getLenght(); i++) {
			this.guessChar[i] = '?';
		}
		
		this.temp = String.valueOf(this.guessChar);
		
		this.frame.setWordShow(temp);
	}
	
	public void attGuessWord(int i) {
		guessChar[i] = guessedChar[i];
		this.temp = String.valueOf(this.guessChar);
		this.frame.setWordShow(temp);
	}
	
}
