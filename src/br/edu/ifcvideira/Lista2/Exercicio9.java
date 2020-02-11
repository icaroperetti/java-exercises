//9 - Ler 3 valores e escrever a soma dos 2 maiores (Considerando
//valores distintos).

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		
		System.out.println("Digite o primeiro valor:");
		valor1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo valor:");
		valor2 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o terceiro valor:");
		valor3 = Integer.parseInt(in.nextLine());
		
		if ((valor1 < valor2 ) && (valor1 < valor3 )) {
			System.out.println("A soma dos 2 maiores valores é:"+(valor2 + valor3));
		}
		else if (valor2 < valor3) {
			System.out.println("A soma dos 2 maiores valores é:"+(valor1 + valor3));
		}
		else {
			System.out.println("A soma dos 2 maiores valores é:"+(valor1 + valor2));
		}
		in.close();
	}
}