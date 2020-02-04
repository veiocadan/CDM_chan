package Modelos.Entidades.Pessoa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Modelos.Entidades.Pessoa.Familiar.Parentesco;

@SuppressWarnings("unused")
public class Familiar extends Pessoa{

	private String sexo;
	private List<Parentesco> parentesco;
	
	public Familiar() {
		this.parentesco = new ArrayList<Parentesco>();
	}

	public Familiar(String id, String id_geral, String nome, String endereco, String numero, String complemento,
			String bairro, String cidade, String estado, String cep, String email, String telefone, String celular,
			String empresa, String profissao, String endereco_com, String numero_com, String complemento_com,
			String bairro_com, String cidade_com, String estado_com, String cep_com, String email_com,
			String telefone_com, String celular_com, String observacoes,  Date nascimento, String sexo) {
		super(id, id_geral, nome, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, celular,
				empresa, profissao, endereco_com, numero_com, complemento_com, bairro_com, cidade_com, estado_com,
				cep_com, email_com, telefone_com, celular_com, observacoes, nascimento);
		this.sexo = sexo;
		this.parentesco = new ArrayList<Parentesco>();
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Familiar [sexo=" + sexo + ", id=" + id + ", id_geral=" + id_geral + ", nome=" + nome +  this.residencial.toString() + ", empresa="
				+ empresa + ", profissao=" + profissao + this.comercial.toString() + ", observacoes=" + observacoes + ", nascimento=" + nascimento + "]";
	}
	
	public class Parentesco{
		
		private String id_resp, proximidade, id_familiar;
		
		public Parentesco() {
			
		}

		public Parentesco(String id_resp, String proximidade) {
			this.id_resp = id_resp;
			this.proximidade = proximidade;
			this.id_familiar = id_geral;
		}

		public String getId_resp() {
			return id_resp;
		}

		public void setId_resp(String id_resp) {
			this.id_resp = id_resp;
		}

		public String getProximidade() {
			return proximidade;
		}

		public void setProximidade(String proximidade) {
			this.proximidade = proximidade;
		}

		@Override
		public String toString() {
			return "Parentesco [id_resp=" + id_resp + ", proximidade=" + proximidade + ", id_familiar=" + id_familiar
					+ "]";
		}
		
		
	}
	
}
