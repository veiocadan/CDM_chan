package GUI.Entidades.Ficha;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import GUI.Entidades.Pessoal.Demolay;
import GUI.Entidades.Pessoal.Macom;
import GUI.Entidades.Pessoal.Pessoa;

public class Ficha extends JPanel {

	protected Modelos.Entidades.Pessoa.Macom macom = null;
	protected Modelos.Entidades.Pessoa.Demolay demolay = null;
	protected Pessoa pessoa;
	protected Residencial residencial;
	protected Comercial comercial;

	protected JSeparator sPes;
	protected JLabel lPes, lPesExp, lEnd, lEndExp;
	protected JTextArea obs;

	public Ficha(Modelos.Entidades.Pessoa.Macom macom) {
		this.macom = macom;
		pessoa = new Macom();
		this.InitComponents();
	}
	
	public Ficha(Modelos.Entidades.Pessoa.Demolay demolay) {
		this.demolay = demolay;
		pessoa = new Demolay();
		this.InitComponents();
	}

	protected void InitComponents() {

		comercial = new Comercial();
		residencial = new Residencial(comercial);

		obs = new JTextArea("Observações");
		obs.setBorder(BorderFactory.createLineBorder(Color.lightGray));

		sPes = new JSeparator(SwingConstants.HORIZONTAL);
		lPes = new JLabel("Dados Básicos");
		lPes.setFont(new Font("Helvetica", Font.BOLD, 15));
		lPesExp = new JLabel(
				"Estas informaçoes serão armazenadas para o cadastro de uma lista de indivíduos que têm contato direto com a Loja.");
		lPesExp.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lEnd = new JLabel("Dados de Contato");
		lEnd.setFont(new Font("Helvetica", Font.BOLD, 15));
		lEndExp = new JLabel(
				"Estas informaçoes serão armazenadas no intuito da comunicaão com o indivíduo cadastrado.");
		lEndExp.setFont(new Font("Times New Roman", Font.ITALIC, 12));

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.LEADING).addComponent(lPes).addComponent(sPes)
				.addComponent(lPesExp).addComponent(pessoa,900,900,900).addComponent(lEnd).addComponent(sPes).addComponent(lEndExp)
				.addComponent(residencial).addComponent(comercial).addComponent(obs,900,900,900));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(lPes).addComponent(sPes).addComponent(lPesExp)
				.addComponent(pessoa).addComponent(lEnd).addComponent(sPes).addComponent(lEndExp)
				.addComponent(residencial).addComponent(comercial).addComponent(obs,50,50,50));
		this.setLayout(l);
	}

}
