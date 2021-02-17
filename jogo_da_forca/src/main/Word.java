package main;

public class Word {
	
	private String text; // Content of the word
	private String tip; // Tip for guessing
	private String type; // Type of the word
	private int lenght; // Lenght of the world
	
	// Init
	public Word(String text, String tip, String type, int lenght) {
		this.setText(text);
		this.setTip(tip);
		this.setType(type);
		this.setLenght(lenght);
	}
	
	// Init
	public Word() {
		
	}
	
	// Getters and setters
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	
}
