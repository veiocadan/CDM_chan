package GUI.Entidades.Principal;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import GUI.Entidades.Cadastro.Ficha.ConjFichas;

public class Principal extends JPanel {

	protected JButton home, registro, cadastro, calendario, relatorio, configuracoes;
	protected JPanel botoes, conteudo;
	protected JSeparator sVer;
	protected JMenu ferramentas;
	protected JMenuBar mb;
	protected JMenuItem menuinicio, menuregistro, menucadastro, menucalendario, menurelatorio;

	public Principal() {

		InitComponents();
	}

	protected void InitComponents() {

		InitBotoes();
		InitConteudo(new ConjFichas());
		InitMenus();
		this.sVer = new JSeparator(SwingConstants.VERTICAL);

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup().addComponent(mb)
				.addGroup(l.createSequentialGroup().addGroup(l.createParallelGroup().addGap(2, 2, 2))
						.addComponent(botoes).addGap(5, 5, 5).addComponent(sVer, 2, 2, 2).addGap(5, 5, 5)
						.addComponent(conteudo).addGroup(l.createParallelGroup().addGap(2, 2, 2))));
		l.setVerticalGroup(
				l.createSequentialGroup().addComponent(mb, 25, 25, 25).addGroup(l.createParallelGroup().addGap(2, 2, 2))
						.addGroup(l.createParallelGroup().addGroup(l.createSequentialGroup().addComponent(botoes))
								.addComponent(sVer).addComponent(conteudo))
						.addGroup(l.createParallelGroup().addGap(2, 2, 2)));
		this.setLayout(l);
	}

	protected void InitBotoes() {

		botoes = new JPanel();

		home = new JButton(new ImageIcon("Imagens/home.png"));
		home.setFocusable(false);

		registro = new JButton(new ImageIcon("Imagens/reg.png"));
		registro.setFocusable(false);

		cadastro = new JButton(new ImageIcon("Imagens/add.png"));
		cadastro.setFocusable(false);
		cadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				getConteudo().removeAll();
				InitConteudo(new ConjFichas());
				getConteudo().revalidate();
				getConteudo().repaint();
			}
		});

		calendario = new JButton(new ImageIcon("Imagens/evt.png"));
		calendario.setFocusable(false);

		relatorio = new JButton(new ImageIcon("Imagens/rel.png"));
		relatorio.setFocusable(false);

		configuracoes = new JButton(new ImageIcon("Imagens/tools.png"));
		configuracoes.setFocusable(false);

		GroupLayout l = new GroupLayout(botoes);
		l.setHorizontalGroup(l.createParallelGroup().addComponent(home, 100, 100, Integer.MAX_VALUE)
				.addComponent(registro, 100, 100, Integer.MAX_VALUE).addComponent(cadastro, 100, 100, Integer.MAX_VALUE)
				.addComponent(calendario, 100, 100, Integer.MAX_VALUE)
				.addComponent(relatorio, 100, 100, Integer.MAX_VALUE)
				.addComponent(configuracoes, 100, 100, Integer.MAX_VALUE));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(home, 100, 100, Integer.MAX_VALUE)
				.addComponent(registro, 100, 100, Integer.MAX_VALUE).addComponent(cadastro, 100, 100, Integer.MAX_VALUE)
				.addComponent(calendario, 100, 100, Integer.MAX_VALUE)
				.addComponent(relatorio, 100, 100, Integer.MAX_VALUE)
				.addComponent(configuracoes, 100, 100, Integer.MAX_VALUE));
		botoes.setLayout(l);
	}

	protected void InitConteudo(JPanel conteud) {

		if (getConteudo() == null) {
			setConteudo(new JPanel());
		}
		GroupLayout l = new GroupLayout(getConteudo());

		l.setHorizontalGroup(l.createSequentialGroup().addComponent(conteud));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(conteud));

		getConteudo().setLayout(l);

	}

	protected void InitMenus() {
		mb = new JMenuBar();
		ferramentas = new JMenu("Ferramentas");
		menuinicio = new JMenuItem("Página Inicial");
		menuinicio.setPreferredSize(new Dimension(150, (int) menuinicio.getPreferredSize().getHeight()));
		menuregistro = new JMenuItem("Visualizar Registros");
		menuregistro.setPreferredSize(new Dimension(150, (int) menuregistro.getPreferredSize().getHeight()));
		menucadastro = new JMenuItem("Novo Cadastro");
		menucadastro.setPreferredSize(new Dimension(150, (int) menucadastro.getPreferredSize().getHeight()));

		menucadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				getConteudo().removeAll();
				InitConteudo(new ConjFichas());
				getConteudo().revalidate();
				getConteudo().repaint();

			}
		});

		ferramentas.add(menuinicio);
		ferramentas.add(menuregistro);
		ferramentas.add(menucadastro);
		mb.add(ferramentas);
	}

	public JPanel getBotoes() {
		return botoes;
	}

	public JPanel getConteudo() {
		return conteudo;
	}

	public void setBotoes(JPanel botoes) {
		this.botoes = botoes;
	}

	public void setConteudo(JPanel conteudo) {
		this.conteudo = conteudo;
	}

}
