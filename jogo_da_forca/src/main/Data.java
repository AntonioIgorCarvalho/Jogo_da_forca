package main;

import java.util.ArrayList;
/**
 * The Data class has all the words for the game to work
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class Data {
	
	/*
	 * The ArrayLists is where these words are stored
	 * currentIndex is Used to know which word index the player is current playing
	 * currentWord is Used to know which type of word the player is current playing 
	 */
	protected ArrayList<Word> music = new ArrayList<Word>();
	protected ArrayList<Word> countries = new ArrayList<Word>();
	protected ArrayList<Word> animals = new ArrayList<Word>();
	protected ArrayList<Word> foods = new ArrayList<Word>();
	protected ArrayList<Word> objects = new ArrayList<Word>();
	protected ArrayList<Word> sports = new ArrayList<Word>();
	protected ArrayList<Word> art = new ArrayList<Word>();
	
	private int currentIndex;
	private Word currentWord;
	
	/**
	 * Data to make the program testable
	 */
	public Data() {
		
		Word ozzy_osbourne = new Word("OZZY_OSBOURNE","Ja mordeu um morcego","music");
		Word kurt_cobain = new Word("KURT_COBAIN","Uma das capas de seus albums e a foto de seu filho submerso","music");
		Word megadeth = new Word("MEGADETH","O fundador da banda foi expulso de outra antes de fundar sua propria","music");
		this.music.add(ozzy_osbourne);
		this.music.add(kurt_cobain);
		this.music.add(megadeth);
		
		Word brasil = new Word("BRASIL","De todos os países, é o único que disputou todas as copas do mundo","countries");
		this.countries.add(brasil);
		
		Word cachorro = new Word("CACHORRO","E um dos melhores amigos do ser humano","animals");
		this.animals.add(cachorro);
		
		Word batata = new Word("BATATA","E uma grande fonte de carboidratos","foods");
		this.foods.add(batata);
		
		Word abajur = new Word("ABAJUR","E um bom utensilio para ler","objects");
		this.objects.add(abajur);
		
		Word golf = new Word("GOLF","Tiger Woods aprova","sports");
		this.sports.add(golf);
		
		Word mona_lisa = new Word("MONA_LISA","Mais famosa impossivel","art");
		this.art.add(mona_lisa);
		
	}
	
	/**
	 * Get a random item on the list
	 * @param target the current ArrayList to get a random word
	 * @return a random word on the target ArrayList
	 */
	protected Word randomChoice(ArrayList<Word> target) {
		int aux = (int) (Math.random() * target.size());
		this.currentIndex = aux;
		this.currentWord = target.get(aux);
		return target.get(aux);
	}
	
	/**
	 * Deletes the word that the player guessed (To avoid a person to guess the same word two times)
	 */
	protected void deleteWhenWin() {
		if(this.currentWord.getType() == "music") {
			this.music.remove(this.currentIndex);
			return;
		}
		if(this.currentWord.getType() == "countries") {
			this.countries.remove(this.currentIndex);
			return;
		}
		if(this.currentWord.getType() == "animals") {
			this.animals.remove(this.currentIndex);
			return;
		}
		if(this.currentWord.getType() == "foods") {
			this.foods.remove(this.currentIndex);
			return;
		}
		if(this.currentWord.getType() == "objects") {
			this.objects.remove(this.currentIndex);
			return;
		}
		if(this.currentWord.getType() == "sports") {
			this.sports.remove(this.currentIndex);
			return;
		}
		if(this.currentWord.getType() == "art") {
			this.art.remove(this.currentIndex);
			return;
		}
	}
	
	/**
	 * Receive the info and create a new word
	 * @param text the new word text
	 * @param tip the new word tip
	 * @param type the new word type identifier
	 */
	public void newWord(String text, String tip, String type) {
		if(type == "music") {
			this.music.add(new Word(text, tip, type));
			return;
		}
		if(type == "countries") {
			this.countries.add(new Word(text, tip, type));
			return;
		}
		if(type == "animals") {
			this.animals.add(new Word(text, tip, type));
			return;
		}
		if(type == "foods") {
			this.foods.add(new Word(text, tip, type));
			return;
		}
		if(type == "objects") {
			this.objects.add(new Word(text, tip, type));
			return;
		}
		if(type == "sports") {
			this.sports.add(new Word(text, tip, type));
			return;
		}
		if(type == "art") {
			this.art.add(new Word(text, tip, type));
			return;
		}
	}
	
}
