package br.edu.ifcvideira.Lista8;

public class Ex1Funcionario {
	private String nome;
	private double salario;
	private String cargo;
	
	//Vazio
	public Ex1Funcionario() {
		
	}
	
	//Com atributos
	public Ex1Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
}
