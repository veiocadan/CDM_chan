package GUI.Entidades.Cadastro.Ficha;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import GUI.Auxiliar.tipoPessoa;

public class ConjFichas extends JPanel {

	JTabbedPane tabbed;
	Ficha fichaMac;
	Ficha fichaDem;

	public ConjFichas() {

		InitComponents();
	}

	protected void InitComponents() {

		fichaMac = new Ficha(tipoPessoa.MACOM);
		fichaDem = new Ficha(tipoPessoa.DEMOLAY);

		tabbed = new JTabbedPane();
		tabbed.add("Maçom", fichaMac);
		tabbed.add("Demolay", fichaDem);

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup().addComponent(tabbed,930,930,Integer.MAX_VALUE));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(tabbed,600,600,Integer.MAX_VALUE));
		this.setLayout(l);
	}

	
	public JTabbedPane getTabbed() {
		return tabbed;
	}

	public Ficha getFichaMac() {
		return fichaMac;
	}

	public Ficha getFichaDem() {
		return fichaDem;
	}
	
	
}
