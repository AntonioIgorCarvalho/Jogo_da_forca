package main;
import program_interface.Frame;


public class Main {
	/*
	 * newGame
	 * Call this function when a new game starts
	 */
	public static void newGame(Word word) {
		Controller.game.startGame(word);
	}

	public static void main(String args[]) {

		Word brasil = new Word("BRASIL","De todos os pa�ses, � o �nico que disputou todas as copas do mundo","paises");//Word for the game
		Word brasil2 = new Word("BRAAASIL","De todos os pa�ses, � o �nico que disputou todas as copas do mundo","paises");//Word for the game

		Player player = new Player();
		Game game = new Game(player);
		Frame frame = new Frame("Jogo");
		
		new Controller(game, frame);//Set the controller
		newGame(brasil);
		Controller.game.setFrame(frame);//Add frame as parameter to game
		
	}

}