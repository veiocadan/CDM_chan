package GUI.Entidades.Registro.Pessoal;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

public class Familiar extends Pessoa{

	private JLabel lnom;
	private JLabel lgra;
	private JLabel lsex;
	private JTextField tnom;
	private JComboBox cgra;
	private JComboBox csex;
	
	public Familiar() {
		super();
	}
	
	@Override
	protected JPanel FrameDados() {
		
		lnom = new JLabel("Nome");
		lgra = new JLabel("Parentesco");
		lsex = new JLabel("Sexo");
		tnom = new JTextField();
		String[] st = {"Todos","Cônjuge","Filho(a)","Pai/Mãe","Irmã(o)","Neto(a)",
				"Avô(ó)","Tio(a)","Sobrinho(a)","Primo(a)","Genro/Nora",
				"Sogro(a)","Cunhado(a)","Enteado(a)","Padrasto/Madrasta",
				"Outro", "Próprio"};
		cgra = new JComboBox(st);						
		csex = new JComboBox();
		csex.addItem("Todos");
		csex.addItem("Masculino");
		csex.addItem("Feminino");
		
		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.LEADING)
				.addGroup(l.createSequentialGroup()
						.addComponent(lnom,40,40,40)
						.addGap(5,5,5)
						.addComponent(tnom,300,300,Integer.MAX_VALUE)
						.addGap(20,20,20)
						.addComponent(lgra)
						.addGap(5,5,5)
						.addComponent(cgra,120,120,120)
						.addGap(20,20,20)
						.addComponent(lsex)
						.addGap(5,5,5)
						.addComponent(csex,80,80,80)
						)
				
				);
		l.setVerticalGroup(l.createSequentialGroup()
				.addGroup(l.createParallelGroup(Alignment.BASELINE)
						.addComponent(lnom)
						.addComponent(tnom)
						.addComponent(lgra)
						.addComponent(cgra)
						.addComponent(lsex)
						.addComponent(csex))
				
				);
		this.setLayout(l);
		
		return this;
	}
}
