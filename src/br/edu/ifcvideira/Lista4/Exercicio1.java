//1 – Faça um programa em JAVA que cria um vetor com 5 elementos inteiros, lê 5
//números do teclado, armazena os números no vetor e imprime o vetor na ordem
//inversa.
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vet[] = new int [5];
		int i = 0;
		
		for ( i = 0; i < 5;i++) {
			System.out.println("Digite um número inteiro para a posição "+(i+1));
			vet[i] = Integer.parseInt(in.nextLine());
		}
		System.out.println("Dados do vetor:");
		for (i= 4; i >= 0;i--) {
			System.out.println(vet[i]);
		}
		in.close();
	}
}
