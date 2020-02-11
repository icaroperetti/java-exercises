//7 - Faça um programa em JAVA que deve ficar lendo uma letra por vez do teclado
//até que o operador digite a letra x. Após o operador digitar x o programa deve
//apresentar na tela o número de vezes que o operador digitou dois caracteres
//iguais em sequencia

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String letAtual;
		String letAnterior;
		int contIgual=0;
		
		System.out.println("Digite uma letra:");
		letAnterior = String.valueOf(in.nextLine());
		
		for(;;) {
			System.out.println("Digite uma letra: (x para finalizar)");
			letAtual = String.valueOf(in.nextLine());
			
			if (letAtual.equals("x")) {
				break;
			}
			
			else if ( letAnterior.contentEquals(letAtual)) {
				contIgual++;
			}
			
			letAnterior = letAtual;
		}
		System.out.println("Foram digitadas: "+contIgual+" letras iguais");
		in.close();
	}

}
