//5 - Crie uma classe chamada "Livro", que contenha os atributos PRIVADOS:
//"titulo" do tipo String;
//"autor" do tipo String;
//"ano" do tipo int;
//Crie uma classe main que faça uso da classe Livro, e crie três objetos contendo os
//seguintes valores:
//PRIMEIRO LIVRO
//(Titulo = "Fundamentos da programação de computadores"; Autor = "Ascencio";
//Ano = 2012)
//SEGUNDO LIVRO
//(Titulo = "Programação com C"; Autor = "Professor X"; Ano = 2010) TERCEIRO LIVRO
//(Titulo = "Programação com Java"; Autor = "Professor Y"; Ano = 2013)
//Ao final imprimir o conteúdo
package br.edu.ifcvideira.Lista7;

public class Ex5Livro {
	private String titulo;
	private String autor;
	private int ano;
	

	public Ex5Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}
}
	

