//2 - Fa�a um programa em JAVA que l� um n�mero real do teclado e calcula o
//fatorial deste n�mero. (ex: 5! � igual a 5 * 4 * 3 * 2 * 1 = 120).
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o n�mero:");
		num = Integer.parseInt(in.nextLine());
		
		for (int i = num-1; i > 0; i--) {
			num = (num * i);
		}
		System.out.println("O fatorial �: "+num);
		in.close();
	}
}	
