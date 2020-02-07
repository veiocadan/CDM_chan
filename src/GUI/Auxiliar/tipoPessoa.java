package GUI.Auxiliar;

import GUI.Entidades.Cadastro.Pessoal.Demolay;
import GUI.Entidades.Cadastro.Pessoal.Macom;
import GUI.Entidades.Cadastro.Pessoal.Pessoa;
import Modelos.Entidades.Pessoal.*;

public enum tipoPessoa {

	MACOM(1),DEMOLAY(2),FAMILIAR(3);
	
	Pessoa gui;
	Modelos.Entidades.Pessoal.Pessoa modelo;
	GUI.Entidades.Registro.Pessoal.Pessoa guiReg;
	String[] nomes;
	int[] tamanhos;
	
	tipoPessoa(int i) {
		
		switch (i) {
		case 1:
			gui = new Macom();
			modelo = new Modelos.Entidades.Pessoal.Macom();
			guiReg = new GUI.Entidades.Registro.Pessoal.Macom();
			nomes = new String[] {"ID","Nome","Grau","Organização","Atividade","Detalhes","Editar","Remover"};
			tamanhos = new int[] {30, 80, 80,Integer.MAX_VALUE,60,60,60,60};
			break;
		case 2:
			gui = new Demolay();
			modelo = new Modelos.Entidades.Pessoal.Demolay();
			guiReg = new GUI.Entidades.Registro.Pessoal.Demolay();
			nomes = new String[] {"ID","Nome", "Sexo","Detalhes","Editar","Remover"};
			tamanhos = new int[] {30, Integer.MAX_VALUE, 80,60,60,60};
			break;
		case 3:
			gui = new Demolay();
			modelo = new Modelos.Entidades.Pessoal.Demolay();
			guiReg = new GUI.Entidades.Registro.Pessoal.Demolay();
			nomes = new String[] {"ID","Nome", "Sexo","Detalhes","Editar","Remover"};
			tamanhos = new int[] {30, Integer.MAX_VALUE, 80,60,60,60};
			break;
		}
	}
	
	public Pessoa getGui() {
		return gui;
	}
	
	public Modelos.Entidades.Pessoal.Pessoa getModelo(){
		return modelo;
	}
	
	public GUI.Entidades.Registro.Pessoal.Pessoa getGuiReg() {
		return guiReg;
	}
	
	public String[] getColunas() {
		return nomes;
	}
	
	public int[] getTamanhos() {
		return tamanhos;
	}
}
