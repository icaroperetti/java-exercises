//6 - Implemente um programa que solicite ao usuário uma frase. Apresente a frase
//informada pelo usuário substituindo todos os caracteres ’a’ por ’*’. Ex: Frase: Ana
//foi a boate.
//Exiba: An* foi * bo*te. Dica: utilize os métodos da classe StringBuilder
package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase;
		
		System.out.println("Digite a frase");
		frase = String.valueOf(in.nextLine());
		
		frase = frase.replace("a", "*");
		frase = frase.replace("A", "*");
		frase = frase.replace("Á", "*");
		frase = frase.replace("À", "*");
		frase = frase.replace("á", "*");
		frase = frase.replace("à", "*");
		frase = frase.replace("ã", "*");
		frase = frase.replace("Ã", "*");
		
		System.out.println(frase);
		
		in.close();
	}
}
