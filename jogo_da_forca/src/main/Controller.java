package main;
import program_interface.Frame;

/*
 * The Controller class was created to manage the choice of the words to guess, will be used in a better coding in the future version
 */
public class Controller {
	
	public static Game game;
	protected Frame frame;
	
	public Controller(Game game, Frame frame) {
		Controller.game = game;
		this.frame = frame;
	}

}

