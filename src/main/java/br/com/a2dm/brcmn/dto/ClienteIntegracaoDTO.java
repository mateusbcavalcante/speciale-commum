package br.com.a2dm.brcmn.dto;

import java.math.BigInteger;

public class ClienteIntegracaoDTO {

	private BigInteger idExternoOmie;
	private String nomeCliente;
	private String cidade;
	private String estado;

	public BigInteger getIdExternoOmie() {
		return idExternoOmie;
	}

	public void setIdExternoOmie(BigInteger idExternoOmie) {
		this.idExternoOmie = idExternoOmie;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
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
}
