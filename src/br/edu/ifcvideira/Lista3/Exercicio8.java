//8 - Fa�a um programa em JAVA que apresente quatro op��es: (a) consulta saldo,
//(b) saque, (c) dep�sito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque
//ou dep�sito o valor do saldo deve ser atualizado e apresentado na tela.
package br.edu.ifcvideira.Lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double saldo = 0;
		double saque;
		double deposito = 0;
		String op ="zzz";
		
		while ( !op.equals("d")) {
			System.out.println("O que voc� deseja fazer?\n"
					+ "(a) Consulta saldo\n"
					+ "(b) Saque\n"
					+ "(c) Dep�sito\n"
					+ "(d) Sair");
			op = String.valueOf(in.nextLine());
			
			if (op.equals("a")) {
				System.out.println("O seu saldo �:"+df.format(saldo)+"\n");
			}
			else if ( op.equals("b")) {
				System.out.println("Quanto quer sacar?");
				saque = Double.parseDouble(in.nextLine());
				saldo -= saque;
				System.out.println("Seu saldo �:"+df.format(saldo));
			}
			else if (op.equals("c")) {
				System.out.println("Quanto deseja depositar?");
				deposito = Double.parseDouble(in.nextLine());
				saldo += deposito;
				System.out.println("Seu saldo �: R$"+df.format(saldo));
			}
			else {
				System.out.println("Opera��o finalizada, obrigado!");
				break;
			}
		}
		in.close();
	}
}
