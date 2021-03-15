package program_interface;
import main.Game;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{

	Label wordShow = new Label(75, 200, 400, 400);

	// Init
	public Frame(String title){

		drawButtons();
		
		this.setTitle(title); // Title
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(1200,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white);
		
		
		this.add(wordShow);
	}
	
	private void drawButtons() {
		int spaceX = 50;
		int spaceY = 500;	
		
		//Creating letter buttons from A to Z
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

	public void setWordShow(String text) {
		this.wordShow.setText(text);
		this.wordShow.setVisible(true);
	}
	
}
