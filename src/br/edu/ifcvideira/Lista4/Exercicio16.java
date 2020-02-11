//16 - Leia uma matriz 50 x 2, onde cada coluna corresponde a um lado de um
//triangulo retângulo. Declare um vetor que contenha a área dos respectivos
//triângulos e o escreva. Fórmula: (b * h / 2)

package br.edu.ifcvideira.Lista4;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double matriz[][] = new double[50][2];
		double area[] = new double[50];
		int i;
		int j;
		
		for (i = 0; i < 50; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("Digite os valores do triangulo :");
				matriz[i][j] = Double.parseDouble(in.nextLine());
				area[i] = (matriz[i][0] * matriz[i][1]) / 2;
			}
			System.out.print("A área do triângulo é: "+df.format(area[i])+"\n");
		}
		in.close();
	}
}
