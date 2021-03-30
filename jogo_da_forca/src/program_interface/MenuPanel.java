package program_interface;

import java.awt.Color;

import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	Frame frame;

	protected MenuPanel(Frame frame) {
		this.frame = frame;
		Color transparent = new Color(0, 0, 0, 0);
		this.setBounds(0, 0, 1200, 800);
		this.setVisible(true);
		this.setBackground(transparent);
		this.setLayout(null);
		
		this.updateMenuPanel();
	}
	
	public void updateMenuPanel() {
		
		Button2 start = new Button2("Jogar", 500, 100, 200, 200);
		start.addActionListener(e -> this.frame.setVisibleChoice());
		this.add(start);
		
		Button2 scores = new Button2("Progresso", 500, 400, 200, 200);
		scores.addActionListener(e -> this.frame.setVisibleScore());
		this.add(scores);
		
		this.frame.add(this);
	}
	
}
