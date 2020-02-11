//2 - As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia,
//e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa em JAVA
//que leia o n�mero de ma��s compradas, calcule e escreva o valor total da
//compra.


package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int quantidade;
		double valor;
		
		System.out.println("Digite a quantidade de ma�as que deseja comprar: ");
		quantidade = Integer.parseInt(in.nextLine());
		
		if (quantidade < 12 ) {
			valor = (double) quantidade * 0.30;
		}
		else  {
			valor = (double) quantidade * 0.25;
		}
		System.out.println("O valor a ser pago ser�:R$ "+df.format(valor));
		
		in.close();
	}
}
