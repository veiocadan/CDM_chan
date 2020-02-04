package Modelos.Entidades.Pessoa;

import java.util.Date;

public class Outros extends Pessoa {

	private String sexo;

	public Outros() {

	}

	public Outros(String id, String id_geral, String nome, String endereco, String numero, String complemento,
			String bairro, String cidade, String estado, String cep, String email, String telefone, String celular,
			String empresa, String profissao, String endereco_com, String numero_com, String complemento_com,
			String bairro_com, String cidade_com, String estado_com, String cep_com, String email_com,
			String telefone_com, String celular_com, String observacoes, Date nascimento, String sexo) {
		super(id, id_geral, nome, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, celular,
				empresa, profissao, endereco_com, numero_com, complemento_com, bairro_com, cidade_com, estado_com,
				cep_com, email_com, telefone_com, celular_com, observacoes, nascimento);
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Outros [sexo=" + sexo + ", id=" + id + ", id_geral=" + id_geral + ", nome=" + nome +  this.residencial.toString() + ", empresa="
				+ empresa + ", profissao=" + profissao + this.comercial.toString() + ", observacoes=" + observacoes + ", nascimento=" + nascimento + "]";
	}
	
	
}
