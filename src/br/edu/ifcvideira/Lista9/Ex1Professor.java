package br.edu.ifcvideira.Lista9;

public class Ex1Professor extends Ex1Funcionario{

	public Ex1Professor() {
		
	}

	public Ex1Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
		
	}
	
	public double primeiraParcela() {
		return this.getSalario() ;
	}
	
	public double segundaParcela() {
		return 0;
	}
	
	
}
