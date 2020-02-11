//3 - Faça um programa em JAVA que pede para o operador digitar o nome de uma
//pessoa, sua idade e seu salário (double). Em seguida o programa deve imprimi-los
//na tela.

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		System.out.println("Qual o nome da pessoa?: ");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Qual a idade?: ");
		idade = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual salário?: ");
		salario = Double.parseDouble(in.nextLine());
		
		System.out.println("Dados da pessoa: \n"
				+ "Nome: "+nome+"\n"
					+ "Idade:"+idade+"\n"
						+ "Salario: R$"+salario);
		in.close();
	}
}
