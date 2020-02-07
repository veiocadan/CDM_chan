package GUI.Entidades;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;

import GUI.Auxiliar.TabelaDados;
import GUI.Auxiliar.tipoPessoa;
import GUI.Entidades.Principal.Principal;
import GUI.Entidades.Registro.Ficha.Ficha;
import GUI.Entidades.Registro.Pessoal.Demolay;
import GUI.Entidades.Registro.Pessoal.Macom;

public class FrameTeste extends JFrame {

	public FrameTeste() {
		
		Principal p = new Principal();
		//TabelaDados p = new TabelaDados(new String[] {"teste1","teste2", "teste3","teste1","teste2", "teste3"}, new int[] {100,200,300,400,500,600});
		//Ficha p = new Ficha(tipoPessoa.DEMOLAY);
		GroupLayout l = new GroupLayout(this.getContentPane());
		l.setHorizontalGroup(l.createParallelGroup().addComponent(p));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(p));
		this.setLayout(l);
		this.setMinimumSize(new Dimension(1100,725));
		this.setVisible(true);
	}
}
