//Leia uma matriz 8 x 8 e a transforme numa matriz triangular inferior ,
//atribuindo zero a todos os elementos acima da diagonal principal, escrevendo-a ao
//final.

package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int matriz[][] = new int [8][8];
		int i;
		int j;
		
		for( i=0; i < 8;i++) {
			for(j=0; j < 8;j++) {
				if ((i - j) < 0) {
					matriz[i][j] = 1;
				}
			}
		}
		for(i = 0; i < 8;i++) {
			for (j = 0;j < 8;j++) {
				System.out.print(matriz[i][j]+"   ");
			}
			System.out.println();
			in.close();
		}
	}
}