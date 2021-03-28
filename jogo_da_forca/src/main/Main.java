package main;
import program_interface.Frame;
import java.util.ArrayList;


public class Main {
	
	public static void main(String args[]) {
		
		Player player = new Player();
		Game game = new Game(player);
		Data data = new Data();
		Frame frame = new Frame("Jogo");
		
		new Controller(game, data, frame);//Set the controller
		Controller.game.setWord(Controller.data.music.get(0));
		Controller.game.setFrame(frame);//Add frame as parameter to game
		
	}

}