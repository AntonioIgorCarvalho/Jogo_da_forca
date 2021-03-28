package main;
import program_interface.Frame;

/*
 * The Controller class was created to manage the choice of the words to guess, will be used in a better coding in the future version
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