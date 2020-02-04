package Modelos.Entidades.Pessoa;

import java.util.Date;

import Modelos.Entidades.Contato.Contato;

public abstract class Pessoa {

	protected String id, id_geral, nome, empresa, profissao, observacoes;
	protected Contato residencial, comercial;
	protected Date nascimento;

	public Pessoa() {

	}

	public Pessoa(String id, String id_geral, String nome, String endereco, String numero, String complemento,
			String bairro, String cidade, String estado, String cep, String email, String telefone, String celular,
			String empresa, String profissao, String endereco_com, String numero_com, String complemento_com,
			String bairro_com, String cidade_com, String estado_com, String cep_com, String email_com,
			String telefone_com, String celular_com, String observacoes, Date nascimento) {
		super();
		this.id = id;
		this.id_geral = id_geral;
		this.nome = nome;
		this.residencial = new Contato(endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, celular);
		this.empresa = empresa;
		this.profissao = profissao;
		this.comercial = new Contato(endereco_com, numero_com, complemento_com, bairro_com, cidade_com, estado_com, cep_com, email_com, telefone_com, celular_com);
		this.observacoes = observacoes;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId_geral() {
		return id_geral;
	}

	public void setId_geral(String id_geral) {
		this.id_geral = id_geral;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato getResidencial () {
		return residencial;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Contato getComercial () {
		return comercial;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", id_geral=" + id_geral + ", nome=" + nome + ", " + residencial.toString()
				+ ", empresa=" + empresa + ", profissao=" + profissao + ","+ comercial.toString() + ", observacoes="
				+ observacoes + ", nascimento=" + nascimento + "]";
	}

}
