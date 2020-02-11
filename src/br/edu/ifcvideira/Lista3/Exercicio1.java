//1 – Faça um programa em JAVA que lê dois números inteiros do teclado, testa se
//o primeiro é menor que o segundo, se for imprime todos os números do intervalo
//entre eles.

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo número: ");
		numero2 = Integer.parseInt(in.nextLine());
		
		if (( numero1+1)< numero2) {
			while (numero1 < (numero2 - 1)) {
				numero1++;
				System.out.println(numero1);
			}	
		}
		else {
			System.out.println("Não foi possivel imprimir os valores dos intervalos");
		}
		in.close();
	}
}
