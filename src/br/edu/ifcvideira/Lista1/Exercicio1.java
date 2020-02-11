//1 – Faça um programa em JAVA para ler dois números inteiros, x e y, e imprimir o
//quociente e o resto da divisão inteira entre eles.

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int x;
		int y;
		double total;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo número:");
		y = Integer.parseInt(in.nextLine());
		
		total = (double) x / y;
		
		System.out.println("O valor do quociente é: " +total);
		
		total = x % y;
		
		System.out.println("O valor do resto é: " +total);
		
		in.close();
	}
}
