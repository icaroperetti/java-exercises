//19 - Faça um programa que calcule o determinante de uma matriz 3X3
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		int determinante;
		int diagPrinc1;
		int diagPrinc2;
		int diagPrinc3;
		int diagSec1;
		int diagSec2;
		int diagSec3;
		int i;
		int j;
		
		for(i = 0; i < 3;i++) {
			for(j = 0; j < 3;j++) {
				System.out.println("Digite os valores da matriz ("+(i+1)+ "," + (j+1)+")");
				matriz[i][j] = Integer.parseInt(in.nextLine());
			}
		}	
			//DiagonaisP
			diagPrinc1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
			diagPrinc2 = matriz[0][1] * matriz[1][2] * matriz[2][0];
			diagPrinc3 = matriz[0][2] * matriz[1][0] * matriz[2][1];
			
			//DiagonaisS
			diagSec1 = matriz[2][0] * matriz[1][1] * matriz[0][2];
			diagSec2 = matriz[2][1] * matriz[1][2] * matriz[0][0];
			diagSec3 = matriz[2][2] * matriz[1][0] * matriz[0][1];
			
			determinante = - (diagSec1 + diagSec2 + diagSec3) + (diagPrinc1 + diagPrinc2 + diagPrinc3);
			System.out.println("O determinante é: "+determinante);
			in.close();
	}
}
