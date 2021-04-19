package panels;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.Button2;
import program_interface.Frame;

/**
 * Menu JPanel
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class MenuPanel extends JPanel{
	Frame frame;

	/**
	 * Constructor
	 * @param frame
	 */
	public MenuPanel(Frame frame) {
		this.frame = frame;
		Color transparent = new Color(0, 0, 0, 0);
		this.setBounds(0, 0, 1200, 800);
		this.setVisible(true);
		this.setBackground(transparent);
		this.setLayout(null);
		
		this.updateMenuPanel();
	}

	/**
	 * Draw the buttons to the MenuPanel
	 */
	public void updateMenuPanel() {
		
		Button2 start = new Button2("Jogar", 500, 100, 200, 200);
		start.addActionListener(e -> this.frame.setVisible("choice"));
		this.add(start);
		
		Button2 scores = new Button2("Progresso", 500, 400, 200, 200);
		scores.addActionListener(e -> this.frame.setVisible("score"));
		this.add(scores);
		
		Button2 newWord = new Button2("Nova Palavra", 900, 400, 200, 200);
		newWord.addActionListener(e -> this.frame.setVisible("newWord"));
		this.add(newWord);
		
		this.frame.add(this);
	}
	
}
