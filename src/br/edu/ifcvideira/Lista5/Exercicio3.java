//3 = Fa�a um programa que receba uma �nica String de n�meros inteiros
//separados por ';'. Apresente o maior e menor n�mero dessa String 
// Dica: Utilize Split() da classe String

package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

//3 - Fa�a um programa que receba uma �nica String de n�meros inteiros
//separados por �;�(ponto e v�rgula). Apresente o maior e o menor n�mero dessa
//String. Dica: utilize o m�todo split() da classe String.
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
		System.out.println("O maior n�mero �: "+maior+"\n"
				+"E o menor �:" +menor);
		in.close();
	}
}
