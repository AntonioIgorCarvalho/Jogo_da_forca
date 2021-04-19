package buttons;
import main.Controller;
import javax.swing.JButton;

/**
 * Class created to the letter buttons from A to Z
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class LetterButton extends JButton {

	/**
	 * Takes the params and create a button with the position on the frame but the size is fixed
	 * @param title title of the button
	 * @param x horizontal position of the button
	 * @param y vertical position of the button
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
