package br.edu.ifcvideira.Lista8;

public class Ex3Animal {
	private String nome;
	private String raca;
	
	public Ex3Animal() {
		
	}
	public Ex3Animal(String nome, String raca) {
		
		this.nome = nome;
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String late() {
		return "au au";
	}
	
}
