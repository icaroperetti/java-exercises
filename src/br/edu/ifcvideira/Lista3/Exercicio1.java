//1 � Fa�a um programa em JAVA que l� dois n�meros inteiros do teclado, testa se
//o primeiro � menor que o segundo, se for imprime todos os n�meros do intervalo
//entre eles.

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = Integer.parseInt(in.nextLine());
		
		if (( numero1+1)< numero2) {
			while (numero1 < (numero2 - 1)) {
				numero1++;
				System.out.println(numero1);
			}	
		}
		else {
			System.out.println("N�o foi possivel imprimir os valores dos intervalos");
		}
		in.close();
	}
}
