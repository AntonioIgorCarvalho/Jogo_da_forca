package main;

/**
 * Class created to store the information about the player when guessing a word
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class Player {
	
	/**
	 * The life and score, when a new game starts the values are reseted
	 */
	private int life;
	private int score;
	
	/**
	 * Constructor
	 */
	public Player () {
		
	}
	
	/**
	 * life getter
	 * @return life
	 */
	protected int getLife() {
		return life;
	}
	
	/**
	 * life setters
	 * @param life
	 */
	protected void setLife(int life) {
		this.life = life;
	}
	
	/**
	 * score getter
	 * @return score
	 */
	protected int getScore() {
		return score;
	}
	
	/**
	 * score setter
	 * @param score
	 */
	protected void setScore(int score) {
		this.score = score;
	}

}
