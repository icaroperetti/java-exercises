//8 - Fa�a um programa em JAVA que leia um vetor de 50 posi��es e o compacte,
//ou seja, elimine as posi��es com valor zero avan�ando uma posi��o, com os com
//os valores subsequentes do vetor. Dessa forma todos �zeros� devem ficar para as
//posi��es finais do vetor.

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
			System.out.println("O valor da posi��o "+j+ " �: "+ vet[j]);
		}
		
		in.close();
	}
}