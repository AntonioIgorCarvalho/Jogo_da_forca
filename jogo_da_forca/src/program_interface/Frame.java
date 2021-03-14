package program_interface;
import main.Game;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame{
	Game game;

	// Init
	public Frame(String title, Game game){
		this.game = game;//Game object in order to pass this for the buttons to use the Game functions
		
		int spaceB = 25;
		int spaceX = 50;
		int spaceY = 500;
		int spaceY2 = spaceY  + spaceB + 50;
		
		//Creating buttons
		Button buttonA = new Button("A", (spaceB) + (spaceX), spaceY, game);
		Button buttonB = new Button("B", (spaceB * 2) + (spaceX * 2), spaceY, game);
		Button buttonC = new Button("C", (spaceB * 3) + (spaceX * 3), spaceY, game);
		Button buttonD = new Button("D", (spaceB * 4) + (spaceX * 4), spaceY, game);
		Button buttonE = new Button("E", (spaceB * 5) + (spaceX * 5), spaceY, game);
		Button buttonF = new Button("F", (spaceB * 6) + (spaceX * 6), spaceY, game);
		Button buttonG = new Button("G", (spaceB * 7) + (spaceX * 7), spaceY, game);
		Button buttonH = new Button("H", (spaceB * 8) + (spaceX * 8), spaceY, game);
		Button buttonI = new Button("I", (spaceB * 9) + (spaceX * 9), spaceY, game);
		Button buttonJ = new Button("J", (spaceB * 10) + (spaceX * 10), spaceY, game);
		Button buttonK = new Button("K", (spaceB * 11) + (spaceX * 11), spaceY, game);
		Button buttonL = new Button("L", (spaceB * 12) + (spaceX * 12), spaceY, game);
		Button buttonM = new Button("M", (spaceB * 13) + (spaceX * 13), spaceY, game);
		Button buttonN = new Button("N", (spaceB) + (spaceX), spaceY2, game);
		Button buttonO = new Button("O", (spaceB * 2) + (spaceX * 2), spaceY2, game);
		Button buttonP = new Button("P", (spaceB * 3) + (spaceX * 3), spaceY2, game);
		Button buttonQ = new Button("Q", (spaceB * 4) + (spaceX * 4), spaceY2, game);
		Button buttonR = new Button("R", (spaceB * 5) + (spaceX * 5), spaceY2, game);
		Button buttonS = new Button("S", (spaceB * 6) + (spaceX * 6), spaceY2, game);
		Button buttonT = new Button("T", (spaceB * 7) + (spaceX * 7), spaceY2, game);
		Button buttonU = new Button("U", (spaceB * 8) + (spaceX * 8), spaceY2, game);
		Button buttonV = new Button("V", (spaceB * 9) + (spaceX * 9), spaceY2, game);
		Button buttonW = new Button("W", (spaceB * 10) + (spaceX * 10), spaceY2, game);
		Button buttonX = new Button("X", (spaceB * 11) + (spaceX * 11), spaceY2, game);
		Button buttonY = new Button("Y", (spaceB * 12) + (spaceX * 12), spaceY2, game);
		Button buttonZ = new Button("Z", (spaceB * 13) + (spaceX * 13), spaceY2, game);
		
		this.add(buttonA);
		this.add(buttonB);
		this.add(buttonC);
		this.add(buttonD);
		this.add(buttonE);
		this.add(buttonF);
		this.add(buttonG);
		this.add(buttonH);
		this.add(buttonI);
		this.add(buttonJ);
		this.add(buttonK);
		this.add(buttonL);
		this.add(buttonM);
		this.add(buttonN);
		this.add(buttonO);
		this.add(buttonP);
		this.add(buttonQ);
		this.add(buttonR);
		this.add(buttonS);
		this.add(buttonT);
		this.add(buttonU);
		this.add(buttonV);
		this.add(buttonW);
		this.add(buttonX);
		this.add(buttonY);
		this.add(buttonZ);
		
		this.setTitle(title); // Title
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(1200,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white);
		
		
	}
	
}
