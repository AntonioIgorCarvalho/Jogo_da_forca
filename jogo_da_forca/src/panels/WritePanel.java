package panels;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buttons.Button2;
import labels.Label;
import main.Controller;
import program_interface.Frame;

/**
 * JPanel when the player is writing a new word
 * @author Antonio Igor Carvalho
 * @version 1.0 (April 2021)
 */
public class WritePanel extends JPanel {
	private Frame frame;
	private String text;
	private String tip;
	private String type;
	
	/**
	 * Constructor
	 * @param frame
	 */
	public WritePanel(Frame frame) {
		this.frame = frame;
		Color transparent = new Color(0, 0, 0, 0);
		this.setBounds(0, 0, 1200, 800);
		this.setBackground(transparent);
		this.setLayout(null);
	}
	
	/**
	 * Configure the interface of the WritePanel
	 * @param type
	 */
	public void updateWritePanel(String type) {
		this.removeAll();
		this.type = type;
		
		Label instruction = new Label(100, 0, 1200, 100, 40);
		instruction.setVisible(true);
		instruction.setText("Use sempre letra maiuscula na palavra. Use '_' para espaco");
		this.add(instruction);
		
		Label instruction2 = new Label(100, 60, 1000, 100, 40);
		instruction2.setVisible(true);
		instruction2.setText("Exemplo: KURT_COBAIN");
		this.add(instruction2);
		
		Label textLabel = new Label(100, 130, 1000, 100, 20);
		textLabel.setVisible(true);
		textLabel.setText("Insira a nova palavra abaixo: (MAXIMO 16 LETRAS INCLUINDO ESPACO)");
		this.add(textLabel);
		
		JTextField text = new JTextField(16);
		text.setBounds(100, 200, 120, 40);
		text.setVisible(true);
		this.add(text);
		
		Label instructionTip = new Label(100, 300, 1200, 100, 40);
		instructionTip.setVisible(true);
		instructionTip.setText("A dica pode ser escrita normalmente (Nao use acentos)");
		this.add(instructionTip);
		
		Label instructionTip2 = new Label(100, 360, 1000, 100, 40);
		instructionTip2.setVisible(true);
		instructionTip2.setText("Exemplo de dica: Nasceu nos Estados Unidos");
		this.add(instructionTip2);
		
		Label instructionTip3 = new Label(100, 430, 1200, 100, 20);
		instructionTip3.setVisible(true);
		instructionTip3.setText("Insira a dica abaixo: (MAXIMO NAO DEFINIDO POREM SEJA BREVE NAS DICAS)");
		this.add(instructionTip3);
		
		JTextField tip = new JTextField(16);
		tip.setBounds(100, 500, 120, 40);
		tip.setVisible(true);
		this.add(tip);
		
		Button2 submit = new Button2("Gravar Palavra", 100, 550, 200, 200);
		submit.addActionListener(e -> this.setTwo(text.getText(), tip.getText()));
		submit.addActionListener(e -> this.frame.setVisible("menu"));
		this.add(submit);
		
		this.frame.add(this);
	}
	
	/**
	 * type setter
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Take the users input and checks if the Strings are acceptable
	 * If one of these steps are true the word is rejected:
	 * (1) If the lenght is 0
	 * (2) If the lenght is more then 16
	 * (3) If the letters are not UpperCase or '_'
	 * @param text
	 * @param tip
	 */
	private void setTwo(String text, String tip){
		this.text = text;
		this.tip = tip;
		
		int check = 1;
		int finalCheck = 1;
		
		if(text.length() == 0 || tip.length() == 0 || text.length() > 16) {
			JOptionPane.showMessageDialog(this.frame, "Dados invalidos, a nova palavra não foi cadastrada");
			return;
		}

		
		//Checks if the letters are all UpperCase or '_'
		for(int i = 0; i < text.length(); i++) {
			
			if(check == 0) {
				finalCheck = 0;
				break;
			}
			
			check = 0;
			
			if(text.charAt(i) == '_') {
				check = 1;
			}else {
				for(int j = 65; j < 91; j++) {
					if(text.charAt(i) == (char) j) {
						check = 1;
					}
				}	
			}
		}
		
		if(finalCheck == 1) {
			Controller.data.newWord(this.text, this.tip, this.type);
			JOptionPane.showMessageDialog(this.frame, "Cadastrado com sucesso");
		} else {
			JOptionPane.showMessageDialog(this.frame, "Dados invalidos, a nova palavra não foi cadastrada");
		}
		
	}
}
