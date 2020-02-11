//11 - Um caixa eletrônico opera com notas de 50, 10, 5 e 2. Como medida de
//segurança, a cada vez que o cliente deseja sacar dinheiro, o valor é dado de
//forma a fornecer um pequeno volume de notas (supondo que o cliente sempre
//esteja dentro do seu limite).
//Esta medida é feita para que a quantidade sacada não “faça muito volume”
//quando guardada pelo cliente. Por exemplo, se o cliente quiser sacar R$166,00
//não são dadas 83 notas de 2; são dadas 3 notas de 50, 1 nota de 10 e 3 notas de
//2. Assim, a resposta a ser impressa é 3 1 0 3.
//Faça um programa em JAVA que leia a quantia (valor inteiro positivo) a ser
//sacada e imprima as quantidades de notas de 50, 10, 5 e 2 a serem fornecidas
//aos clientes
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valorSaque=0;
		int nota50=0;
		int nota10=0;
		int nota5=0;
		int nota2=0;
		int resto50;
		int resto10;
		int resto5;
		
		do {
			
			System.out.println("Qual valor deseja sacar?:");
			valorSaque = Integer.parseInt(in.nextLine());
			
			if (valorSaque < 0) {
				System.out.println("Você não pode sacar um valor negativo! operação finalizada!");
				break;
			}
			if ( valorSaque == 1) {
				System.out.println("Por favor, tente um valor maior!");
				break;
			}
			if ( valorSaque == 0 ) {
				System.out.println("Você não pode sacar 0 reais!");
				break;
			}
			
			
			nota50 = valorSaque / 50;
			resto50 = valorSaque % 50;
			nota10 = resto50 / 10;
			resto10 = valorSaque % 10;
			nota5 = resto10 / 5;
			resto5 = resto10 % 5;
			nota2 = resto5 / 2;
			
			System.out.println("Notas de 50: "+nota50);
			System.out.println("Notas de 10: "+nota10);
			System.out.println("Notas de 5: "+nota5);
			System.out.println("Notas de 2: "+nota2+"\n");
			System.out.println("Caso queira finalizar a operação digite um numero negativo!\n");
		}while (valorSaque >= 2);
		in.close();
	}

}
