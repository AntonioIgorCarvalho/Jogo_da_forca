package main;

//Word class is the responsable for the words in the game
public class Word {
	
	private String text; // Content of the word
	private String tip; // Tip for guessing
	private String type; // Type of the word
	private int lenght; // Lenght of the word
	
	// Constructor
	public Word(String text, String tip, String type) {
		this.setText(text);
		this.setTip(tip);
		this.setType(type);
		this.setLenght();
	}
	
	/*
	 * letterCheck
	 * Takes a char and compares to see if this char is in the string
	 */
	protected boolean letterCheck(char letter) {
		for(int i = 0; i < this.lenght; i++) {
			if(this.text.charAt(i) == letter) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * letterCheckIndex
	 * Takes a letter and return the index, return -1 if its not there
	 */
	protected int letterCheckIndex(char letter){
		for(int i = 0; i < this.lenght; i++) {
			if(this.text.charAt(i) == letter) {
				return i;
			}
		}
		return -1;
	}
	
	// Getters and setters
	protected String getText() {
		return text;
	}
	protected void setText(String text) {
		this.text = text;
	}
	protected String getTip() {
		return tip;
	}
	protected void setTip(String tip) {
		this.tip = tip;
	}
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
	protected int getLenght() {
		return lenght;
	}
	protected void setLenght() {
		this.lenght = this.text.length();
	}
	
	
}
