//6 - Escreva um programa em JAVA que lê um número inteiro do teclado e imprime
//todos os seus divisores de resto 0.

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero=0;
		int divisor=0;
		int resultado;
		System.out.println("Digite o numero: ");
		numero = Integer.parseInt(in.nextLine());
		
		for (int i = 1; i <= numero;i++) {
				divisor++;
				resultado = numero % divisor;
				if ( resultado == 0) {
					System.out.println("É divisor de: "+ divisor);
				}
				in.close();
		}
	}
}
