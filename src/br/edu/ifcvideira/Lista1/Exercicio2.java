//2 - Faça um programa em Java que lê três números reais do teclado e apresenta
//na tela a média destes números.

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		double numero1;
		double numero2;
		double numero3;
		double media;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		numero1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o segundo número: ");
		numero2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o terceiro número: ");
		numero3 = Double.parseDouble(in.nextLine());
		
		media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("A média é:" + media);
		
		in.close();
	}
}
