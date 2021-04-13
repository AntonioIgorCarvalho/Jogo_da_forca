package panels;

import java.awt.Color;

import javax.swing.JPanel;

import program_interface.Button2;
import program_interface.Frame;
import program_interface.Label;

public class NewWordPanel extends JPanel{
	private Frame frame;
	
	/*
	 * Configuring the NewWord JPanel
	 */
	public NewWordPanel(Frame frame) {
		this.frame = frame;
		Color transparent = new Color(0, 0, 0, 0);
		this.setBounds(0, 0, 1200, 800);
		this.setBackground(transparent);
		this.setLayout(null);
	}
	
	public void updateNewWordPanel() {
		
		Label instruction = new Label(40, 0, 1200, 100, 40);
		instruction.setVisible(true);
		instruction.setText("Selecione a categoria da palavra a ser adicionada");
		this.add(instruction);
		
		Button2 menu = new Button2("Menu", 940, 450, 200, 200);
		menu.addActionListener(e -> this.frame.setVisible("menu"));
		this.add(menu);
		
		Button2 music = new Button2("Musica", 40, 100, 200, 200);
		music.addActionListener(e -> this.frame.setVisible("write"));
		music.addActionListener(e -> this.frame.getWrite().updateWritePanel("music"));
		this.add(music);
		
		Button2 countries = new Button2("Paises", 340, 100, 200, 200);
		countries.addActionListener(e -> this.frame.setVisible("write"));
		countries.addActionListener(e -> this.frame.getWrite().updateWritePanel("countries"));
		this.add(countries);
		
		Button2 animals = new Button2("Animais", 640, 100, 200, 200);
		animals.addActionListener(e -> this.frame.setVisible("write"));
		animals.addActionListener(e -> this.frame.getWrite().updateWritePanel("animals"));
		this.add(animals);
		
		Button2 foods = new Button2("Comidas", 940, 100, 200, 200);
		foods.addActionListener(e -> this.frame.setVisible("write"));
		foods.addActionListener(e -> this.frame.getWrite().updateWritePanel("foods"));
		this.add(foods);
		
		Button2 objects = new Button2("Objetos", 40, 450, 200, 200);
		objects.addActionListener(e -> this.frame.setVisible("write"));
		objects.addActionListener(e -> this.frame.getWrite().updateWritePanel("objects"));
		this.add(objects);
		
		Button2 sports = new Button2("Esportes", 340, 450, 200, 200);
		sports.addActionListener(e -> this.frame.setVisible("write"));
		sports.addActionListener(e -> this.frame.getWrite().updateWritePanel("sports"));
		this.add(sports);
		
		Button2 art = new Button2("Arte", 640, 450, 200, 200);
		art.addActionListener(e -> this.frame.setVisible("write"));
		art.addActionListener(e -> this.frame.getWrite().updateWritePanel("art"));
		this.add(art);
		
		this.frame.add(this);
		
	}

}
