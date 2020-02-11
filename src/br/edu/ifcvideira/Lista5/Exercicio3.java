//3 = Faça um programa que receba uma única String de números inteiros
//separados por ';'. Apresente o maior e menor número dessa String 
// Dica: Utilize Split() da classe String

package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

//3 - Faça um programa que receba uma única String de números inteiros
//separados por ’;’(ponto e vírgula). Apresente o maior e o menor número dessa
//String. Dica: utilize o método split() da classe String.
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String numeros;
		String inteiros [];
		int maior = 0;
		int menor = 0;
		int i;
		
		System.out.println("Escreva a string:");
		numeros = String.valueOf(in.nextLine());
		
		inteiros = numeros.split(";");
		
		for (i = 0; i < inteiros.length;i++) {
			if(i == 0) {
				maior = Integer.parseInt(inteiros[i]);
				menor = Integer.parseInt(inteiros[i]);
			}
			
			if(menor > Integer.parseInt(inteiros[i])) {
				menor = Integer.parseInt(inteiros[i]);
			} 
			
			if(maior < Integer.parseInt(inteiros[i])) {
				maior = Integer.parseInt(inteiros[i]);
			}
		}
		System.out.println("O maior número é: "+maior+"\n"
				+"E o menor é:" +menor);
		in.close();
	}
}
