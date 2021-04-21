package main;

/**
 * Class responsable for the words in the game
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class Word {
	/*
	 * text is the content of the word
	 * type is the type of the word
	 * lenght is the lenght of the word
	 */
	private String text;
	private String tip;
	private String type;
	private int lenght;
	
	/**
	 * Constructor
	 * @param text
	 * @param tip
	 * @param type
	 */
	public Word(String text, String tip, String type) {
		this.setText(text);
		this.setTip(tip);
		this.setType(type);
		this.setLenght();
	}
	
	/**
	 * Takes a char and compares to see if this char is in the string
	 * @param letter
	 * @return
	 */
	public boolean letterCheck(char letter) {
		for(int i = 0; i < this.lenght; i++) {
			if(this.text.charAt(i) == letter) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Takes a letter and return the index, return -1 if its not there
	 * @param letter
	 * @return
	 */
	public int letterCheckIndex(char letter){
		for(int i = 0; i < this.lenght; i++) {
			if(this.text.charAt(i) == letter) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * text getter
	 * @return text
	 */
	protected String getText() {
		return text;
	}
	/**
	 * text setter
	 * @param text
	 */
	protected void setText(String text) {
		this.text = text;
	}
	/**
	 * tip getter
	 * @return tip
	 */
	protected String getTip() {
		return tip;
	}
	/**
	 * tip setter
	 * @param tip
	 */
	protected void setTip(String tip) {
		this.tip = tip;
	}
	/**
	 * type getter
	 * @return type
	 */
	protected String getType() {
		return type;
	}
	/**
	 * type setter
	 * @param type
	 */
	protected void setType(String type) {
		this.type = type;
	}
	/**
	 * lenght getter
	 * @return lenght
	 */
	protected int getLenght() {
		return lenght;
	}
	/**
	 * lenght setter
	 */
	protected void setLenght() {
		this.lenght = this.text.length();
	}
	
}
