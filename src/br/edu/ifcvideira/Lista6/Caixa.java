package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class Caixa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		int op;
		double valor;
		
		for(;;) {
			System.out.println("Escolha uma opção\n"
					+ "1 - Deposito\n"
					+ "2 - Saque\n"
					+ "3 - Consultar saldo\n"
					+ "4 - Sair");
			op = Integer.parseInt(in.nextLine());
			
			if(op == 1) {
				//Deposito
				System.out.println("Qual o valor deseja depositar?: ");
				valor = Double.parseDouble(in.nextLine());
				
				cc.deposito(valor);
			}
			else if (op == 2) {
				//Saque
				System.out.println("Qual o valor deseja sacar?: ");
				valor = Double.parseDouble(in.nextLine());
				
				if(valor > cc.getSaldo()) {
					System.out.println("Saldo insuficiente!\n");
				}
				else {
					cc.saque(valor);
				}
			}
			else if (op == 3) {
				//Saldo
				System.out.println("Seu saldo é:"+cc.getSaldo());
			}
			else if (op == 4) {
				break;
			}
		}
		in.close();
	}
}
