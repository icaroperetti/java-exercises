//1 - Faça uma classe Pessoa, que possui os seguintes atributos: nome e idade. A
//cada aniversário a idade desta pessoa aumenta um ano. Faça um método que
//represente este fato (ex: void fazAniversario()). Em seguida crie a classe main que
//deve criar 3 pessoas com nome e idade inicial, incremente suas idades utilizando
//o método fazAniversário, em seguida imprima o nome e idade destas pessoas.
package br.edu.ifcvideira.Lista7;

public class Ex1Pessoas {
	private String nome;
	private int idade;
	
	//Construtor vazio
	public Ex1Pessoas() {
		
	}
	//Construtor com os campos
	
	public Ex1Pessoas(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void fazAniversario(){
		this.setIdade(this.getIdade() + 1);
	}
}
