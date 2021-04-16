package main;

public class Player {
	
	/*
	 * The life and score its only for one round
	 */
	private int life;
	private int score;
	
	// Constructor
	public Player () {
		
	}
	
	// Getters and setters
	protected int getLife() {
		return life;
	}
	protected void setLife(int life) {
		this.life = life;
	}
	protected int getScore() {
		return score;
	}
	protected void setScore(int score) {
		this.score = score;
	}

}
