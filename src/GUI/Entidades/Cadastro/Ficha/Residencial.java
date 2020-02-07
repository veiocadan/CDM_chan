package GUI.Entidades.Cadastro.Ficha;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import GUI.Auxiliar.TextFormatter;

public class Residencial extends JPanel {

	protected JLabel lEnd, lNro, lCom, lBai, lCid, lEst, lCEP, lEma, lTel, lCel, lTra;
	protected JTextField tEnd, tNro, tCom, tBai, tCid, tEst, tCEP, tEma, tTel, tCel;
	protected JCheckBox tTra;
	protected JButton bCar;

	public Residencial(JPanel comercial) {
		this.InitComponents(comercial);
	}

	protected void InitComponents(JPanel comercial) {

		lEnd = new JLabel("Endereço");
		lNro = new JLabel("Núm.");
		lCom = new JLabel("Complemento");
		lBai = new JLabel("Bairro");
		lCid = new JLabel("Cidade");
		lEst = new JLabel("Estado");
		lCEP = new JLabel("CEP");
		lEma = new JLabel("E-mail");
		lTel = new JLabel("Telefone");
		lCel = new JLabel("Celular");
		lTra = new JLabel("Endereço Comercial?");

		bCar = new JButton("Carregar");

		tEnd = new JTextField();
		tNro = new JTextField();
		TextFormatter.Numero(tNro);
		tCom = new JTextField();
		tBai = new JTextField();
		tCid = new JTextField();
		tEst = new JTextField();
		tCEP = new JTextField();
		TextFormatter.CEP(tCEP);
		tEma = new JTextField();
		tTel = new JTextField();
		TextFormatter.Telefone(tTel);
		tCel = new JTextField();
		TextFormatter.Telefone(tCel);

		tTra = new JCheckBox();
		tTra.setSelected(true);
		tTra.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
					for (Component comp : comercial.getComponents()) {
						if(comp instanceof JTextField) {
							((JTextField) comp).setText(null);
						}
						comp.setEnabled(false);
					}
				} else {
					for (Component comp : comercial.getComponents()) {
						comp.setEnabled(true);
					}
				}
			}
		});

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.LEADING)
				.addGroup(l.createSequentialGroup().addComponent(lEnd).addGap(5, 5, 5)
						.addComponent(tEnd, 400, 400, Integer.MAX_VALUE).addGap(5, 5, 5).addComponent(lNro)
						.addGap(5, 5, 5).addComponent(tNro, 30, 30, 30).addGap(5, 5, 5).addComponent(lCom)
						.addGap(5, 5, 5).addComponent(tCom, 200, 200, 200))
				.addGroup(l.createSequentialGroup().addComponent(lBai).addGap(5, 5, 5).addComponent(tBai, 275, 275, 275)
						.addGap(5, 5, Integer.MAX_VALUE).addComponent(lCid).addGap(5, 5, 5)
						.addComponent(tCid, 275, 275, 275).addGap(5, 5, Integer.MAX_VALUE).addComponent(lEst)
						.addGap(5, 5, 5).addComponent(tEst, 30, 30, 30).addGap(5, 5, Integer.MAX_VALUE)
						.addComponent(lCEP).addGap(5, 5, 5).addComponent(tCEP, 100, 100, 100))
				.addGroup(l.createSequentialGroup().addComponent(lEma).addGap(5, 5, 5).addComponent(tEma, 200, 200, 200)
						.addGap(5, 5, 5).addComponent(lTel).addGap(5, 5, 5).addComponent(tTel, 100, 100, 100)
						.addGap(5, 5, 5).addComponent(lCel).addGap(5, 5, 5).addComponent(tCel, 100, 100, 100)
						.addGap(5, 5, Integer.MAX_VALUE).addComponent(bCar).addGap(5, 5, Integer.MAX_VALUE)
						.addComponent(tTra).addGap(5, 5, 5).addComponent(lTra)

				));
		l.setVerticalGroup(
				l.createSequentialGroup().addContainerGap(5, Integer.MAX_VALUE)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lEnd).addComponent(tEnd)
								.addComponent(lNro).addComponent(tNro).addComponent(lCom).addComponent(tCom))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lBai).addComponent(tBai)
								.addComponent(lCid).addComponent(tCid).addComponent(lEst).addComponent(tEst)
								.addComponent(lCEP).addComponent(tCEP))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lEma).addComponent(tEma)
								.addComponent(lTel).addComponent(tTel).addComponent(lCel).addComponent(tCel)
								.addComponent(bCar).addComponent(tTra).addComponent(lTra)

						).addContainerGap(5, Integer.MAX_VALUE));

		this.setLayout(l);
	}
}
