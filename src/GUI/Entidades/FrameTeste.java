package GUI.Entidades;

import javax.swing.GroupLayout;
import javax.swing.JFrame;

import GUI.Entidades.Ficha.*;
import GUI.Entidades.Pessoal.*;
import Modelos.Entidades.Pessoa.Macom;
import Modelos.Entidades.Pessoa.Demolay;

public class FrameTeste extends JFrame {

	public FrameTeste() {
		Ficha ficha = new Ficha(new Demolay());
		GroupLayout l = new GroupLayout(this.getContentPane());
		l.setHorizontalGroup(l.createParallelGroup().addComponent(ficha));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(ficha));
		this.setLayout(l);
		this.setVisible(true);
	}
}
