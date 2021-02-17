package program_interface;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame{

	Frame(String titulo){
		this.setTitle(titulo); // Title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(800,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white);
	}
	
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(800,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white);
	}
	
}
