//2 - Fa�a um programa em Java que l� tr�s n�meros reais do teclado e apresenta
//na tela a m�dia destes n�meros.

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		double numero1;
		double numero2;
		double numero3;
		double media;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		numero1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = Double.parseDouble(in.nextLine());
		
		media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("A m�dia �:" + media);
		
		in.close();
	}
}
