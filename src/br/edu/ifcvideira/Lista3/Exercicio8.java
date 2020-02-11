//8 - Faça um programa em JAVA que apresente quatro opções: (a) consulta saldo,
//(b) saque, (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque
//ou depósito o valor do saldo deve ser atualizado e apresentado na tela.
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
			System.out.println("O que você deseja fazer?\n"
					+ "(a) Consulta saldo\n"
					+ "(b) Saque\n"
					+ "(c) Depósito\n"
					+ "(d) Sair");
			op = String.valueOf(in.nextLine());
			
			if (op.equals("a")) {
				System.out.println("O seu saldo é:"+df.format(saldo)+"\n");
			}
			else if ( op.equals("b")) {
				System.out.println("Quanto quer sacar?");
				saque = Double.parseDouble(in.nextLine());
				saldo -= saque;
				System.out.println("Seu saldo é:"+df.format(saldo));
			}
			else if (op.equals("c")) {
				System.out.println("Quanto deseja depositar?");
				deposito = Double.parseDouble(in.nextLine());
				saldo += deposito;
				System.out.println("Seu saldo é: R$"+df.format(saldo));
			}
			else {
				System.out.println("Operação finalizada, obrigado!");
				break;
			}
		}
		in.close();
	}
}
