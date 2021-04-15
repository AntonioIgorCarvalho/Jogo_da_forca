package buttons;
import main.Controller;
import javax.swing.JButton;

public class LetterButton extends JButton {

	/*
	 * Class created to the letter buttons from A to Z
	 */
	public LetterButton(Character title, int x, int y){
	
	this.setBounds(x, y, 50, 50);
	this.setText(title.toString());
	this.setVisible(true);
	this.setFocusable(false);
	this.addActionListener(e -> Controller.game.letterChoice(title));//Action when the button is clicked
	this.addActionListener(e -> this.setEnabled(false));//Action when the button is clicked
	
	}

	}
