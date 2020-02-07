package GUI.Entidades.Cadastro.Pessoal;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.Auxiliar.TextFormatter;

import javax.swing.GroupLayout.Alignment;

public class Macom extends Pessoa {

	private static final long serialVersionUID = 1L;
	private JLabel lIde;
	private JLabel lNam;
	private JLabel lCim;
	private JLabel lLoj;
	private JLabel lOri;
	private JLabel lPot;
	private JLabel lNroLoj;
	private JLabel lApr;
	private JLabel lCom;
	private JLabel lMes;
	private JLabel lIns;
	private JLabel lGraSup;
	private JLabel lSup;
	private JLabel lAti;
	private JLabel lNas;
	private JLabel lIni;
	private JLabel lEle;
	private JLabel lExa;
	private JLabel lFal;
	private JTextField tIde;
	private JTextField tNam;
	private JTextField tCim;
	private JTextField tLoj;
	private JTextField tOri;
	private JTextField tPot;
	private JTextField tNroLoj;
	private JTextField tSup;
	private JCheckBox cApr;
	private JCheckBox cCom;
	private JCheckBox cMes;
	private JCheckBox cIns;
	private JCheckBox cGraSup;
	private JCheckBox cAti;
	private JTextField dNas;
	private JTextField dIni;
	private JTextField dEle;
	private JTextField dExa;
	private JTextField dFal;

	public Macom() {
		super();
	}

	@Override
	protected JPanel FrameDados() {

		lIde = new JLabel("Id.");
		lIde.setEnabled(false);
		lNam = new JLabel("Nome");
		lCim = new JLabel("CIM");
		lLoj = new JLabel("Loja");
		lOri = new JLabel("Oriente");
		lPot = new JLabel("Potência");
		lNroLoj = new JLabel("Núm.");
		lApr = new JLabel("A");
		lCom = new JLabel("C");
		lMes = new JLabel("M");
		lIns = new JLabel("I");
		lGraSup = new JLabel("GS");
		lGraSup.setEnabled(false);
		lSup = new JLabel("G");
		lSup.setEnabled(false);
		lAti = new JLabel("A");
		lNas = new JLabel("Nas.");
		lIni = new JLabel("Ini.");
		lEle = new JLabel("Ele.");
		lEle.setEnabled(false);
		lExa = new JLabel("Exa.");
		lExa.setEnabled(false);
		lFal = new JLabel("Ins.");
		lFal.setEnabled(false);
		tIde = new JTextField();
		tIde.setEnabled(false);
		tNam = new JTextField();
		tCim = new JTextField();
		TextFormatter.Numero(tCim);
		tLoj = new JTextField();
		tOri = new JTextField();
		tPot = new JTextField();
		tNroLoj = new JTextField();
		TextFormatter.Numero(tNroLoj);
		tSup = new JTextField();
		tSup.setEnabled(false);
		dNas = new JTextField();
		TextFormatter.Data(dNas);
		dIni = new JTextField();
		TextFormatter.Data(dIni);
		dEle = new JTextField();
		TextFormatter.Data(dEle);
		dEle.setEnabled(false);
		dExa = new JTextField();
		TextFormatter.Data(dExa);
		dExa.setEnabled(false);
		dFal = new JTextField();
		TextFormatter.Data(dFal);
		dFal.setEnabled(false);
		cApr = new JCheckBox();
		cApr.setSelected(true);
		cApr.setName("Aprendiz");
		cApr.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
					cCom.setSelected(false);
					cMes.setSelected(false);
					cIns.setSelected(false);
					cGraSup.setEnabled(false);
					cGraSup.setSelected(false);
					lGraSup.setEnabled(false);
					lEle.setEnabled(false);
					dEle.setEnabled(false);
					dEle.setText("");
					lExa.setEnabled(false);
					dExa.setEnabled(false);
					dExa.setText("");
					lFal.setEnabled(false);
					dFal.setEnabled(false);
					dFal.setText("");
					lSup.setEnabled(false);
					tSup.setEnabled(false);
					tSup.setText("");
				} else if (!cApr.isSelected() && !cCom.isSelected() && !cMes.isSelected() && !cIns.isSelected()) {
					cApr.setSelected(true);
				}

			}
		});
		cCom = new JCheckBox();
		cCom.setSelected(false);
		cCom.setName("Companheiro");
		cCom.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
					cApr.setSelected(false);
					cMes.setSelected(false);
					cIns.setSelected(false);
					cGraSup.setEnabled(false);
					cGraSup.setSelected(false);
					lGraSup.setEnabled(false);
					lEle.setEnabled(true);
					dEle.setEnabled(true);
					dEle.setText("");
					lExa.setEnabled(false);
					dExa.setEnabled(false);
					dExa.setText("");
					lFal.setEnabled(false);
					dFal.setEnabled(false);
					dFal.setText("");
					lSup.setEnabled(false);
					tSup.setEnabled(false);
					tSup.setText("");
				} else if (!cApr.isSelected() && !cCom.isSelected() && !cMes.isSelected() && !cIns.isSelected()) {
					cApr.setSelected(true);
				}

			}
		});
		cMes = new JCheckBox();
		cMes.setSelected(false);
		cMes.setName("Mestre");
		cMes.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
					cApr.setSelected(false);
					cCom.setSelected(false);
					cIns.setSelected(false);
					cGraSup.setEnabled(true);
					cGraSup.setSelected(false);
					lGraSup.setEnabled(true);
					lEle.setEnabled(true);
					dEle.setEnabled(true);
					lExa.setEnabled(true);
					dExa.setEnabled(true);
					dExa.setText("");
					lFal.setEnabled(false);
					dFal.setEnabled(false);
					dFal.setText("");
					lSup.setEnabled(false);
					tSup.setEnabled(false);
					tSup.setText("");
				} else if (!cApr.isSelected() && !cCom.isSelected() && !cMes.isSelected() && !cIns.isSelected()) {
					cApr.setSelected(true);
				}
			}
		});
		cIns = new JCheckBox();
		cIns.setSelected(false);
		cIns.setName("Instalado");
		cIns.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
					cApr.setSelected(false);
					cCom.setSelected(false);
					cMes.setSelected(false);
					cGraSup.setEnabled(true);
					cGraSup.setSelected(false);
					lGraSup.setEnabled(true);
					lEle.setEnabled(true);
					dEle.setEnabled(true);
					lExa.setEnabled(true);
					dExa.setEnabled(true);
					dExa.setText("");
					lFal.setEnabled(true);
					dFal.setEnabled(true);
					dFal.setText("");
					lSup.setEnabled(false);
					tSup.setEnabled(false);
					tSup.setText("");
				} else if (!cApr.isSelected() && !cCom.isSelected() && !cMes.isSelected() && !cIns.isSelected()) {
					cApr.setSelected(true);
				}
			}
		});
		cGraSup = new JCheckBox();
		cGraSup.setSelected(false);
		cGraSup.setEnabled(false);
		cGraSup.setName("GraSup");
		cGraSup.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
					lSup.setEnabled(true);
					tSup.setEnabled(true);
					tSup.setText("");
				} else {
					lSup.setEnabled(false);
					tSup.setEnabled(false);
					tSup.setText("");
				}

			}
		});
		cAti = new JCheckBox();
		cAti.setName("Ativo");

		// Layout
		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.LEADING)
				.addGroup(l.createSequentialGroup().addComponent(lIde).addGap(5, 5, 5).addComponent(tIde, 30, 30, 30)
						.addGap(5, 5, 5).addComponent(lNam).addGap(5, 5, 5)
						.addComponent(tNam, 400, 400, Integer.MAX_VALUE).addGap(5, 5, 5).addComponent(lCim)
						.addGap(5, 5, 5).addComponent(tCim, 100, 100, 100))
				.addGroup(l.createSequentialGroup().addComponent(lLoj).addGap(5, 5, 5)
						.addComponent(tLoj, 300, 300, Integer.MAX_VALUE).addGap(5, 5, 5).addComponent(lNroLoj)
						.addGap(5, 5, 5).addComponent(tNroLoj, 30, 30, 30).addGap(5, 5, 5).addComponent(lOri)
						.addGap(5, 5, 5).addComponent(tOri, 150, 150, 150).addGap(5, 5, 5).addComponent(lPot)
						.addGap(5, 5, 5).addComponent(tPot, 50, 50, 50))
				.addGroup(l.createSequentialGroup().addGap(5,5,Integer.MAX_VALUE).addComponent(cApr).addGap(2, 2, 2).addComponent(lApr)
						.addGap(2, 2, 2).addComponent(cCom).addGap(2, 2, 2).addComponent(lCom).addGap(2, 2, 2)
						.addComponent(cMes).addGap(2, 2, 2).addComponent(lMes).addGap(2, 2, 2).addComponent(cIns)
						.addGap(2, 2, 2).addComponent(lIns).addGap(25,25,25).addComponent(lNas)
						.addGap(2, 2, 2).addComponent(dNas, 70, 70, 70).addGap(5, 5, 5).addComponent(lIni)
						.addGap(2, 2, 2).addComponent(dIni, 70, 70, 70).addGap(5, 5, 5).addComponent(lEle)
						.addGap(2, 2, 2).addComponent(dEle, 70, 70, 70).addGap(5, 5, 5).addComponent(lExa)
						.addGap(2, 2, 2).addComponent(dExa, 70, 70, 70).addGap(5, 5, 5).addComponent(lFal)
						.addGap(2, 2, 2).addComponent(dFal, 70, 70, 70).addGap(25,25,25)
						.addComponent(cGraSup).addGap(2, 2, 2).addComponent(lGraSup).addGap(5, 5, 5).addComponent(lSup)
						.addGap(5, 5, 5).addComponent(tSup, 30, 30, 30).addGap(10, 10, 10).addComponent(cAti)
						.addGap(2, 2, 2).addComponent(lAti).addGap(5,5,Integer.MAX_VALUE)));
		l.setVerticalGroup(
				l.createSequentialGroup().addContainerGap(5, 5)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lIde).addComponent(tIde)
								.addComponent(lNam).addComponent(tNam).addComponent(lCim).addComponent(tCim))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lLoj).addComponent(tLoj)
								.addComponent(lNroLoj).addComponent(tNroLoj).addComponent(lOri).addComponent(tOri)
								.addComponent(lPot).addComponent(tPot))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(cApr).addComponent(lApr)
								.addComponent(cCom).addComponent(lCom).addComponent(cMes).addComponent(lMes)
								.addComponent(cIns).addComponent(lIns).addComponent(lNas).addComponent(dNas)
								.addComponent(lIni).addComponent(dIni).addComponent(lExa).addComponent(dExa)
								.addComponent(lEle).addComponent(dEle).addComponent(lFal).addComponent(dFal)
								.addComponent(cGraSup).addComponent(lGraSup).addComponent(lSup).addComponent(tSup)
								.addComponent(cAti).addComponent(lAti))
						.addContainerGap(5, 5));

		this.setLayout(l);

		return this;
	}

	public JLabel getlIde() {
		return lIde;
	}

	public JLabel getlNam() {
		return lNam;
	}

	public JLabel getlCim() {
		return lCim;
	}

	public JLabel getlLoj() {
		return lLoj;
	}

	public JLabel getlOri() {
		return lOri;
	}

	public JLabel getlPot() {
		return lPot;
	}

	public JLabel getlNroLoj() {
		return lNroLoj;
	}

	public JLabel getlApr() {
		return lApr;
	}

	public JLabel getlCom() {
		return lCom;
	}

	public JLabel getlMes() {
		return lMes;
	}

	public JLabel getlIns() {
		return lIns;
	}

	public JLabel getlGraSup() {
		return lGraSup;
	}

	public JLabel getlSup() {
		return lSup;
	}

	public JLabel getlAti() {
		return lAti;
	}

	public JLabel getlNas() {
		return lNas;
	}

	public JLabel getlIni() {
		return lIni;
	}

	public JLabel getlEle() {
		return lEle;
	}

	public JLabel getlExa() {
		return lExa;
	}

	public JLabel getlFal() {
		return lFal;
	}

	public JTextField gettIde() {
		return tIde;
	}

	public JTextField gettNam() {
		return tNam;
	}

	public JTextField gettCim() {
		return tCim;
	}

	public JTextField gettLoj() {
		return tLoj;
	}

	public JTextField gettOri() {
		return tOri;
	}

	public JTextField gettPot() {
		return tPot;
	}

	public JTextField gettNroLoj() {
		return tNroLoj;
	}

	public JTextField gettSup() {
		return tSup;
	}

	public JCheckBox getcApr() {
		return cApr;
	}

	public JCheckBox getcCom() {
		return cCom;
	}

	public JCheckBox getcMes() {
		return cMes;
	}

	public JCheckBox getcIns() {
		return cIns;
	}

	public JCheckBox getcGraSup() {
		return cGraSup;
	}

	public JCheckBox getcAti() {
		return cAti;
	}

	public JTextField getdNas() {
		return dNas;
	}

	public JTextField getdIni() {
		return dIni;
	}

	public JTextField getdEle() {
		return dEle;
	}

	public JTextField getdExa() {
		return dExa;
	}

	public JTextField getdFal() {
		return dFal;
	}

	
}
