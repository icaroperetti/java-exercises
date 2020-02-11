package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double massa;
		double densidade;
		double valor;
		double volume;
		
		System.out.println("Digite o valor do KG do leite:");
		valor = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a massa do leite:");
		massa = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a densidade:");
		densidade = Double.parseDouble(in.nextLine());
		
		volume = massa / densidade;
		
		
		if ( densidade < 1.14 ) {
			System.out.println("O leite é da categoria 1 -\n"
					+ "Seu volume é:"+volume + "\n"
							+ " Valor a receber: R$"+(valor * massa));
		}
		else if (( densidade >= 1.14) && (valor <= 1.2)) {
			System.out.println("O leite é da categoria 2 -\n"
					+ "O seu volume é:"+volume + "\n"
							+ "Valor a receber: R$"+(valor * massa));
		}
		else {
			System.out.println("O leite é da categoria 3 -\n"
					+ "Seu volume é:"+volume + "\n"
							+ "Valor a receber: R$"+(valor * massa));
		}
		in.close();
	}
}

