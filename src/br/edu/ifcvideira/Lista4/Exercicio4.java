//4 - Fa�a um programa em JAVA que leia um vetor de 20 posi��es e em seguida
//um valor X qualquer. Seu programa devera fazer uma busca do valor de X no
//vetor lido e informar a posi��o(�es) em que foi encontrado ou se n�o foi
//encontrado.
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int [20];
		int i;
		int x;
		int cont=0;
		
		for ( i = 0; i < 20; i++) {
			System.out.println("Digite o valor para a posi��o "+(i+1));
			vetor[i] = Integer.parseInt(in.nextLine());
		}
		System.out.println("Digite o valor que deseja encontrar:");
		x = Integer.parseInt(in.nextLine());
		
		for ( i=0; i < 20; i++) {
			if ( vetor[i] == x ) {
				System.out.println("O valor est� na posi��o "+i);
				cont++;
			}
		}
		System.out.println("Existem: "+cont+" valores iguais");
		in.close();
	}
}