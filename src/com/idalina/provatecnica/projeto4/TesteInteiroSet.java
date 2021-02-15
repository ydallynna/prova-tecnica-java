package com.idalina.provatecnica.projeto4;

public class TesteInteiroSet {

	public static void main(String[] args) {
		
		InteiroSet conjuntos1 = new InteiroSet();
		InteiroSet conjuntos2 = new InteiroSet();
		
		System.out.println(conjuntos1);
		System.out.println(conjuntos2);
		
		conjuntos1.insereElemento(1);
		conjuntos1.insereElemento(2);
		conjuntos1.insereElemento(3);
		conjuntos1.insereElemento(4);
		conjuntos1.insereElemento(5);

		conjuntos2.insereElemento(6);
		conjuntos2.insereElemento(7);
		conjuntos2.insereElemento(8);
		conjuntos2.insereElemento(9);
		conjuntos2.insereElemento(0);
		
		System.out.println(conjuntos1);
		System.out.println(conjuntos2);
		
		System.out.println(" ");
		System.out.println(InteiroSet.interseccao(conjuntos1, conjuntos2)); 
		System.out.println(InteiroSet.union(conjuntos1, conjuntos2) ); 
		
		conjuntos1.deleteElemento(1);
		conjuntos1.deleteElemento(2);
		conjuntos1.deleteElemento(3);
		
		System.out.println(" ");
		System.out.println(conjuntos1);

		System.out.println(" ");
		System.out.println(conjuntos1.toSetString());

		System.out.println(" ");
		System.out.println(conjuntos2.toSetString());

	}

}
