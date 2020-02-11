//14 - Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior
//valor.
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int matriz[][] = new int [4][4];
		int i;
		int j;
		int maiorValor=0;
		
		for ( i=0; i < 4;i++) {
			for (j=0;j < 4;j++) {
				System.out.println("Digite os valores da matriz ("+(i+1)+ "," + (j+1)+")");
				matriz[i][j] = Integer.parseInt(in.nextLine());
				
				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
				}
			}
		}
		System.out.println("O maior valor é: "+maiorValor);
		in.close();
	}
}
