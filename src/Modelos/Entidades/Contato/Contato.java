package Modelos.Entidades.Contato;

public class Contato {

	protected String endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone,
	celular;
	
	public Contato() {
		
	}

	public Contato(String endereco, String numero, String complemento, String bairro, String cidade, String estado,
			String cep, String email, String telefone, String celular) {
		super();
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
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Contato [endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro="
				+ bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", email=" + email
				+ ", telefone=" + telefone + ", celular=" + celular + "]";
	} 
	
	
	
	
}
