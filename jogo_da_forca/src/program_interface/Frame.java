package program_interface;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame{

	// Init
	Frame(String title){
		
		Button button = new Button("A", 100, 500);
		
		this.add(button);
		
		this.setTitle(title); // Title
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button shut down the program
		this.setResizable(false);
		this.setSize(1200,800); // Size of the window
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white);
		
		
	}
	
}
