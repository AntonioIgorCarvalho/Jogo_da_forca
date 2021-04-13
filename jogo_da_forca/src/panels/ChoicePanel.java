package panels;
import program_interface.Frame;
import program_interface.Button2;

import java.awt.Color;

import javax.swing.JPanel;

import main.Controller;

public class ChoicePanel extends JPanel{
	Frame frame;
	
	/*
	 * Configuring the choice JPanel
	 */
	public ChoicePanel(Frame frame) {
		this.frame = frame;
		Color transparent = new Color(0, 0, 0, 0);
		this.setBounds(0, 0, 1200, 800);
		this.setVisible(true);
		this.setBackground(transparent);
		this.setLayout(null);
		
		this.updateChoicePanel();
	}
	
	/*
	 * Draw the buttons and the enviroment to the choice JPanel
	 */
	public void updateChoicePanel() {
		Button2 music = new Button2("Musica", 40, 100, 200, 200);
		music.addActionListener(e -> Controller.game.checkCurrentArray("music"));
		music.addActionListener(e -> this.frame.setVisible("game"));
		this.add(music);
		
		Button2 countries = new Button2("Paises", 340, 100, 200, 200);
		countries.addActionListener(e -> Controller.game.checkCurrentArray("countries"));
		countries.addActionListener(e -> this.frame.setVisible("game"));
		this.add(countries);
		
		Button2 animals = new Button2("Animais", 640, 100, 200, 200);
		animals.addActionListener(e -> Controller.game.checkCurrentArray("animals"));
		animals.addActionListener(e -> this.frame.setVisible("game"));
		this.add(animals);
		
		Button2 foods = new Button2("Comidas", 940, 100, 200, 200);
		foods.addActionListener(e -> Controller.game.checkCurrentArray("foods"));
		foods.addActionListener(e -> this.frame.setVisible("game"));
		this.add(foods);
		
		Button2 objects = new Button2("Objetos", 40, 450, 200, 200);
		objects.addActionListener(e -> Controller.game.checkCurrentArray("objects"));
		objects.addActionListener(e -> this.frame.setVisible("game"));
		this.add(objects);
		
		Button2 sports = new Button2("Esportes", 340, 450, 200, 200);
		sports.addActionListener(e -> Controller.game.checkCurrentArray("sports"));
		sports.addActionListener(e -> this.frame.setVisible("game"));
		this.add(sports);
		
		Button2 art = new Button2("Arte", 640, 450, 200, 200);
		art.addActionListener(e -> Controller.game.checkCurrentArray("art"));
		art.addActionListener(e -> this.frame.setVisible("game"));
		this.add(art);
		
		Button2 menu = new Button2("Menu", 940, 450, 200, 200);
		menu.addActionListener(e -> this.frame.setVisible("menu"));
		this.add(menu);
		
		this.frame.add(this);
	}

}
