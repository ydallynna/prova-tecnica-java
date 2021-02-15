package com.idalina.provatecnica.projeto1;

// item 6

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private Marca marca;
	private String chassi;
	private Proprietario proprietario;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	private int numeroDePortas;
	private boolean temTetoSolar;
	private int numeroDeMarchas;
	private boolean temCambioAutomatico;
	private double volumeDeCombustivel;

	// item 7

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public boolean isTemTetoSolar() {
		return temTetoSolar;
	}

	public void setTemTetoSolar(boolean temTetoSolar) {
		this.temTetoSolar = temTetoSolar;
	}

	public int getNumeroDeMarchas() {
		return numeroDeMarchas;
	}

	public void setNumeroDeMarchas(int numeroDeMarchas) {
		this.numeroDeMarchas = numeroDeMarchas;
	}

	public boolean isTemCambioAutomatico() {
		return temCambioAutomatico;
	}

	public void setTemCambioAutomatico(boolean temCambioAutomatico) {
		this.temCambioAutomatico = temCambioAutomatico;
	}

	public double getVolumeDeCombustivel() {
		return volumeDeCombustivel;
	}

	public void setVolumeDeCombustivel(double volumeDeCombustivel) {
		this.volumeDeCombustivel = volumeDeCombustivel;
	}

	// método acelera com retorno item 8
	public void acelerar() {
		velocidadeAtual = velocidadeAtual++;
	}

	// método freia item 9
	public void freiar() {
		velocidadeAtual = velocidadeAtual--;
	}

	// método troca marcha item 10
	public void trocarMarcha() {
	}

	// método reduz marcha item 11
	public void reduzMarcha() {
	}

	// Construtor veiculo passando proprietario como parametro item 15
	public Carro(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	// método marcha ré item 16
	public void marchaRe() {
		try {
			if (velocidadeAtual > 0)
				throw new VelocidadeMarchaReException("Velocidade maior que zero.");
			System.out.println("Marcha Ré engatada.");

		} catch (VelocidadeMarchaReException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Método marcha ré foi chamado.");
	}

	// metodo com retorno item 17
	public double obterAutonomia(int consumoMedio) {

		//System.out.println("Método obter autonomia foi chamado.");
		return volumeDeCombustivel * consumoMedio;

	}
	
	// Criacao do metodo exibirAutonomia item 18
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + volumeDeCombustivel * velocidadeAtual + " km.");
	}
}
