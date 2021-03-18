package program_interface;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frame extends JFrame{

	Label wordShow = new Label(75, 200, 1000, 400);
	Label lifeShow = new Label(75, 200, 1000, 200, 48);

	// Init
	public Frame(String title){
		
		//Creating buttons
		Button2 buttonTip = new Button2("DICA", 75, 100);
		this.add(buttonTip);
		drawButtons();
		
		this.setTitle(title); // Title
		this.setLayout(null);// Free layout
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(1200,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white); //Background color
		
		//Adding labels
		this.add(wordShow);
		this.add(lifeShow);
		
	}
	
	/*
	 * Creating button letters from A to Z and adding them on the frame
	 */
	private void drawButtons() {
		int spaceX = 50;
		int spaceY = 500;	
		
		int aux = 1;
		for(int i = 65; i < 91; i++) {

			Button button = new Button((char) i, (25 + spaceX ) * aux, spaceY);
			aux++;
			if(aux == 14) {
				spaceY += 25 + 50;
				aux = 1;
			}
			this.add(button);
		}
		
	}

	/*
	 * setter of the wordshow
	 */
	public void setWordShow(String text) {
		this.wordShow.setText(text);
		this.wordShow.setVisible(true);
	}
	
	public void setLifeShow(int life) {
		this.lifeShow.setText("Vidas restantes: " + life);
		this.lifeShow.setVisible(true);
	}
	
	/*
	 * Show the current tip for the player
	 */
	public void tipShow(String tip) {
		JOptionPane.showMessageDialog(this, tip);
	}
	
}
