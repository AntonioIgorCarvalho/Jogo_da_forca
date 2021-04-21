package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Data;
import main.Word;

class DataTest {
	Data data = new Data();
	private ArrayList<Word> music = new ArrayList<Word>();
	private ArrayList<Word> countries = new ArrayList<Word>();
	private ArrayList<Word> animals = new ArrayList<Word>();
	
	@Test
	void testRandomChoice() {
		Word brasil = new Word("BRASIL","De todos os países, é o único que disputou todas as copas do mundo","countries");
		this.countries.add(brasil);
		Word ozzy_osbourne = new Word("OZZY_OSBOURNE","Ja mordeu um morcego","music");
		this.music.add(ozzy_osbourne);
		Word cachorro = new Word("CACHORRO","E um dos melhores amigos do ser humano","animals");
		this.animals.add(cachorro);
		
		assertEquals(data.randomChoice(countries),countries.get(0));
		assertEquals(data.randomChoice(music),music.get(0));
		assertEquals(data.randomChoice(animals),animals.get(0));
		assertEquals(data.randomChoice(countries),data.randomChoice(countries));
		assertEquals(data.randomChoice(music),data.randomChoice(music));
		assertEquals(data.randomChoice(animals),data.randomChoice(animals));
		assertNotEquals(data.randomChoice(music),data.randomChoice(countries));
		assertNotEquals(data.randomChoice(music),data.randomChoice(animals));
		assertNotEquals(data.randomChoice(animals),data.randomChoice(countries));
	}

}
