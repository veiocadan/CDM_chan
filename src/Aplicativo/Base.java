package Aplicativo;

import javax.swing.JFrame;

import Auxiliares.Cripto.CriptoOpcoes;
import GUI.Entidades.FrameTeste;

public class Base {

	
	public static void main(String[] args) {

		FrameTeste ft = new FrameTeste();
		ft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
/*		try {
		Auxiliares.Cripto.encriptar("teste.txt", "testesCriptado.txt", CriptoOpcoes.SOFT_ENCODE);
		Auxiliares.Cripto.decriptar("testesCriptado.txt", "testesDecriptado.txt", CriptoOpcoes.SOFT_DECODE);
		}catch (Exception e) {
			e.printStackTrace();
		}
*/
	}
	
}
