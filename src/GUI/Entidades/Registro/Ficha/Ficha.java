package GUI.Entidades.Registro.Ficha;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;

import GUI.Auxiliar.TabelaDados;
import GUI.Auxiliar.tipoPessoa;
import GUI.Entidades.Registro.Pessoal.Pessoa;

public class Ficha extends JPanel{

	private Pessoa pessoa;
	protected String[] colunas;
	protected int[] tamanhos;
	private JPanel tabela;
	private JSeparator sPes;
	private JSeparator sEnd;
	private JSeparator sFim;
	private JLabel lPes;
	private JLabel lPesExp;
	private JLabel lEnd;
	private JLabel lEndExp;
	
	public Ficha(tipoPessoa tp) {
		
		this.pessoa = tp.getGuiReg();
		this.colunas = tp.getColunas();
		this.tamanhos = tp.getTamanhos();
		InitComponents();
		
	}
	
	protected void InitComponents() {
		
		tabela = new TabelaDados(colunas, tamanhos);
		
		sPes = new JSeparator(SwingConstants.HORIZONTAL);
		sEnd = new JSeparator(SwingConstants.HORIZONTAL);
		

		lPes = new JLabel("Filtrar Lista");
		lPes.setFont(new Font("Helvetica",Font.BOLD, 15));
		lPesExp = new JLabel("Filtrar lista a partir de uma ou mais opções.");
		lPesExp.setFont(new Font("Times New Roman",Font.ITALIC, 12));
		lEnd = new JLabel("Cadastros");
		lEnd.setFont(new Font("Helvetica",Font.BOLD, 15));
		lEndExp = new JLabel("Cadastros de acordo com os filtros selecionados.");
		lEndExp.setFont(new Font("Times New Roman",Font.ITALIC, 12));
		
		
		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createSequentialGroup()
				//.addContainerGap(5,5)
				.addGroup(l.createParallelGroup(Alignment.LEADING)
					.addComponent(lPes)
					.addComponent(sPes)
					.addComponent(lPesExp)
					.addComponent(pessoa,600,600,600)
					.addComponent(lEnd)
					.addComponent(sEnd)
					.addComponent(lEndExp)
					.addComponent(tabela,800,800,800)
				)
				//.addContainerGap(5,5)
				);
		l.setVerticalGroup(l.createSequentialGroup()
				.addGap(20,20,20)
				.addComponent(lPes)
				.addComponent(sPes,2,2,2)
				.addComponent(lPesExp)
				.addGap(10,10,10)
				.addComponent(pessoa,100,100,100)
				.addGap(10,10,10)
				.addComponent(lEnd)
				.addComponent(sEnd,2,2,2)
				.addComponent(lEndExp)
				.addGap(10,10,10)
				.addComponent(tabela)
				.addGap(10,10,10)
				);
		this.setLayout(l);
	}
}
