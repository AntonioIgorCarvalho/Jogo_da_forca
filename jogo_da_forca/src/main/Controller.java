package main;
import program_interface.Frame;

/*
 * The Controller class was created to manage the choice of the words to guess
 */
public class Controller {
	
	public static Game game;
	public static Data data;
	protected Frame frame;
	
	public Controller(Game game, Data data, Frame frame) {
		Controller.game = game;
		Controller.data = data;
		this.frame = frame;
	}

}