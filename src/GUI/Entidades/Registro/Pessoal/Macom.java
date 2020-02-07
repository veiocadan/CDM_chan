package GUI.Entidades.Registro.Pessoal;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Macom extends Pessoa {

	private JLabel lnom;
	private JLabel lcim;
	private JLabel lloj;
	private JLabel lgra;
	private JLabel lati;
	private JTextField tnom;
	private JTextField tcim;
	private JTextField tloj;
	private JComboBox cgra;
	private JComboBox cati;

	public Macom() {
		super();
	}

	@Override
	protected JPanel FrameDados() {

		lnom = new JLabel("Nome");
		lcim = new JLabel("CIM");
		lloj = new JLabel("Loja");
		lgra = new JLabel("Grau");
		lati = new JLabel("Atividade");
		tnom = new JTextField();
		tcim = new JTextField();
		tloj = new JTextField();
		cgra = new JComboBox();
		cgra.addItem("Todos");
		cgra.addItem("Aprendiz");
		cgra.addItem("Companheiro");
		cgra.addItem("Mestre");
		cati = new JComboBox();
		cati.addItem("Todos");
		cati.addItem("Ativo");
		cati.addItem("Inativo");

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.LEADING)
				.addGroup(l.createSequentialGroup().addComponent(lnom, 40, 40, 40).addGap(5, 5, 5)
						.addComponent(tnom, 300, 300, Integer.MAX_VALUE).addGap(20, 20, 20).addComponent(lgra)
						.addGap(5, 5, 5).addComponent(cgra, 120, 120, 120))
				.addGroup(l.createSequentialGroup().addComponent(lloj, 40, 40, 40).addGap(5, 5, 5)
						.addComponent(tloj, 100, 100, Integer.MAX_VALUE).addGap(20, 20, 20).addComponent(lati)
						.addGap(5, 5, 5).addComponent(cati, 100, 100, 100)));
		l.setVerticalGroup(l.createSequentialGroup()
				.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lnom).addComponent(tnom)
						.addComponent(lgra).addComponent(cgra))
				.addGap(10, 10, 10).addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lloj)
						.addComponent(tloj).addComponent(lati).addComponent(cati)));
		this.setLayout(l);

		return this;
	}

}
