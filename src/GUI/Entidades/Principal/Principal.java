package GUI.Entidades.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import GUI.Entidades.Cadastro.Ficha.ConjFichas;

public class Principal extends JPanel {

	protected JButton home, registros, cadastro, calendario, relatorios, configuracoes;
	protected JPanel botoes, conteudo;
	protected JSeparator sVer;
	protected JMenuBar menu;

	public Principal() {

		InitComponents();
	}

	protected void InitComponents() {

		InitBotoes();
		InitConteudo(new ConjFichas());
		this.sVer = new JSeparator(SwingConstants.VERTICAL);

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createSequentialGroup().addGroup(l.createParallelGroup().addGap(2, 2, 2))
				.addComponent(botoes).addGap(5, 5, 5).addComponent(sVer, 2, 2, 2).addGap(5, 5, 5).addComponent(conteudo)
				.addGroup(l.createParallelGroup().addGap(2, 2, 2)));
		l.setVerticalGroup(
				l.createSequentialGroup().addGroup(l.createParallelGroup().addGap(2, 2, 2))
						.addGroup(l.createParallelGroup().addGroup(l.createSequentialGroup().addComponent(botoes))
								.addComponent(sVer).addComponent(conteudo))
						.addGroup(l.createParallelGroup().addGap(2, 2, 2)));
		this.setLayout(l);
	}

	protected void InitBotoes() {

		botoes = new JPanel();

		home = new JButton(new ImageIcon("Imagens/home.png"));
		home.setFocusable(false);

		registros = new JButton(new ImageIcon("Imagens/reg.png"));
		registros.setFocusable(false);

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

		relatorios = new JButton(new ImageIcon("Imagens/rel.png"));
		relatorios.setFocusable(false);

		configuracoes = new JButton(new ImageIcon("Imagens/tools.png"));
		configuracoes.setFocusable(false);

		GroupLayout l = new GroupLayout(botoes);
		l.setHorizontalGroup(l.createParallelGroup().addComponent(home, 100, 100, Integer.MAX_VALUE)
				.addComponent(registros, 100, 100, Integer.MAX_VALUE)
				.addComponent(cadastro, 100, 100, Integer.MAX_VALUE)
				.addComponent(calendario, 100, 100, Integer.MAX_VALUE)
				.addComponent(relatorios, 100, 100, Integer.MAX_VALUE)
				.addComponent(configuracoes, 100, 100, Integer.MAX_VALUE));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(home, 100, 100, Integer.MAX_VALUE)
				.addComponent(registros, 100, 100, Integer.MAX_VALUE)
				.addComponent(cadastro, 100, 100, Integer.MAX_VALUE)
				.addComponent(calendario, 100, 100, Integer.MAX_VALUE)
				.addComponent(relatorios, 100, 100, Integer.MAX_VALUE)
				.addComponent(configuracoes, 100, 100, Integer.MAX_VALUE));
		botoes.setLayout(l);
	}

	protected void InitConteudo(JPanel conteud) {

		if (getConteudo()==null) {
			setConteudo(new JPanel());
		}
		GroupLayout l = new GroupLayout(getConteudo());

		l.setHorizontalGroup(l.createSequentialGroup().addComponent(conteud));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(conteud));

		getConteudo().setLayout(l);

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
