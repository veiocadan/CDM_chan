package GUI.Entidades.Registro.Pessoal;

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