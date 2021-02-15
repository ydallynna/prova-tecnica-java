package com.idalina.provatecnica.projeto1;

import java.util.Date; 

public class Proprietario {
	
	private String nome;
	private	String cpf;
	private	String rg;
	private	Date dataDeNascimento;
	private Endereco endereco; // item 12
	
	// item 4 e 14 alteracao do construtor.
	public Proprietario (String nome, String cpf, String rg, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}


	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
