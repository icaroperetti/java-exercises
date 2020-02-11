//8 - Faça um programa em JAVA que leia um vetor de 50 posições e o compacte,
//ou seja, elimine as posições com valor zero avançando uma posição, com os com
//os valores subsequentes do vetor. Dessa forma todos “zeros” devem ficar para as
//posições finais do vetor.

package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vet[] = new int[50];
		int j;
		int cont=0;
		Random r = new Random();
		
		for(j=0; j < 50;j++) {
			vet[j]=0;
		}
		
		for(j = 0;j < 50;j++) {
			vet[cont]=r.nextInt(50);
			
			if(vet[cont] == 0) {
				cont--;
			}
			cont++;
		}
		
		for(j = 0;j < 50;j++) {
			System.out.println("O valor da posição "+j+ " é: "+ vet[j]);
		}
		
		in.close();
	}
}