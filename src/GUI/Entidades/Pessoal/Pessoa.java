package GUI.Entidades.Pessoal;

import java.awt.Color;

import javax.swing.JPanel;

public abstract class Pessoa extends JPanel {

	public Pessoa() {
		this.InitComponents();
	}

	protected void InitComponents() {
		this.FrameDados();
	}
	
	protected abstract JPanel FrameDados();
	
}
