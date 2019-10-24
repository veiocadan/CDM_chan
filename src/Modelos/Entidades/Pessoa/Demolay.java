package Modelos.Entidades.Pessoa;

import java.util.Date;

public class Demolay extends Pessoa{

	private String sisdm, capitulo, num_capitulo, cid_capitulo, potencia, grau, cavalaria, ativo;
	private Date iniciacao, elevacao;
	
	public Demolay() {
		
	}

	public Demolay(String id, String id_geral, String nome, String endereco, String numero, String complemento,
			String bairro, String cidade, String estado, String cep, String email, String telefone, String celular,
			String empresa, String profissao, String endereco_com, String numero_com, String complemento_com,
			String bairro_com, String cidade_com, String estado_com, String cep_com, String email_com,
			String telefone_com, String celular_com, String observacoes, String foto, Date nascimento, String sisdm,
			String capitulo, String num_capitulo, String cid_capitulo, String potencia, String grau, String cavalaria,
			String ativo, Date iniciacao, Date elevacao) {
		super(id, id_geral, nome, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, celular,
				empresa, profissao, endereco_com, numero_com, complemento_com, bairro_com, cidade_com, estado_com,
				cep_com, email_com, telefone_com, celular_com, observacoes, foto, nascimento);
		this.sisdm = sisdm;
		this.capitulo = capitulo;
		this.num_capitulo = num_capitulo;
		this.cid_capitulo = cid_capitulo;
		this.potencia = potencia;
		this.grau = grau;
		this.cavalaria = cavalaria;
		this.ativo = ativo;
		this.iniciacao = iniciacao;
		this.elevacao = elevacao;
	}

	public String getSisdm() {
		return sisdm;
	}

	public void setSisdm(String sisdm) {
		this.sisdm = sisdm;
	}

	public String getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(String capitulo) {
		this.capitulo = capitulo;
	}

	public String getNum_capitulo() {
		return num_capitulo;
	}

	public void setNum_capitulo(String num_capitulo) {
		this.num_capitulo = num_capitulo;
	}

	public String getCid_capitulo() {
		return cid_capitulo;
	}

	public void setCid_capitulo(String cid_capitulo) {
		this.cid_capitulo = cid_capitulo;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	public String getCavalaria() {
		return cavalaria;
	}

	public void setCavalaria(String cavalaria) {
		this.cavalaria = cavalaria;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public Date getIniciacao() {
		return iniciacao;
	}

	public void setIniciacao(Date iniciacao) {
		this.iniciacao = iniciacao;
	}

	public Date getElevacao() {
		return elevacao;
	}

	public void setElevacao(Date elevacao) {
		this.elevacao = elevacao;
	}

	@Override
	public String toString() {
		return "Demolay [sisdm=" + sisdm + ", capitulo=" + capitulo + ", num_capitulo=" + num_capitulo
				+ ", cid_capitulo=" + cid_capitulo + ", potencia=" + potencia + ", grau=" + grau + ", cavalaria="
				+ cavalaria + ", ativo=" + ativo + ", iniciacao=" + iniciacao + ", elevacao=" + elevacao + ", id=" + id
				+ ", id_geral=" + id_geral + ", nome=" + nome + ", endereco=" + endereco + ", numero=" + numero
				+ ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
				+ ", cep=" + cep + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + ", empresa="
				+ empresa + ", profissao=" + profissao + ", endereco_com=" + endereco_com + ", numero_com=" + numero_com
				+ ", complemento_com=" + complemento_com + ", bairro_com=" + bairro_com + ", cidade_com=" + cidade_com
				+ ", estado_com=" + estado_com + ", cep_com=" + cep_com + ", email_com=" + email_com + ", telefone_com="
				+ telefone_com + ", celular_com=" + celular_com + ", observacoes=" + observacoes + ", foto=" + foto
				+ ", nascimento=" + nascimento + "]";
	}
	
	
}
