package GUI.Entidades.Adicionar;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

public class Demolay extends Pessoa {

	private static final long serialVersionUID = 1L;
	private JLabel lIde;
	private JLabel lNam;
	private JLabel lCim;
	private JLabel lCap;
	private JLabel lCid;
	private JLabel lPot;
	private JLabel lNroCap;
	private JLabel lApr;
	private JLabel lDem;
	private JLabel lCav;
	private JLabel lAti;
	private JLabel lNas;
	private JLabel lIni;
	private JLabel lEle;
	private JLabel lSen;
	private JLabel lFal;
	private JTextField tIde;
	private JTextField tNam;
	private JTextField tCim;
	private JTextField tCap;
	private JTextField tCid;
	private JTextField tPot;
	private JTextField tNroCap;
	private JCheckBox cApr;
	private JCheckBox cDem;
	private JCheckBox cCav;
	private JCheckBox cAti;
	private JCheckBox cSen;
	private JTextField dNas;
	private JTextField dIni;
	private JTextField dEle;
	private JTextField dFal;

	public Demolay() {
		super();
	}

	public JLabel getlSen() {
		return lSen;
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

	public JLabel getlCap() {
		return lCap;
	}

	public JLabel getlCid() {
		return lCid;
	}

	public JLabel getlPot() {
		return lPot;
	}

	public JLabel getlNroCap() {
		return lNroCap;
	}

	public JLabel getlApr() {
		return lApr;
	}

	public JLabel getlDem() {
		return lDem;
	}

	public JLabel getlCav() {
		return lCav;
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

	public JTextField gettCap() {
		return tCap;
	}

	public JTextField gettCid() {
		return tCid;
	}

	public JTextField gettPot() {
		return tPot;
	}

	public JTextField gettNroCap() {
		return tNroCap;
	}

	public JCheckBox getcApr() {
		return cApr;
	}

	public JCheckBox getcDem() {
		return cDem;
	}

	public JCheckBox getcCav() {
		return cCav;
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

	public JTextField getdFal() {
		return dFal;
	}

	@Override
	protected JPanel FrameDados() {
		JPanel teste = new JPanel();
		lIde = new JLabel("Id.");
		lIde.setEnabled(false);
		lNam = new JLabel("Nome");
		lCim = new JLabel("SISDM");
		lCap = new JLabel("Capítulo");
		lCid = new JLabel("Cidade");
		lPot = new JLabel("Potência");
		lNroCap = new JLabel("Núm.");
		lApr = new JLabel("A");
		lDem = new JLabel("D");
		lSen = new JLabel("S");
		lCav = new JLabel("Cav");
		lCav.setEnabled(false);
		lAti = new JLabel("A");
		lNas = new JLabel("Nas.");
		lIni = new JLabel("Ini.");
		lEle = new JLabel("Ele.");
		lEle.setEnabled(false);
		lFal = new JLabel("Fal.");
		tIde = new JTextField();
		tIde.setEnabled(false);
		tNam = new JTextField();
		tCim = new JTextField();
		tCap = new JTextField();
		tCid = new JTextField();
		tPot = new JTextField();
		tNroCap = new JTextField();
		dNas = new JTextField();
		dIni = new JTextField();
		dEle = new JTextField();
		dEle.setEnabled(false);
		dFal = new JTextField();
		cApr = new JCheckBox();
		cApr.setSelected(true);
		cApr.setName("Iniciático");
		cApr.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
					cDem.setSelected(false);
					lCav.setEnabled(false);
					cCav.setEnabled(false);
					cCav.setSelected(false);
					lEle.setEnabled(false);
					dEle.setEnabled(false);
					dEle.setText("");
				} else if (!cApr.isSelected() && !cDem.isSelected()) {
					cApr.setSelected(true);
				}

			}
		});
		cDem = new JCheckBox();
		cDem.setSelected(false);
		cDem.setName("Demolay");
		cDem.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
					cApr.setSelected(false);
					cCav.setEnabled(true);
					cCav.setSelected(false);
					lCav.setEnabled(true);
					lEle.setEnabled(true);
					dEle.setEnabled(true);
					dEle.setText("");
				} else if (!cApr.isSelected() && !cDem.isSelected()) {
					cApr.setSelected(true);
				}

			}
		});
		cSen = new JCheckBox();
		cSen.setSelected(false);
		cSen.setName("Sênior");
		cCav = new JCheckBox();
		cCav.setName("Cavaleiro");
		cAti = new JCheckBox();
		cAti.setName("Ativo");

		GroupLayout l = new GroupLayout(teste);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.LEADING)
				.addGroup(l.createSequentialGroup().addComponent(lIde).addGap(5, 5, 5).addComponent(tIde, 30, 30, 30)
						.addGap(5, 5, 5).addComponent(lNam).addGap(5, 5, 5)
						.addComponent(tNam, 400, 400, Integer.MAX_VALUE).addGap(5, 5, 5).addComponent(lCim)
						.addGap(5, 5, 5).addComponent(tCim, 100, 100, 100))
				.addGroup(l.createSequentialGroup().addComponent(lCap).addGap(5, 5, 5)
						.addComponent(tCap, 300, 300, Integer.MAX_VALUE).addGap(5, 5, 5).addComponent(lNroCap)
						.addGap(5, 5, 5).addComponent(tNroCap, 30, 30, 30).addGap(5, 5, 5).addComponent(lCid)
						.addGap(5, 5, 5).addComponent(tCid, 150, 150, 150).addGap(5, 5, 5).addComponent(lPot)
						.addGap(5, 5, 5).addComponent(tPot, 50, 50, 50))
				.addGroup(l.createSequentialGroup().addComponent(cApr).addGap(5, 5, 5).addComponent(lApr)
						.addGap(5, 5, 5).addComponent(cDem).addGap(5, 5, 5).addComponent(lDem).addGap(5, 5, 5)
						.addComponent(cSen).addGap(5, 5, 5).addComponent(lSen).addGap(10, 10, Integer.MAX_VALUE)
						.addComponent(lNas).addGap(5, 5, 5).addComponent(dNas, 70, 70, 70).addGap(5, 5, 5)
						.addComponent(lIni).addGap(5, 5, 5).addComponent(dIni, 70, 70, 70).addGap(5, 5, 5)
						.addComponent(lEle).addGap(5, 5, 5).addComponent(dEle, 70, 70, 70).addGap(5, 5, 5)
						.addGap(5, 5, Integer.MAX_VALUE).addComponent(cCav).addGap(5, 5, 5).addComponent(lCav)
						.addGap(5, 5, 5).addComponent(cAti).addGap(5, 5, 5).addComponent(lAti)));
		l.setVerticalGroup(
				l.createSequentialGroup().addContainerGap(5, Integer.MAX_VALUE)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lIde).addComponent(tIde)
								.addComponent(lNam).addComponent(tNam).addComponent(lCim).addComponent(tCim))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lCap).addComponent(tCap)
								.addComponent(lNroCap).addComponent(tNroCap).addComponent(lCid).addComponent(tCid)
								.addComponent(lPot).addComponent(tPot))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(cApr).addComponent(lApr)
								.addComponent(cDem).addComponent(lDem).addComponent(cSen).addComponent(lSen)
								.addComponent(lNas).addComponent(dNas).addComponent(lIni).addComponent(dIni)
								.addComponent(lEle).addComponent(dEle).addComponent(cCav).addComponent(lCav)
								.addComponent(cAti).addComponent(lAti))
						.addContainerGap(5, Integer.MAX_VALUE));

		teste.setLayout(l);
		return teste;
	}
}
