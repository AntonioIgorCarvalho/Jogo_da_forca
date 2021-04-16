package main;
import program_interface.Frame;

/*
 * The Controller class was created to make easier to acess the program functions
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