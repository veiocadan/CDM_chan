package GUI.Auxiliar;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextFormatter {

	public static void Data(JTextField jtf) {

		jtf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

				String full = null;
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_SLASH))) {
					full = ((JTextField) e.getSource()).getText();
					((JTextField) e.getSource())
							.setText(((JTextField) e.getSource()).getText().replace(Character.toString(c), ""));
				}
				if (((JTextField) e.getSource()).getText().length() > 10) {
					((JTextField) e.getSource()).setText(((JTextField) e.getSource()).getText().substring(0,
							((JTextField) e.getSource()).getText().length() - 1));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		jtf.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (((JTextField) e.getSource()).getText().length() != 0) {
					try {
						int ano, mes, dia, diamax;
						String data = ((JTextField) e.getSource()).getText();
						Calendar cal = Calendar.getInstance();
						Calendar cal2 = Calendar.getInstance();
						ano = Integer.parseInt(data.split("/")[2]);
						mes = Integer.parseInt(data.split("/")[1]);
						dia = Integer.parseInt(data.split("/")[0]);
						cal.set(ano, (mes - 1), 1);

						if (ano > cal2.get(Calendar.YEAR) || ano < 1900) {
							throw new NumberFormatException();
						}
						if (mes > 12 || mes < 1) {
							throw new NumberFormatException();
						}
						if (dia < 1 || dia > cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
							throw new NumberFormatException();
						}
						if (((JTextField) e.getSource()).getText().length() != 10) {
							throw new NumberFormatException();
						}
					} catch (Exception ex) {
						String message = "Erro no formato de data. Use o formato dd/mm/yyyy.";
						JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
						((JTextField) e.getSource()).setText(null);
					}
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public static void Numero(JTextField jtf) {

		jtf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

				String full = null;
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE))) {
					full = ((JTextField) e.getSource()).getText();
					((JTextField) e.getSource())
							.setText(((JTextField) e.getSource()).getText().replace(Character.toString(c), ""));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	public static void CEP(JTextField jtf) {

		jtf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

				String full = null;
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_MINUS))) {
					full = ((JTextField) e.getSource()).getText();
					((JTextField) e.getSource())
							.setText(((JTextField) e.getSource()).getText().replace(Character.toString(c), ""));
				}
				if (((JTextField) e.getSource()).getText().length() > 9) {
					((JTextField) e.getSource()).setText(((JTextField) e.getSource()).getText().substring(0,
							((JTextField) e.getSource()).getText().length() - 1));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		jtf.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (((JTextField) e.getSource()).getText().length() != 0) {
					try {
						char[] c = ((JTextField) e.getSource()).getText().toCharArray();
						if (!Character.toString(c[5]).equals("-")) {
							throw new NumberFormatException();
						}

					} catch (Exception ex) {
						String message = "Erro no formato de CEP. Use o formato 00000-000.";
						JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
						((JTextField) e.getSource()).setText(null);
					}
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public static void Telefone(JTextField jtf) {

		jtf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

				String full = null;
				int c = e.getKeyCode();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_MINUS))) {

					full = ((JTextField) e.getSource()).getText();
					if (!(Character.toString(full.toCharArray()[full.length() - 1]) == "("||Character.toString(full.toCharArray()[full.length() - 1]) == ")")) {

						((JTextField) e.getSource())
								.setText(((JTextField) e.getSource()).getText().replace(Character.toString(c), ""));
					}
				}

				if (((JTextField) e.getSource()).getText().length() > 14) {
					((JTextField) e.getSource()).setText(((JTextField) e.getSource()).getText().substring(0,
							((JTextField) e.getSource()).getText().length() - 1));
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

		jtf.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (((JTextField) e.getSource()).getText().length() != 0) {
					try {
						char[] c = ((JTextField) e.getSource()).getText().toCharArray();
						if (!(Character.toString(c[8]).equals("-") || Character.toString(c[9]).equals("-"))) {
							throw new NumberFormatException();
						}
						if (!(Character.toString(c[0]).equals("(") && Character.toString(c[3]).equals(")"))) {
							throw new NumberFormatException();
						}
						if (((JTextField) e.getSource()).getText().length() < 13) {
							throw new NumberFormatException();
						}

					} catch (Exception ex) {
						String message = "Erro no formato de telefone. Use o formato (00)00000-0000.";
						JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
						((JTextField) e.getSource()).setText(null);
					}
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

}
