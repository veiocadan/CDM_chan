package Modelos.Entidades.Pessoa;

import java.util.Date;

public class Macom extends Pessoa {

	private String cim, loja, num_loja, oriente, potencia, grau, grau_superior, superior, ativo;
	private Date iniciacao, elevacao, exaltacao, instalacao;
	
	public Macom() {
		
	}

	public Macom(String id, String id_geral, String nome, String endereco, String numero, String complemento,
			String bairro, String cidade, String estado, String cep, String email, String telefone, String celular,
			String empresa, String profissao, String endereco_com, String numero_com, String complemento_com,
			String bairro_com, String cidade_com, String estado_com, String cep_com, String email_com,
			String telefone_com, String celular_com, String observacoes, String foto, Date nascimento, String cim,
			String loja, String num_loja, String oriente, String potencia, String grau, String grau_superior,
			String superior, String ativo, Date iniciacao, Date elevacao, Date exaltacao, Date instalacao) {
		super(id, id_geral, nome, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, celular,
				empresa, profissao, endereco_com, numero_com, complemento_com, bairro_com, cidade_com, estado_com,
				cep_com, email_com, telefone_com, celular_com, observacoes, foto, nascimento);
		this.cim = cim;
		this.loja = loja;
		this.num_loja = num_loja;
		this.oriente = oriente;
		this.potencia = potencia;
		this.grau = grau;
		this.grau_superior = grau_superior;
		this.superior = superior;
		this.ativo = ativo;
		this.iniciacao = iniciacao;
		this.elevacao = elevacao;
		this.exaltacao = exaltacao;
		this.instalacao = instalacao;
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getNum_loja() {
		return num_loja;
	}

	public void setNum_loja(String num_loja) {
		this.num_loja = num_loja;
	}

	public String getOriente() {
		return oriente;
	}

	public void setOriente(String oriente) {
		this.oriente = oriente;
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

	public String getGrau_superior() {
		return grau_superior;
	}

	public void setGrau_superior(String grau_superior) {
		this.grau_superior = grau_superior;
	}

	public String getSuperior() {
		return superior;
	}

	public void setSuperior(String superior) {
		this.superior = superior;
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

	public Date getExaltacao() {
		return exaltacao;
	}

	public void setExaltacao(Date exaltacao) {
		this.exaltacao = exaltacao;
	}

	public Date getInstalacao() {
		return instalacao;
	}

	public void setInstalacao(Date instalacao) {
		this.instalacao = instalacao;
	}

	@Override
	public String toString() {
		return "Macom [cim=" + cim + ", loja=" + loja + ", num_loja=" + num_loja + ", oriente=" + oriente
				+ ", potencia=" + potencia + ", grau=" + grau + ", grau_superior=" + grau_superior + ", superior="
				+ superior + ", ativo=" + ativo + ", iniciacao=" + iniciacao + ", elevacao=" + elevacao + ", exaltacao="
				+ exaltacao + ", instalacao=" + instalacao + ", id=" + id + ", id_geral=" + id_geral + ", nome=" + nome
				+ ", endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro="
				+ bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", email=" + email
				+ ", telefone=" + telefone + ", celular=" + celular + ", empresa=" + empresa + ", profissao="
				+ profissao + ", endereco_com=" + endereco_com + ", numero_com=" + numero_com + ", complemento_com="
				+ complemento_com + ", bairro_com=" + bairro_com + ", cidade_com=" + cidade_com + ", estado_com="
				+ estado_com + ", cep_com=" + cep_com + ", email_com=" + email_com + ", telefone_com=" + telefone_com
				+ ", celular_com=" + celular_com + ", observacoes=" + observacoes + ", foto=" + foto + ", nascimento="
				+ nascimento + "]";
	}

	
}
