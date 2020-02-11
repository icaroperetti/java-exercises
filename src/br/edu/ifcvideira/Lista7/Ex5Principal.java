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

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex5Principal {
	public static void main(String[] args) {
		Ex5Livro l1 = new Ex5Livro("Fundamentos da programação de computadores", "Ascencio", 2012);
		Ex5Livro l2 = new Ex5Livro("Programação com C","Professor X",2012);
		Ex5Livro l3 = new Ex5Livro("Programação com java","Professor Y",2013);
		
		ArrayList<Ex5Livro> livros = new ArrayList<Ex5Livro>();
		
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		for (Ex5Livro livro : livros) {
			JOptionPane.showMessageDialog(null,"O nome do livro é:"+livro.getTitulo()+"\n"
					+ "O nome do autor é: "+livro.getAutor()+"\n"
					+ "O ano é: "+livro.getAno());
		}	
	}
}
