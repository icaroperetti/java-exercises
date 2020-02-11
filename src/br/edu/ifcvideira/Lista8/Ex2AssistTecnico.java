package br.edu.ifcvideira.Lista8;

public class Ex2AssistTecnico extends Ex2Funcionario{

	public Ex2AssistTecnico() {
		
	}

	public Ex2AssistTecnico(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
	
	}
	
	public double calculaSalario() {
		return this.getSalario() * 1.2;
	}
	
	
}
