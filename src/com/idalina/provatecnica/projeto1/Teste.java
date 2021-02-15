package com.idalina.provatecnica.projeto1;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		 
		Endereco endereco = new Endereco();
		endereco.setRua("Rua das Flores");
		endereco.setComplemento("Casa Flor de Lis");
		endereco.setBairro("Jardim das Flores");
		endereco.setCidade("Jardim");
		endereco.setEstado("São Paulo");
		endereco.setCep("0123-123");
		
		Marca marca = new Marca(); 
		marca.setNome("Fiat");
		marca.setNrDeModelos(1200);
		marca.setAnoLancamento(2020);
		marca.setCodigoIdentificador(10);
		marca.setChassi("123GC13123FSDFFD");
		
		Date dataDeNascimento = new Date();
		
		
		Proprietario proprietario = new Proprietario("Idalina camila", "123.456.789-01", "12.345.678.0X", endereco);
		proprietario.setDataDeNascimento(dataDeNascimento);
		
		Carro veiculo = new Carro(proprietario);
		veiculo.setAno(2019);
		veiculo.setCor("vermelha");
		veiculo.setNumeroDeMarchas(5);
		veiculo.setNumeroDePortas(5);
		veiculo.setTemCambioAutomatico(false);
		veiculo.setTemTetoSolar(false);
		veiculo.setVelocidadeAtual(10);
		veiculo.setVelocidadeMaxima(180);
		veiculo.setVolumeDeCombustivel(10);
	}

}
