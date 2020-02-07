package GUI.Auxiliar;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TabelaDados extends JPanel {

	protected JTable tabela;
	protected JScrollPane scroll;
	protected String[] nomes;
	protected int[] tamanhos;

	public TabelaDados(String[] nomes, int[] tamanhos) {

		this.nomes = nomes;
		this.tamanhos = tamanhos;
		InitComponents();
	}

	protected void InitComponents() {

		tabela = new JTable(new DefaultTableModel(nomes, 0));

		tabela.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 12));
		tabela.getTableHeader().setBackground(new Color(176, 196, 222));
		for (String nome : nomes) {

			int index = Arrays.asList(nomes).indexOf(nome);
			tabela.getColumnModel().getColumn(index).setMaxWidth(tamanhos[index]);
		}
		tabela.setFocusable(false);
		tabela.setRowSelectionAllowed(false);
		tabela.setBackground(new Color(240, 248, 255));
		tabela.setAutoCreateRowSorter(true);
		tabela.getRowSorter().toggleSortOrder(0);
		tabela.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		tabela.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.black, 1));

		scroll = new JScrollPane(tabela);
		// scroll.setBorder(BorderFactory.createEmptyBorder());

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.CENTER).addComponent(scroll));
		l.setVerticalGroup(l.createSequentialGroup().addComponent(scroll, 200, 200, 200));
		this.setLayout(l);
	}

}
