//5 - Fa�a um programa em JAVA que leia um vetor de 40 posi��es e atribua valor 0
//para todos os elementos que possu�rem valores negativos.

package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int [40];
		int i;
		
		for(i=0;i < 40;i++) {
			System.out.println("Digite o valor para a posi��o "+(i+1));
			vetor[i] = Integer.parseInt(in.nextLine());
			
			if (vetor[i] < 0) {
				vetor[i] = 0;
				System.out.println("O VETOR FOI IGUALADO A 0\n");
			}
		}
		for (i=0;i < 40;i++) {
			System.out.println("Os valores digitados foram: "+vetor[i]);
		}
		in.close();
	}
}
