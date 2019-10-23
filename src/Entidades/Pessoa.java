package Entidades;

import java.util.Date;

public abstract class Pessoa {

	protected String id, id_geral, nome, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone,
			celular, empresa, profissao, endereco_com, numero_com, complemento_com, bairro_com, cidade_com, estado_com,
			cep_com, email_com, telefone_com, celular_com, observacoes, foto;
	protected Date nascimento;

	public Pessoa(String id, String id_geral, String nome, String endereco, String numero, String complemento,
			String bairro, String cidade, String estado, String cep, String email, String telefone, String celular,
			String empresa, String profissao, String endereco_com, String numero_com, String complemento_com,
			String bairro_com, String cidade_com, String estado_com, String cep_com, String email_com,
			String telefone_com, String celular_com, String observacoes, String foto, Date nascimento) {
		super();
		this.id = id;
		this.id_geral = id_geral;
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.empresa = empresa;
		this.profissao = profissao;
		this.endereco_com = endereco_com;
		this.numero_com = numero_com;
		this.complemento_com = complemento_com;
		this.bairro_com = bairro_com;
		this.cidade_com = cidade_com;
		this.estado_com = estado_com;
		this.cep_com = cep_com;
		this.email_com = email_com;
		this.telefone_com = telefone_com;
		this.celular_com = celular_com;
		this.observacoes = observacoes;
		this.foto = foto;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
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

	public String getEndereco_com() {
		return endereco_com;
	}

	public void setEndereco_com(String endereco_com) {
		this.endereco_com = endereco_com;
	}

	public String getNumero_com() {
		return numero_com;
	}

	public void setNumero_com(String numero_com) {
		this.numero_com = numero_com;
	}

	public String getComplemento_com() {
		return complemento_com;
	}

	public void setComplemento_com(String complemento_com) {
		this.complemento_com = complemento_com;
	}

	public String getBairro_com() {
		return bairro_com;
	}

	public void setBairro_com(String bairro_com) {
		this.bairro_com = bairro_com;
	}

	public String getCidade_com() {
		return cidade_com;
	}

	public void setCidade_com(String cidade_com) {
		this.cidade_com = cidade_com;
	}

	public String getEstado_com() {
		return estado_com;
	}

	public void setEstado_com(String estado_com) {
		this.estado_com = estado_com;
	}

	public String getCep_com() {
		return cep_com;
	}

	public void setCep_com(String cep_com) {
		this.cep_com = cep_com;
	}

	public String getEmail_com() {
		return email_com;
	}

	public void setEmail_com(String email_com) {
		this.email_com = email_com;
	}

	public String getTelefone_com() {
		return telefone_com;
	}

	public void setTelefone_com(String telefone_com) {
		this.telefone_com = telefone_com;
	}

	public String getCelular_com() {
		return celular_com;
	}

	public void setCelular_com(String celular_com) {
		this.celular_com = celular_com;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", id_geral=" + id_geral + ", nome=" + nome + ", endereco=" + endereco + ", numero="
				+ numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado="
				+ estado + ", cep=" + cep + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular
				+ ", empresa=" + empresa + ", profissao=" + profissao + ", endereco_com=" + endereco_com
				+ ", numero_com=" + numero_com + ", complemento_com=" + complemento_com + ", bairro_com=" + bairro_com
				+ ", cidade_com=" + cidade_com + ", estado_com=" + estado_com + ", cep_com=" + cep_com + ", email_com="
				+ email_com + ", telefone_com=" + telefone_com + ", celular_com=" + celular_com + ", observacoes="
				+ observacoes + ", foto=" + foto + ", nascimento=" + nascimento + "]";
	}

	
}
