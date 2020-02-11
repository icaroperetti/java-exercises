//12 (Vídeo Aula 7) - Faça um Programa que leia dois vetores com 10 elementos
//cada. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser
//compostos pelos elementos intercalados dos dois outros vetores

package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vet1[] = new int [10];
		int vet2[] = new int [10];
		int vet3[] = new int [20];
		int i=0;
		int j=0;
		
		for( i = 0; i < 10;i++) {
			System.out.println("Digite o valor da posição "+(i+1)+" do vetor 1");
			vet1[i] = Integer.parseInt(in.nextLine());		
		}

		for( i = 0; i < 10;i++) {
			System.out.println("Digite o valor da posição "+(i+1)+" do vetor 2");
			vet2[i] = Integer.parseInt(in.nextLine());		
		}
		
		for ( i = 0; i < 10;i++) {
			vet3[j] = vet1[i];
			j++;
			vet3[j] = vet2[i];
			j++;
		}
		
		System.out.println("Dados do vetor 3");
		for (j = 0; j < 20; j++) {
			System.out.println(vet3[j]);
		}
		in.close();
	}
}
