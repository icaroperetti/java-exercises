//5 - Implemente um programa que solicite ao usu�rio uma frase e inverta a ordem
//das palavras. Ex: Frase: aula at� meio dia. Exiba: dia meio at� aula. Monte a nova
//String, utilizando a classe StringBuilder e o seu m�todo append().
package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String frase;
		String guardar [];
		StringBuilder inverter = new StringBuilder();
		int i;
		
		System.out.println("Escreva a sua frase: ");
		frase = String.valueOf(in.nextLine());
		
		 guardar = frase.split(" ");
		
		for ( i = guardar.length - 1; i >= 0;i--) {
			inverter.append(guardar[i] + " ");
		}
		System.out.println(inverter);
		in.close();
	}
}
