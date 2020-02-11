package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex1Funcionario extends Ex1Pessoa {
	private int matricula;
	private double salario;
	
	public Ex1Funcionario() {
		
	}


	public Ex1Funcionario(String nome, String sobrenome,int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
		
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double primeiraParcela() {
		return this.getSalario() * 0.6;
	}
	
	public double segundaParcela() {
		return this.getSalario() * 0.4;
	}
	
	public void imprime () {
		JOptionPane.showMessageDialog(null, "Dados do funcionario\n"
				 +"Nome completo:"+nomeCompleto()+"\n"
				 		+ "Primeira parcela do salario:"+primeiraParcela()+"\n"
				 				+ "Segunda parcela:"+segundaParcela());
	}
}
