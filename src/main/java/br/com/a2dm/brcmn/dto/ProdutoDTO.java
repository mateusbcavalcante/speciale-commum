package br.com.a2dm.brcmn.dto;

import java.math.BigInteger;

public class ProdutoDTO {

	private BigInteger idPedidoProduto;
	private BigInteger idProduto;
	private String desProduto;
	private BigInteger qtdLoteMinimo;
	private BigInteger qtdMultiplo;
	private BigInteger qtdSolicitada;
	private String flgAtivo;
	private Double valorUnitario;
	private String unidade;
	private BigInteger codigoFamiliaOmie;
	private String descricaoFamilia;
	
	public BigInteger getIdPedidoProduto() {
		return idPedidoProduto;
	}
	
	public void setIdPedidoProduto(BigInteger idPedidoProduto) {
		this.idPedidoProduto = idPedidoProduto;
	}

	public BigInteger getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(BigInteger idProduto) {
		this.idProduto = idProduto;
	}

	public String getDesProduto() {
		return desProduto;
	}

	public void setDesProduto(String desProduto) {
		this.desProduto = desProduto;
	}

	public BigInteger getQtdLoteMinimo() {
		return qtdLoteMinimo;
	}

	public void setQtdLoteMinimo(BigInteger qtdLoteMinimo) {
		this.qtdLoteMinimo = qtdLoteMinimo;
	}

	public BigInteger getQtdMultiplo() {
		return qtdMultiplo;
	}

	public void setQtdMultiplo(BigInteger qtdMultiplo) {
		this.qtdMultiplo = qtdMultiplo;
	}

	public BigInteger getQtdSolicitada() {
		return qtdSolicitada;
	}

	public void setQtdSolicitada(BigInteger qtdSolicitada) {
		this.qtdSolicitada = qtdSolicitada;
	}

	public String getFlgAtivo() {
		return flgAtivo;
	}

	public void setFlgAtivo(String flgAtivo) {
		this.flgAtivo = flgAtivo;
	}
	
	public Double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public BigInteger getCodigoFamiliaOmie() {
		return codigoFamiliaOmie;
	}

	public void setCodigoFamiliaOmie(BigInteger codigoFamiliaOmie) {
		this.codigoFamiliaOmie = codigoFamiliaOmie;
	}

	public String getDescricaoFamilia() {
		return descricaoFamilia;
	}

	public void setDescricaoFamilia(String descricaoFamilia) {
		this.descricaoFamilia = descricaoFamilia;
	}

}
