//5 - Escreva um programa em JAVA para ler uma temperatura em graus
//Fahrenheit, calcular e escrever o valor correspondente em graus Celsius.

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercico5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double celsius;
		double fahrenheit;
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		fahrenheit = Double.parseDouble(in.nextLine());
		
		celsius = ((fahrenheit - 32)/ 1.8);
		System.out.println("A temperatura em celsius é: " + celsius);
		
		in.close();
	}
}
