package br.com.a2dm.brcmn.dto;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import br.com.a2dm.brcmn.domain.OmieCaracteristicaCliente;

public class ClienteIntegracaoDTO {

	private BigInteger idExternoOmie;
	private String nomeCliente;
	private String cidade;
	private String estado;
	private Map<String, OmieCaracteristicaCliente> caracteristicas = new HashMap<>();

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

	public Map<String, OmieCaracteristicaCliente> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Map<String, OmieCaracteristicaCliente> caracteristicas) {
		this.caracteristicas = caracteristicas != null ? caracteristicas : new HashMap<>();
	}

	public boolean isConsignado() {
		OmieCaracteristicaCliente tipo = caracteristicas.get(OmieCaracteristicaCliente.CAMPO_TIPO.toLowerCase());
		return tipo != null
				&& OmieCaracteristicaCliente.CONTEUDO_CONSIGNADO.equalsIgnoreCase(tipo.getConteudo());
	}

	public boolean isSupermercado() {
		OmieCaracteristicaCliente supermercado = caracteristicas
				.get(OmieCaracteristicaCliente.CAMPO_SUPERMERCADO.toLowerCase());
		return supermercado != null
				&& OmieCaracteristicaCliente.CONTEUDO_SIM.equalsIgnoreCase(supermercado.getConteudo());
	}
}
