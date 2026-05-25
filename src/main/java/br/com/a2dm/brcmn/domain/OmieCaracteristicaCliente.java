package br.com.a2dm.brcmn.domain;

public class OmieCaracteristicaCliente {

	public static final String CAMPO_TIPO = "Tipo";
	public static final String CAMPO_SUPERMERCADO = "Supermercado";
	public static final String CONTEUDO_CONSIGNADO = "CONSIGNADO";
	public static final String CONTEUDO_SIM = "SIM";

	private String campo;
	private String conteudo;

	public OmieCaracteristicaCliente() {
	}

	public OmieCaracteristicaCliente(String campo, String conteudo) {
		this.campo = campo;
		this.conteudo = conteudo;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
