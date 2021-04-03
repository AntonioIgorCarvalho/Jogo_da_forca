package main;

import java.util.ArrayList;

public class Data {

	public ArrayList<Word> music = new ArrayList<Word>();
	public ArrayList<Word> countries = new ArrayList<Word>();
	public ArrayList<Word> animals = new ArrayList<Word>();
	public ArrayList<Word> foods = new ArrayList<Word>();
	public ArrayList<Word> objects = new ArrayList<Word>();
	public ArrayList<Word> sports = new ArrayList<Word>();
	public ArrayList<Word> art = new ArrayList<Word>();
	
	public Data() {
		
		Word ozzy_osbourne = new Word("OZZY_OSBOURNE","Ja mordeu um morcego","musicas");
		Word kurt_cobain = new Word("KURT_COBAIN","Uma das capas de seus albums é a foto de seu filho submerso","musicas");
		Word megadeth = new Word("MEGADETH","O fundador da banda foi expulso de outra ants de fundar sua propria","musicas");
		this.music.add(ozzy_osbourne);
		this.music.add(kurt_cobain);
		this.music.add(megadeth);
		
		Word brasil = new Word("BRASIL","De todos os países, é o único que disputou todas as copas do mundo","paises");
		this.countries.add(brasil);
		
		Word cachorro = new Word("CACHORRO","É um dos melhores amigos do ser humano","animais");
		this.animals.add(cachorro);
		
		Word batata = new Word("BATATA","É uma grande fonte de carboidratos","comidas");
		this.foods.add(batata);
		
		Word abajur = new Word("ABAJUR","É um bom utensilio para ler","objetos");
		this.objects.add(abajur);
		
		Word golf = new Word("GOLF","Tiger Woods aprova","esportes");
		this.sports.add(golf);
		
		Word mona_lisa = new Word("MONA_LISA","Mais famosa impossivel","art");
		this.art.add(mona_lisa);
		
	}
	
	/*
	 * Get a random item on the list
	 */
	public Word randomChoice(ArrayList<Word> target) {
		int aux = (int) (Math.random() * target.size());
		return target.get(aux);
	}
	
	/*
	 * User insert the info and create a new word
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
