package main;

import java.util.ArrayList;

public class Data {

	public ArrayList<Word> countries = new ArrayList<Word>();
	public ArrayList<Word> animals = new ArrayList<Word>();
	public ArrayList<Word> foods = new ArrayList<Word>();
	public ArrayList<Word> objects = new ArrayList<Word>();
	public ArrayList<Word> sports = new ArrayList<Word>();
	public ArrayList<Word> music = new ArrayList<Word>();
	public ArrayList<Word> art = new ArrayList<Word>();
	
	public Data() {
		Word brasil = new Word("BRASIL","De todos os países, é o único que disputou todas as copas do mundo","paises");
		this.countries.add(brasil);
		
		Word cachorro = new Word("CACHORRO","É um dos melhores amigos do ser humano","animais");
		this.animals.add(cachorro);
		
		Word batata = new Word("BATATA","É uma grande fonte de carboidratos","comidas");
		this.foods.add(batata);
		
		Word abajur = new Word("ABAJUR","É um bom utensilio para ler","objects");
		this.objects.add(abajur);
		
		Word golf = new Word("GOLF","Tiger Woods aprova","sports");
		this.sports.add(golf);
		
		Word ozzy_osbourne = new Word("OZZY_OSBOURNE","Ja mordeu um morcego","music");
		Word kurt_cobain = new Word("KURT_COBAIN","Uma das capas de seus albums é a foto de seu filho submerso","music");
		this.music.add(ozzy_osbourne);
		this.music.add(kurt_cobain);
		
		Word mona_lisa = new Word("MONA_LISA","Mais famosa impossivel","art");
		this.art.add(mona_lisa);
		
	}
	
	/*
	 * Get a random item on the list
	 */
	public Word randomMusic() {
		int aux = (int) (Math.random() * this.music.size());
		return this.music.get(aux);
	}
	
}
