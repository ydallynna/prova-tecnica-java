package com.idalina.provatecnica.projeto2;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura fatura = new Fatura();
		fatura.setNumero("A1");   
		fatura.setDescricao("Item 01");
		fatura.setQtdCompradaItem(2);
		fatura.setPrecoItem(3.22);
		
		Fatura fatura1 = new Fatura();
		fatura1.setNumero("AB");   
		fatura1.setDescricao("Item 01");
		fatura1.setQtdCompradaItem(0);
		fatura1.setPrecoItem(1.29);

		Fatura fatura2 = new Fatura();
		fatura2.setNumero("B3");   
		fatura2.setDescricao("Item 01");
		fatura2.setQtdCompradaItem(10);
		fatura2.setPrecoItem(0);
		
		Fatura fatura3 = new Fatura();
		fatura3.setNumero("c3");   
		fatura3.setDescricao("Item 01");
		fatura3.setQtdCompradaItem(0);
		fatura3.setPrecoItem(0);
		
		
		
		System.out.println("Total da Fatura: " + fatura.getTotalFatura());
		System.out.println("Total da Fatura: " + fatura1.getTotalFatura());
		System.out.println("Total da Fatura: " + fatura2.getTotalFatura());
		System.out.println("Total da Fatura: " + fatura3.getTotalFatura());
		
		
	}

}
