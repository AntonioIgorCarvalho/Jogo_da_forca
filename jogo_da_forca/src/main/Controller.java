package main;
import program_interface.Frame;

public class Controller {
	
	public static Game game;
	Frame frame;
	
	public Controller(Game game, Frame frame) {
		Controller.game = game;
		this.frame = frame;
	}

}

