package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade=0;
		int cont=0;
		double media=0;
		
		System.out.println("Digite a idade:");
		idade = Integer.parseInt(in.nextLine());
		
		while (idade > 0) {
			media+= idade;
			System.out.println("Digite a idade:");
			idade = Integer.parseInt(in.nextLine());
			cont++;
		}
		media = (double) media / cont;
		System.out.println("A média é:" +media+ " e o numero de idades digitadas foram:" +cont);
		in.close();
	}
}