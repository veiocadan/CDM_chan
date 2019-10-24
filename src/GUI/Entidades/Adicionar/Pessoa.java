package GUI.Entidades.Adicionar;

import java.awt.Color;

import javax.swing.JPanel;

public abstract class Pessoa extends JPanel {

	public Pessoa() {
		this.InitComponents();
	}

	protected void InitComponents() {
		this.setBackground(Color.BLUE);
		this.add(dados());
	}
	
	protected abstract JPanel dados();
	
}
