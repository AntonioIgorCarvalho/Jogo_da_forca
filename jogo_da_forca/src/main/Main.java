package main;
import program_interface.Frame;

public class Main {
	/*
	 * This main class is created only for test purpose, the two 'A' in BRAASIL is to test the function to detect the same letter in a single word
	 */

	public static void main(String args[]) {

		Word brasil = new Word("BRAASIL","De todos os países, é o único que disputou todas as copas do mundo","paises");//Word for the game

		Player player = new Player();
		Game game = new Game(player, brasil);
		Frame frame = new Frame("Jogo");
		
		game.setFrame(frame);//Add frame as parameter to game

		new Controller(game, frame);//Set the controller
		
		Controller.game.setWord(brasil);
		Controller.game.startGame();
	}

}