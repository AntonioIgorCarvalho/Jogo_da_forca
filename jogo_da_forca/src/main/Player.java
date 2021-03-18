package main;

public class Player {
	
	/*
	 * The life and score its only for one round
	 */
	private int life;
	private int score;
	
	// Init
	public Player () {
		
	}
	
	// Getters and setters
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
