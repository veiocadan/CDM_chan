package GUI.Entidades.Cadastro.Ficha;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import GUI.Auxiliar.TextFormatter;

public class Comercial extends JPanel {

	protected JLabel lEmp, lPro, lEnd, lNro, lCom, lBai, lCid, lEst, lCEP, lEma, lTel, lCel;
	protected JTextField tEmp, tPro, tEnd, tNro, tCom, tBai, tCid, tEst, tCEP, tEma, tTel, tCel;

	public Comercial() {
		this.InitComponents();
	}

	protected void InitComponents() {

		lEmp = new JLabel("Empresa");
		lPro = new JLabel("Profissão");
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

		tEmp = new JTextField();
		tPro = new JTextField();
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
		tCel = new JTextField();

		GroupLayout l = new GroupLayout(this);
		l.setHorizontalGroup(l.createParallelGroup(Alignment.LEADING)
				.addGroup(l.createSequentialGroup().addComponent(lEmp).addGap(5, 5, 5)
						.addComponent(tEmp, 400, 400, Integer.MAX_VALUE).addGap(5, 5, 5).addComponent(lPro)
						.addGap(5, 5, 5).addComponent(tPro, 250, 250, 250))
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

				));

		l.setVerticalGroup(
				l.createSequentialGroup().addContainerGap(5, Integer.MAX_VALUE)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lEmp).addComponent(tEmp)
								.addComponent(lPro).addComponent(tPro))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lEnd).addComponent(tEnd)
								.addComponent(lNro).addComponent(tNro).addComponent(lCom).addComponent(tCom))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lBai).addComponent(tBai)
								.addComponent(lCid).addComponent(tCid).addComponent(lEst).addComponent(tEst)
								.addComponent(lCEP).addComponent(tCEP))
						.addGap(15, 15, 15)
						.addGroup(l.createParallelGroup(Alignment.BASELINE).addComponent(lEma).addComponent(tEma)
								.addComponent(lTel).addComponent(tTel).addComponent(lCel).addComponent(tCel)

						).addContainerGap(5, Integer.MAX_VALUE));

		this.setLayout(l);
	}

}
