//8 - Digitado um número inteiro entre 0 e 100, informar o quanto ele está distante
//de um determinado número chave, que deve ser solicitado no início do algoritmo.
//Exibir no final o número chave, número informado e a resposta. Caso o número
//chave ou o número a calcular seja menor que 0 ou maior que 100 informar que é
//inválido e encerrar o algoritmo. Ex.: Número chave=20, número digitado=15,
//resposta=5. Número chave=17, número digitado=20, resposta=3. A resposta
//deverá ser sempre um número positivo

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		int chave;
		int distanciaNumero=0;
		
		System.out.println("Digite o numero chave:");
		chave = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite um número entre 0 e 100:");
		numero = Integer.parseInt(in.nextLine());
		
		if (numero < chave) {
			System.out.println("A distância não poderá ser negativa!");
		}
		
		else if (numero > 100 && numero < 0 ) {
			System.out.println("Numero inválido: ");
		}
		else  {
			distanciaNumero = numero - chave;
			System.out.println("O numero digitado foi: "+numero+"\n"
					+"O numero chave é: "+chave+ "\n"+ "A distância é: "+distanciaNumero);
		}
		in.close();
	}
}
