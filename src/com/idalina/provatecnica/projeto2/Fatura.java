package com.idalina.provatecnica.projeto2;

public class Fatura {
	private String numero;
	private String descricao;
	private int qtdCompradaItem;
	private double precoItem;

	public double getTotalFatura() {
		
		return (qtdCompradaItem < 1 || precoItem < 1)? 0 : (precoItem * qtdCompradaItem); 

	}

	public void quantidadeCompradaItem(int qtdCompradaItem) {
		this.qtdCompradaItem = qtdCompradaItem;
	}

	public void numero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdCompradaItem() {
		return qtdCompradaItem;
	}

	public void setQtdCompradaItem(int qtdCompradaItem) {
		this.qtdCompradaItem = qtdCompradaItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

}
