package com.idalina.provatecnica.projeto3;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado();
		empregado1.setNome("Ingrid");
		empregado1.setSobrenome("Guimaraes");
		empregado1.setSalarioMensal(100.00);
				
		Empregado empregado2 = new Empregado();
		empregado2.setNome("Mariana");
		empregado2.setSobrenome("Bittencurt");
		empregado2.setSalarioMensal(200.00);
		
		System.out.println("Funcionario 1: " + empregado1.getNome() + " " + empregado1.getSobrenome() + " " + "\nsalario: " + empregado1.getSalarioMensal());
		System.out.println("\nFuncionario 2: " + empregado2.getNome() + " " + empregado2.getSobrenome() + " " + "\nsalario: " + empregado2.getSalarioMensal());
		
		empregado1.setSalarioMensal(empregado1.getSalarioMensal() + (empregado1.getSalarioMensal() * 0.10));
		empregado2.setSalarioMensal(empregado2.getSalarioMensal() + (empregado2.getSalarioMensal() * 0.10));
		
		System.out.println("\nCom acrescimo 10 %: \n" + "Funcionario 1: " + empregado1.getNome() + " " + "Salario: " + empregado1.getSalarioMensal() );
		System.out.println("Funcionario 2: " + empregado2.getNome() + " " + "Salario: " + empregado2.getSalarioMensal());
		
			
		System.out.println("\nSalario anual apos 10%: \n" + "Funcionario 1: " + empregado1.getNome() + " " + "Salario: " + empregado1.getSalarioMensal() * 12 );
		System.out.println("Funcionario 2: " + empregado2.getNome() + " " + "Salario: " + empregado2.getSalarioMensal() * 12);
		
		System.out.println("\nTotal de Funcionarios: " + Empregado.totalEmpregados);
		
	
	}

}
