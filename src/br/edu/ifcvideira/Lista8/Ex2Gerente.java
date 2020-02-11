package br.edu.ifcvideira.Lista8;

public class Ex2Gerente extends Ex2Funcionario{

	public Ex2Gerente() {
		
	}

	public Ex2Gerente(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
		
	}
	
	public double calculaSalario() {
		return this.getSalario() * 1.5;
	}
	
	
}
