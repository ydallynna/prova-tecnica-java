package com.idalina.provatecnica.projeto3;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	public static int totalEmpregados;

	public Empregado(String nome, String sobrenome, double salario) {
		this();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salario;

	}

	public Empregado() {
		totalEmpregados++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {

		if (salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			System.out.println("Salário negativo, não esperado");
		}
	}
}
