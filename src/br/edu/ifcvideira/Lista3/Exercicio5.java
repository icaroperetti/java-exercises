//5 - N�mero primo � aquele que s� � divis�vel por ele mesmo e por 1. Fa�a um
//programa em JAVA que determine e escreva os n�meros primos compreendidos
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
					//System.out.println("O n�mero "+num+" n�o � primo");
					div = 1;
					break;
			}
			else {
				cont++;
			}	
		}
			if (div == 0) {
				System.out.println("O n�mero "+num+ " � primo");
			}
			div = 0;
			cont=2;
		}
		in.close();
	}
}
