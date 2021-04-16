package main;

import java.util.ArrayList;
/*
 * The Data class has all the words for the game to work
 * The ArrayLists is where these words are stored
 * currentIndex -> Used to know which word index the player is current playing
 * currentWord -> Used to know which type of word the player is current playing
 */
public class Data {

	protected ArrayList<Word> music = new ArrayList<Word>();
	protected ArrayList<Word> countries = new ArrayList<Word>();
	protected ArrayList<Word> animals = new ArrayList<Word>();
	protected ArrayList<Word> foods = new ArrayList<Word>();
	protected ArrayList<Word> objects = new ArrayList<Word>();
	protected ArrayList<Word> sports = new ArrayList<Word>();
	protected ArrayList<Word> art = new ArrayList<Word>();
	
	private int currentIndex;
	private Word currentWord;
	
	public Data() {
		
		Word ozzy_osbourne = new Word("OZZY_OSBOURNE","Ja mordeu um morcego","music");
		Word kurt_cobain = new Word("KURT_COBAIN","Uma das capas de seus albums é a foto de seu filho submerso","music");
		Word megadeth = new Word("MEGADETH","O fundador da banda foi expulso de outra ants de fundar sua propria","music");
		this.music.add(ozzy_osbourne);
		this.music.add(kurt_cobain);
		this.music.add(megadeth);
		
		Word brasil = new Word("BRASIL","De todos os países, é o único que disputou todas as copas do mundo","countries");
		this.countries.add(brasil);
		
		Word cachorro = new Word("CACHORRO","É um dos melhores amigos do ser humano","animals");
		this.animals.add(cachorro);
		
		Word batata = new Word("BATATA","É uma grande fonte de carboidratos","foods");
		this.foods.add(batata);
		
		Word abajur = new Word("ABAJUR","É um bom utensilio para ler","objects");
		this.objects.add(abajur);
		
		Word golf = new Word("GOLF","Tiger Woods aprova","sports");
		this.sports.add(golf);
		
		Word mona_lisa = new Word("MONA_LISA","Mais famosa impossivel","art");
		this.art.add(mona_lisa);
		
	}
	
	/*
	 * Get a random item on the list
	 */
	protected Word randomChoice(ArrayList<Word> target) {
		int aux = (int) (Math.random() * target.size());
		this.currentIndex = aux;
		this.currentWord = target.get(aux);
		return target.get(aux);
	}
	
	/*
	 * deleteWhenWin
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
	
	/*
	 * newWord
	 * Receive the info and create a new word
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
