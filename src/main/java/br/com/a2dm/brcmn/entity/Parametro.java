package br.com.a2dm.brcmn.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/** 
 * @author Carlos Diego
 * @since 05/08/2016
 */

@Entity
@Table(name = "tb_parametro", schema="ped")
@Proxy(lazy = true)
public class Parametro implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_parametro")
	private BigInteger idParametro;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "valor")
	private String valor;


	public BigInteger getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(BigInteger idParametro) {
		this.idParametro = idParametro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
