package program_interface;
import main.Controller;
import javax.swing.JButton;

public class Button extends JButton {

	public Button(Character title, int x, int y){
	
	this.setBounds(x, y, 50, 50);
	this.setText(title.toString());
	this.setVisible(true);
	this.setFocusable(false);
	this.addActionListener(e -> Controller.game.letterChoice(title));//Action when the button is clicked
	this.addActionListener(e -> this.setEnabled(false));//Action when the button is clicked
	
	}

	}
