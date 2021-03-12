package main;

public class Game {
	
	Player player;
	Word word;
	
	// Init
	public Game (Player player, Word word) {
		this.player = player;
		this.word = word;
	}
	
	//When round starts
	public void StartGame() {
		this.player.setLife(4);
		this.player.setScore(0);
	}
	
	//When the player pick a letter
	public void LetterChoice(char letter) {
		if(this.word.letterCheck(letter) == true) {
			//Shows the letter
		}
		else {
			this.player.setLife(this.player.getLife() - 1); //Lose 1 life point
		}
		
		// Game over
		if(this.player.getLife() <= -1) {
			System.out.println("Game over");
		}
		
		// Win!
		if(this.player.getScore() == this.word.getLenght()) {
			System.out.println("You Win");
		}
	}
	
}
