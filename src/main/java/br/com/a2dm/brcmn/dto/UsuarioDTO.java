package br.com.a2dm.brcmn.dto;

import java.math.BigInteger;

public class UsuarioDTO {

	private BigInteger idUsuario;
	private BigInteger idCliente;
	private BigInteger idGrupo;
	private BigInteger idTabelaPrecoOmie;
	private BigInteger idExternoOmie;
	private String nome;
	private String login;
	private String email;
	private String cpf;
	private String telefone;
	
	public BigInteger getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(BigInteger idUsuario) {
		this.idUsuario = idUsuario;
	}

	public BigInteger getIdCliente() {
		return idCliente;
	}
	
	public BigInteger getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(BigInteger idGrupo) {
		this.idGrupo = idGrupo;
	}

	public void setIdCliente(BigInteger idCliente) {
		this.idCliente = idCliente;
	}
	
	public BigInteger getIdTabelaPrecoOmie() {
		return idTabelaPrecoOmie;
	}

	public void setIdTabelaPrecoOmie(BigInteger idTabelaPrecoOmie) {
		this.idTabelaPrecoOmie = idTabelaPrecoOmie;
	}
	
	public BigInteger getIdExternoOmie() {
		return idExternoOmie;
	}

	public void setIdExternoOmie(BigInteger idExternoOmie) {
		this.idExternoOmie = idExternoOmie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
