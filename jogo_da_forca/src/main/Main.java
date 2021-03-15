package main;
import program_interface.Frame;

public class Main {

	public static void main(String args[]) {

		Word brasil = new Word("BRASIL","De todos os pa�ses, � o �nico que disputou todas as copas do mundo","paises");//Word for the game

		Player player = new Player();
		Game game = new Game(player, brasil);
		Frame frame = new Frame("Jogo");
		game.setFrame(frame);//Add frame as parameter to game

		Controller controller = new Controller(game, frame);//Set the controller
		
		controller.game.setWord(brasil);
		controller.game.StartGame();
	}

}