//8 - Digitado um n�mero inteiro entre 0 e 100, informar o quanto ele est� distante
//de um determinado n�mero chave, que deve ser solicitado no in�cio do algoritmo.
//Exibir no final o n�mero chave, n�mero informado e a resposta. Caso o n�mero
//chave ou o n�mero a calcular seja menor que 0 ou maior que 100 informar que �
//inv�lido e encerrar o algoritmo. Ex.: N�mero chave=20, n�mero digitado=15,
//resposta=5. N�mero chave=17, n�mero digitado=20, resposta=3. A resposta
//dever� ser sempre um n�mero positivo

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
		
		System.out.println("Digite um n�mero entre 0 e 100:");
		numero = Integer.parseInt(in.nextLine());
		
		if (numero < chave) {
			System.out.println("A dist�ncia n�o poder� ser negativa!");
		}
		
		else if (numero > 100 && numero < 0 ) {
			System.out.println("Numero inv�lido: ");
		}
		else  {
			distanciaNumero = numero - chave;
			System.out.println("O numero digitado foi: "+numero+"\n"
					+"O numero chave �: "+chave+ "\n"+ "A dist�ncia �: "+distanciaNumero);
		}
		in.close();
	}
}
