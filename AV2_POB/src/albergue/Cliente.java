package albergue;

import java.util.Date;

public class Cliente {
	/*
	 * 
	 * A classe Cliente possui os seguintes atributos: id, nome, endereço, postalCode, pais, cpf,
Passaporte, email, dataNascimento.

	 */
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id, String nome, String endereco, int postalCode, String pais, int cpf, String passaporte,
			String email, Date dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.postalCode = postalCode;
		this.pais = pais;
		this.cpf = cpf;
		this.passaporte = passaporte;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	
	
	int id;
	String nome;
	String endereco;
	int postalCode;
	String pais;
	int cpf;
	String passaporte;
	String email;
	Date dataNascimento;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
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
	
	public int getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getPassaporte() {
		return passaporte;
	}
	
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", postalCode=" + postalCode
				+ ", pais=" + pais + ", cpf=" + cpf + ", passaporte=" + passaporte + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + "]";
	}
	
	
	
	
	
}
