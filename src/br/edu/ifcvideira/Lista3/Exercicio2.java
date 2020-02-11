//2 - Faça um programa em JAVA que lê um número real do teclado e calcula o
//fatorial deste número. (ex: 5! é igual a 5 * 4 * 3 * 2 * 1 = 120).
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o número:");
		num = Integer.parseInt(in.nextLine());
		
		for (int i = num-1; i > 0; i--) {
			num = (num * i);
		}
		System.out.println("O fatorial é: "+num);
		in.close();
	}
}	
