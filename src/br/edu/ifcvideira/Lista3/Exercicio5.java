//5 - Número primo é aquele que só é divisível por ele mesmo e por 1. Faça um
//programa em JAVA que determine e escreva os números primos compreendidos
//entre 100 e 1000.
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		int cont=2;
		int div=0;
		
		for(num = 100; num < 1000; num++) {
			while (cont < (num-1)) {
				if (num % cont == 0) {
					//System.out.println("O número "+num+" não é primo");
					div = 1;
					break;
			}
			else {
				cont++;
			}	
		}
			if (div == 0) {
				System.out.println("O número "+num+ " é primo");
			}
			div = 0;
			cont=2;
		}
		in.close();
	}
}
