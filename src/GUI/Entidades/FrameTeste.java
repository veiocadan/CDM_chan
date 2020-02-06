package GUI.Entidades;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;

import GUI.Entidades.Principal.Principal;

public class FrameTeste extends JFrame {

	public FrameTeste() {
		Principal p = new Principal();
		GroupLayout l = new GroupLayout(this.getContentPane());
		l.setHorizontalGroup(l.createParallelGroup().addComponent(p));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(p));
		this.setLayout(l);
		this.setMinimumSize(new Dimension(1100,700));
		this.setVisible(true);
	}
}
