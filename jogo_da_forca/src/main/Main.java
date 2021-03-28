package main;
import program_interface.Frame;
import java.util.ArrayList;


public class Main {
	/*
	 * newGame
	 * Call this function when a new game starts
	 */
	public static void newGame(Word word) {
		Controller.game.startGame(word);
	}
	
	

	public static void main(String args[]) {

		ArrayList<Word> countries = new ArrayList<Word>();
		ArrayList<Word> animals = new ArrayList<Word>();
		ArrayList<Word> foods = new ArrayList<Word>();
		ArrayList<Word> objects = new ArrayList<Word>();
		ArrayList<Word> sports = new ArrayList<Word>();
		ArrayList<Word> music = new ArrayList<Word>();
		ArrayList<Word> art = new ArrayList<Word>();
		
		Word brasil = new Word("BRASIL","De todos os países, é o único que disputou todas as copas do mundo","paises");//Word for the game
		Word cachorro = new Word("CACHORRO","É um dos melhores amigos do ser humano","animais");//Word for the game
		Word batata = new Word("BATATA","É uma grande fonte de carboidratos","comidas");//Word for the game
		Word abajur = new Word("ABAJUR","É um bom utensilio para ler","objects");//Word for the game
		Word golf = new Word("GOLF","Tiger Woods aprova","sports");//Word for the game
		Word ozzy_osbourne = new Word("OZZY_OSBOURNE","Ja mordeu um morcego","music");//Word for the game
		Word mona_lisa = new Word("MONA_LISA","Mais famosa impossivel","art");//Word for the game
		

		countries.add(brasil);
		animals.add(cachorro);
		foods.add(batata);
		objects.add(abajur);
		sports.add(golf);
		music.add(ozzy_osbourne);
		art.add(mona_lisa);
		

		Player player = new Player();
		Game game = new Game(player);
		Frame frame = new Frame("Jogo");
		
		new Controller(game, frame);//Set the controller
		newGame(music.get(0));
		Controller.game.setFrame(frame);//Add frame as parameter to game
		
	}

}