package GUI.Entidades.Cadastro.Ficha;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import GUI.Auxiliar.tipoPessoa;
import GUI.Entidades.Cadastro.Pessoal.Demolay;
import GUI.Entidades.Cadastro.Pessoal.Macom;
import GUI.Entidades.Cadastro.Pessoal.Pessoa;

public class Ficha extends JPanel {

	protected Modelos.Entidades.Pessoal.Pessoa pessoaEnt;
	protected Pessoa pessoa;
	protected Residencial residencial;
	protected Comercial comercial;

	protected JSeparator sPes, sEnd, sFim;
	protected JLabel lPes, lPesExp, lEnd, lEndExp;
	protected JTextArea obs;
	protected JButton limpar, cadastrar;

	public Ficha(tipoPessoa tp) {
		this.pessoaEnt = tp.getModelo();
		pessoa = tp.getGui();
		this.InitComponents();
	}

	protected void InitComponents() {

		comercial = new Comercial();
		residencial = new Residencial(comercial);

		residencial
				.setMaximumSize(new Dimension(Integer.MAX_VALUE, ((int) residencial.getPreferredSize().getHeight())));
		comercial.setMaximumSize(new Dimension(Integer.MAX_VALUE, ((int) comercial.getPreferredSize().getHeight())));

		obs = new JTextArea("Observações");
		obs.setBorder(BorderFactory.createLineBorder(Color.lightGray));

		limpar = new JButton("Limpar");
		limpar.setSize(50, limpar.getPreferredSize().height);
		limpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				limparApertado();

			}
		});
		cadastrar = new JButton("Cadastrar");
		cadastrar.setSize(50, cadastrar.getPreferredSize().height);

		sPes = new JSeparator(SwingConstants.HORIZONTAL);
		sEnd = new JSeparator(SwingConstants.HORIZONTAL);
		sFim = new JSeparator(SwingConstants.HORIZONTAL);
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
		l.setHorizontalGroup(l.createSequentialGroup().addGap(10, 10, 10).addGroup(l
				.createParallelGroup(Alignment.LEADING).addComponent(lPes).addComponent(sPes).addComponent(lPesExp)
				.addComponent(pessoa, 900, 900, Integer.MAX_VALUE).addComponent(lEnd).addComponent(sEnd)
				.addComponent(lEndExp).addComponent(residencial).addComponent(comercial)
				.addComponent(obs, 900, 900, Integer.MAX_VALUE).addComponent(sFim)
				.addGroup(l.createSequentialGroup().addGap(5, 5, Integer.MAX_VALUE).addComponent(limpar, 100, 100, 100)
						.addGap(100, 100, 100).addComponent(cadastrar, 100, 100, 100).addGap(5, 5, Integer.MAX_VALUE)))
				.addGap(10, 10, 10));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(lPes).addGap(5, 5, 5).addComponent(sPes, 2, 2, 2)
				.addGap(5, 5, 5).addComponent(lPesExp).addGap(5, 5, 5).addComponent(pessoa)
				.addGap(5, 5, Integer.MAX_VALUE).addComponent(lEnd).addGap(5, 5, 5).addComponent(sEnd, 2, 2, 2)
				.addGap(5, 5, 5).addComponent(lEndExp).addGap(5, 5, 5).addComponent(residencial).addGap(5, 5, 5)
				.addComponent(comercial).addComponent(obs, 50, 50, 50).addGap(15, 15, Integer.MAX_VALUE)
				.addComponent(sFim, 2, 2, 2).addGap(15, 15, Integer.MAX_VALUE)
				.addGroup(l.createParallelGroup().addComponent(limpar).addComponent(cadastrar))
				.addGap(15, 15, Integer.MAX_VALUE));
		this.setLayout(l);
	}

	protected void limparApertado() {

		for (Component comp : this.getComponents()) {
			if (comp instanceof JTextField) {
				((JTextField) comp).setText(null);
			} else if (comp instanceof JPanel) {
				for (Component comp2 : ((JPanel) comp).getComponents()) {
					if (comp2 instanceof JTextField) {
						((JTextField) comp2).setText(null);
					}
				}
			} else if (comp instanceof JTextArea) {
				((JTextArea) comp).setText("Observações");
			}
		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

}
