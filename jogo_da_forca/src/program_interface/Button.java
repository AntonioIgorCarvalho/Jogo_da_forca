package program_interface;
import main.Game;
import javax.swing.JButton;

public class Button extends JButton {
	Game game;

	public Button(String title, int x, int y, Game game){
	this.game = game;
	
	this.setBounds(x, y, 50, 50);
	this.setText(title);
	this.setVisible(true);
	this.setFocusable(false);
	this.addActionListener(e -> this.game.letterChoice(title.charAt(0)));//Action when the button is clicked
	this.addActionListener(e -> this.setEnabled(false));//Action when the button is clicked
	
	}
}